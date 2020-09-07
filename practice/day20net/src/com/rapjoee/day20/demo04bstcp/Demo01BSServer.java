package com.rapjoee.day20.demo04bstcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:Demo01BSServer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 13:33
 * Description:
 *
 * //BS服务器，待扩展...
 *
 */
public class Demo01BSServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket， 指定端口号
        ServerSocket BSServer = new ServerSocket(8080);

        //浏览器解析回写的HTML页面，页面中如果包含图片
        // 浏览器会单独另开一个线程，读取服务器的图片
        //所以我们得让服务器一直处于监听状态。客户端请求一次，服务器就回写一次
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //使用accept方法获取客户端请求的Socket对象，并获取InputStream字节输入流对象
                        Socket client = BSServer.accept();
                        InputStream inputStream = client.getInputStream();

                        //想读第一行，转换为字符缓冲输入流对象，使用readLine()方法
                        BufferedReader bis = new BufferedReader(new InputStreamReader(inputStream));
                        String s = bis.readLine();      //请求的第一行

                        //第一行进行切割与截取，只要中间路径部分
                        String[] arr = s.split(" ");
                        String htmlPath = arr[1].substring(1);

                        //创建一个本地字节输入流，构造器绑定要读取的HTML路径
                        FileInputStream fis = new FileInputStream(htmlPath);

                        //使用Socket对象的getOutputStream 获取字节输出流对象
                        OutputStream outputStream = client.getOutputStream();

                        /***************下面是固定的几行写法*********/
                        outputStream.write("HTTP/1/1 200 OK\r\n".getBytes());
                        outputStream.write("Content-Type:text/html\r\n".getBytes());
                        //必须要写入空行，否则浏览器不解析
                        outputStream.write("\r\n".getBytes());
                        /*****************************************/

                        //一读一写复制文件，把服务器的HTML文件写到客户端
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            outputStream.write(bytes, 0 ,len);
                        }

                        //释放资源
                        fis.close();
                        client.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        //BSServer.close();
    }
}
