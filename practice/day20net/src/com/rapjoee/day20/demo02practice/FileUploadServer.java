package com.rapjoee.day20.demo02practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:FileUploadServer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 9:44
 * Description:
 *
 * 文件上传服务器端
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象
        ServerSocket server0 = new ServerSocket(9426);
        //创建本地字节输出流对象，接收到客户端的数据写入到硬盘上，构造器绑定目的地本地文件
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\JavaSETestDirectory01\\upload\\Server.txt"));
        //FileOutputStream bos = new FileOutputStream("D:\\JavaSETestDirectory01\\upload\\Server.txt");

        //使用accept方法获取客户端Socket对象
        Socket client0 = server0.accept();

        //使用客户端Socket对象进行获取字节输入流对象，读取客户端发送的数据
        InputStream inputStream = client0.getInputStream();
        byte[] bytes = new byte[1024];      //使用缓冲数组提高效率
        int len0 = 0;
        while ((len0 = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0 ,len0));
            //把客户端发送的文件数据写入本地硬盘中
            bos.write(bytes, 0 ,len0);
        }

        //使用客户端Socket对象进行获取字节输出流对象，给客户端回写数据
        OutputStream outputStream = client0.getOutputStream();
        outputStream.write("上传成功~~".getBytes());

        //释放资源
        bos.close();
        client0.close();
        server0.close();
    }
}
