package com.rapjoee.day20.demo03practice.demo02practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * ClassName:FileUploadServer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 9:44
 * Description:
 * <p>
 * 案例优化
 * <p>
 * 文件上传服务器端
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象
        ServerSocket server0 = new ServerSocket(9426);
        //创建本地字节输出流对象，接收到客户端的数据写入到硬盘上，构造器绑定目的地本地文件

        //使用while循环让服务器一直开着
        //使用多线程，让一个客户端连接时，开启一个线程，这样可以提高效率
                //注意事项！实现接口方式时，重写run方法，run方法没有抛出异常，所以重写方法不能声明异常，只能try catch

        while (true) {
            //使用accept方法获取客户端Socket对象
            Socket client0 = server0.accept();


            new Thread(new Runnable() {     //有一个客户端发送，就开启一个线程
                @Override
                public void run() {

                    try {

                        /*为了防止后来上传的数据会把之前的数据覆盖掉，自定义文件名
                            规则：使用一个固定字符串前缀 +  系统当前之间毫秒值 + 0~9999之间的随机数作为文件命名*/
                        File directoryUp = new File("D:\\JavaSETestDirectory01\\upload");
                        String fileName = "rapjoee" + System.currentTimeMillis() + new Random().nextInt(9999) + ".txt";
                        BufferedOutputStream bos = new BufferedOutputStream(
                                new FileOutputStream(directoryUp + "\\" + fileName));

                        //使用客户端Socket对象进行获取字节输入流对象，读取客户端发送的数据
                        InputStream inputStream = client0.getInputStream();
                        byte[] bytes = new byte[1024];      //使用缓冲数组提高效率
                        int len0 = 0;
                        while ((len0 = inputStream.read(bytes)) != -1) {
                            System.out.println(new String(bytes, 0, len0));
                            //把客户端发送的文件数据写入本地硬盘中
                            bos.write(bytes, 0, len0);
                        }

                        //使用客户端Socket对象进行获取字节输出流对象，给客户端回写数据
                        OutputStream outputStream = client0.getOutputStream();
                        outputStream.write("上传成功~~".getBytes());

                        //释放资源
                        bos.close();
                        client0.close();

                    } catch (IOException e) {
                        System.out.println(e);
                    }

                }
            }).start();
        }
        //server0.close();      那么服务器就不用关闭了
    }
}
