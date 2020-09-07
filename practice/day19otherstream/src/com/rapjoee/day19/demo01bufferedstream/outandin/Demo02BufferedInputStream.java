package com.rapjoee.day19.demo01bufferedstream.outandin;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
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
 * java.io.BufferedInputStream extends java.io.InputStream
 *      BufferedInputStream ：字节缓冲输入流
 *
 *      继承了父类的共性成员方法：
 *      abstract  int read()   从输入流中读取数据的下一个字节。
 *      int read(byte[] b)   从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *      int read(byte[] b, int off, int len)   将输入流中最多 len 个数据字节读入 byte 数组。
 *      void close()  关闭此输入流并释放与该流关联的所有系统资源。
 *
 *        构造器：
 *              BufferedInputStream(InputStream in)
 *                  创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *              BufferedInputStream(InputStream in, int size)
 *                  创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *             参数：InputStream in：字节输入流流对象，可以传递FileInputStream对象，给其添加一个缓冲区，提高读取效率
 *                     int size：指定size大小的数组作为缓冲区，没有此参数则为默认大小
 *
 *         使用步骤【重点】：
 *          1. 创建一个文件字节输出流对象FileInputStream，构造器中绑定要读取的数据源
 *          2. 创建一个BufferedInputStream对象，传递上面创建的FileInputStream对象，提高其写效率
 *          3. 使用 BufferedInputStream 对象的read方法，把数据写入到内部缓冲区中
 *          4. 释放资源
 *
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建一个文件字节输出流对象FileInputStream，构造器中绑定要读取的源文件
        FileInputStream fis = new FileInputStream("D:\\JavaSETestDirectory01\\FileWriterTest.txt");

        //2. 创建一个BufferedInputStream对象，传递上面创建的FileOutputStream对象，提高其读取效率
        BufferedInputStream bis = new BufferedInputStream(fis);

        //3. 使用 BufferedInputStream 对象的write方法，读取数据
        int len = 0;
        /*//int read()，一次读一个字节
        while ((len = bis.read()) != -1) {
            System.out.print((char) len);
        }*/

        //一次读取多个字节
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0 ,len));
        }


        //4. 释放资源，关闭缓冲流也就关闭了基本输入流
        bis.close();
    }
}
