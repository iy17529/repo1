package com.rapjoee.day20.demo01tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClassName:Demo01TCPClient
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 19:11
 * Description:
 *
 *  TCP通信的客户端:向服务器端发送连接请求，给服务器发送数据，读取服务器回写的数据
 *  表示客户端的类：Socket
 *          java.net.Socket  此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
 *                  套接字：包含了IP地址与端口号的网路单位
 *
 *      构造器：【可以使用带IP地址与端口号的】
 *            Socket(String host, int port)  创建一个流套接字并将其连接到指定主机上的指定端口号。
 *            参数：
 *                  String host：服务器主机的名称 / IP地址
 *                  int port：服务器的端口号
 *
 *       重要的成员方法：
 *              OutputStream getOutputStream()   返回此套接字的输出流。
 *              InputStream getInputStream()  返回此套接字的输入流。
 *              void close()  关闭此套接字。
 *
 *      客户端实现步骤：
 *          1、创建一个Socket对象，构造器中传递服务器的名称/IP地址，端口号
 *          2、使用Socket对象的 getOutputStream() 方法，获取网络字节输出流 getOutputStream 对象
 *          3、使用getOutputStream 对象的write方法，给服务器端发送消息
 *          4、使用Socket对象的 getInputStream() 方法，获取网络字节输入流 getInputStream 对象
 *          5、使用getInputStream 对象的 read 方法，读取服务器回写的消息
 *          6、释放资源【Socket】
 *
 *      注意！！
 *          1.客户端与服务器进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
 *          2. 当我们创建客户端对象Socket的时候，会去请求服务器，与服务器请求三次握手建立连接
 *                  如果服务器没有启动，会抛出异常【ConnectException: Connection refused: connect】
 *                  如果启动了，可以进行交互
 *
 */
public class Demo01TCPClient {
    public static void main(String[] args) throws IOException {
        //1、创建一个Socket对象，构造器中传递服务器的名称/IP地址，端口号
        Socket client0 = new Socket("127.0.0.1", 9426);

        //2、使用Socket对象的 getOutputStream() 方法，获取网络字节输出流 getOutputStream 对象
        //3、使用getOutputStream 对象的write方法，给服务器端发送消息
        OutputStream client0os = client0.getOutputStream();
        client0os.write("你好服务器端！！请求通信".getBytes() );

        //4、使用Socket对象的 getInputStream() 方法，获取网络字节输入流 getInputStream 对象
        //5、使用getInputStream 对象的 read 方法，读取服务器回写的消息
        InputStream client0IS = client0.getInputStream();
        byte[] bytes = new byte[1024];
        int len0 = client0IS.read(bytes);
        System.out.println(new String(bytes, 0 ,len0));

        /*//添加一个套接字正常终止序列，表示上述信息【你好服务器端！！请求通信】传输终止
        client0.shutdownOutput();
        int len = 0;
        while ((len = client0IS.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }*/

        //6、释放资源【Socket】
        client0.close();
    }
}
