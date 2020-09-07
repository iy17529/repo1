package com.rapjoee.day19.demo01bufferedstream.outandin;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName:Demo01BufferedOutputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/21 13:06
 * Description:
 *
 * 缓冲流可以添加一个缓冲区【数组】，这样每次读写的时候，读写的不单单是单个字节/字符，效率会更高
 *
 * java.io.BufferedOutputStream extends java.io.OutputStream
 *      BufferedOutputStream ：字节缓冲输出流
 *
 *      继承了父类的共性成员方法：
 *           void close()
 *                     关闭此输出流并释放与此流有关的所有系统资源。
 *           void flush()
 *                     刷新此输出流并强制写出所有缓冲的输出字节。
 *           void write(byte[] b)
 *                     将 b.length 个字节从指定的 byte 数组写入此输出流。
 *           void write(byte[] b, int off, int len)
 *                     将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *           abstract  void write(int b)
 *                     将指定的字节写入此输出流。【由内存写入到硬盘】
 *
 *        构造器：
 *              BufferedOutputStream(OutputStream out)
 *                      创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *              BufferedOutputStream(OutputStream out, int size)
 *                      创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
 *             参数：OutputStream out：字节输出流流对象，可以传递FileOutputStream对象，给其添加一个缓冲股，提高写入效率
 *                  int size：指定size大小的数组作为缓冲区，没有此参数则为默认大小
 *
 *         使用步骤【重点】：
 *          1. 创建一个文件字节输出流对象FileOutputStream，构造器中绑定要写入的目的地
 *          2. 创建一个BufferedOutputStream对象，传递上面创建的FileOutputStream对象，提高其写效率
 *          3. 使用 BufferedOutputStream 对象的write方法，把数据写入到内部缓冲区中
 *          4. 使用 BufferedOutputStream 对象的flush方法，刷新数据到硬盘的文件中
 *          5. 释放资源【会调用flush方法刷新数据，所以第四步可以省略】
 *
 */
public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建一个文件字节输出流对象FileOutputStream，构造器中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("D:\\JavaSETestDirectory01\\FileWriterTest.txt", true);

        //2. 创建一个BufferedOutputStream对象，传递上面创建的FileOutputStream对象，提高其写效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3. 使用 BufferedOutputStream 对象的write方法，把数据写入到内部缓冲区中
        bos.write(new byte[]{'H', 'e', 'l', 'l', 'o'});

        //4. 使用 BufferedOutputStream 对象的flush方法，刷新数据到硬盘的文件中
        //5. 释放资源【会调用flush方法刷新数据，所以第四步可以省略】
        bos.flush();
        bos.close();
        fos.close();
    }
}
