package com.rapjoee.day20.demo01tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:Demo02TCPServer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 20:32
 * Description:
 * 实现服务器端
 *      它要接收客户端的请求与数据，并回写客户端数据      【必须先运行服务器端】
 *
 *    java.net.ServerSocket 此类实现服务器套接字。服务器套接字等待请求通过网络传入
 *
 *      明确： 必须得知道事哪个客户端对象请求的服务器，所以使用accept方法获取
 *
 *      构造器：【启动的时候得向系统要一个指定的端口，方便客户端找】
 *          ServerSocket(int port)  创建绑定到特定端口的服务器套接字。【指定端口】
 *
 *      特有成员方法：
 *               Socket accept()  侦听并接受到此套接字的连接。
 *                      有客户端请求连接得接受，返回接受的客户端对象
 *
 *      实现步骤：
 *          1、创建 ServerSocket 对象，构造器指定本服务器端口号
 *          2、使用 ServerSocket 对象的accept方法接收来自客户端的连接请求，返回值是客户端 Socket对象
 *          3、使用Socket对象的 getInputStream() 方法，获取网络字节输入流 getInputStream 对象
 *          4、使用getInputStream 对象的 read 方法，读取客户端发送的消息
 *          5、使用Socket对象的 getOutputStream() 方法，获取网络字节输出流 getOutputStream 对象
 *          6、使用getOutputStream 对象的write方法，给客户端回写消息
 *          7、释放资源【客户端的Socket以及自己的Socket】
 */
public class Demo02TCPServer {
    public static void main(String[] args) throws IOException {
        //1、创建 ServerSocket 对象，构造器指定本服务器端口号
        ServerSocket server = new ServerSocket(9426);

        //2、使用 ServerSocket 对象的accept方法接收来自客户端的连接请求，返回值是客户端 Socket对象
        Socket clientSoc = server.accept();

        //3、使用Socket对象的 getInputStream() 方法，获取网络字节输入流 getInputStream 对象
        //4、使用getInputStream 对象的 read 方法，读取服务器回写的消息
        InputStream inputStream = clientSoc.getInputStream();
        byte[] bytes = new byte[1024];
        int len0 = inputStream.read(bytes);
        System.out.println(new String(bytes, 0 ,len0));
        /*int len1 = 0;
        while ((len1 = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0 ,len1));
        }*/

        //5、使用Socket对象的 getOutputStream() 方法，获取网络字节输出流 getOutputStream 对象
        //6、使用getOutputStream 对象的write方法，给服务器端发送消息
        OutputStream outputStream = clientSoc.getOutputStream();
        outputStream.write("请求收到了！！进行数据传输~~".getBytes());

        //7、释放资源【客户端的Socket以及自己的Socket】
        clientSoc.close();
        server.close();
    }
}
