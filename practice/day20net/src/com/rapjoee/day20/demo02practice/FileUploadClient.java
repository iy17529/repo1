package com.rapjoee.day20.demo02practice;

import java.io.*;
import java.net.Socket;

/**
 * ClassName:FileUploadClient
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 9:27
 * Description:
 *
 * 文件上传案例：
 *      1.【客户端】输入流，读取硬盘文件数据到程序中
 *      2.【客户端】输出流，把读取到的数据发送给服务器端
 *      3.【服务器端】输入流，读取客户端发送的数据到服务器程序
 *      4.【服务器端】输出流，写入读取到的数据到服务器硬盘文件中
 *      5.【服务器端】输出流，给客户端回写一个【上传成功！！】
 *      6.【客户端】输入流，读取服务器端回写的数据
 *      7. 释放资源
 *
 *   注意！！客户端读取本地文件 / 服务器写入数据到服务器硬盘 使用的是自己创建的流，是本地流
 *      客户端发送数据与服务器端接收数据流对象是获取的，是网络流
 *
 *
 *   注意2！！文件读取的read方法，在输入数据可用、检测到流末尾或者抛出异常前，此方法一直阻塞。
 *          因为本地流读取本地文件数据时读取不到结束标记【结束标记作为结束的标记没有被发送】，所以服务器端自然也没办法读取到结束标记
 *              客户端与服务器端都进入了阻塞状态
 *
 *         解决办法：使用Socket类的【void shutdownOutput()  禁用此套接字的输出流】提供一个结束标记
 *                      shutdownOutput：禁用此套接字的输出流。对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
 *
 *  实现文件上传客户端
 *
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        //创建字节输出流，读取硬盘的文件到数组中，构造器中绑定要读取的本地文件
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\JavaSETestDirectory01\\Client.txt"));

        //创建客户端Socket对象，指定端口号与ip
        Socket client0 = new Socket("127.0.0.1", 9426);

        //获取其字节输入流对象，可以进行读取服务器端回写的数据
        //获取其字节输出流对象，可以进行发送数据
        OutputStream outputStream = client0.getOutputStream();
        InputStream inputStream = client0.getInputStream();

        //发送程序中本地输入流读取到的数据
        byte[] bytes = new byte[1024];
        int len = 0;
        outputStream.write("你好服务器，请求通信！\n\n上传数据如下：".getBytes());
        while ((len = bis.read(bytes)) != -1) {
            outputStream.write(bytes, 0 , len);
        }

        //上面的循环里read方法以文件的结束标记-1 结束，但是read方法不是读取到此结束标记，也就不能把标记发送给服务器端
        //导致服务器端read方法读取不到结束标记，进入阻塞状态，进而下面循环里的read方法也进入阻塞状态
        //解决办法，shutdownOutput方法提供一个结束标记，让服务器端可以读取到
        client0.shutdownOutput();

        //读取服务器端回写的数据
        byte[] bytes1 = new byte[1024];
        int len1 = 0;
        while ((len1 = inputStream.read(bytes1)) != -1) {
            System.out.println(new String(bytes1, 0 ,len1));
        }

        //释放资源
        bis.close();
        client0.close();
    }
}
