package com.rapjoee.day18.demo04writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:Demo01Writer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 15:27
 * Description:
 *
 * java.io.Writer下的Writer是写入字符流的【抽象类】，将指定的字符信息写入到目的地，定义了字符输出流的基本共性方法
 *          abstract  void close()
 *                  关闭此流，但要先刷新它。
 *          abstract  void flush()
 *                  刷新该流的缓冲。
 *          void write(char[] cbuf)
 *                  写入字符数组。
 *          abstract  void write(char[] cbuf, int off, int len)
 *                  写入字符数组的某一部分。
 *          void write(int c)
 *                  写入单个字符。
 *          void write(String str)
 *                  写入字符串。
 *          void write(String str, int off, int len)
 *                  写入字符串的某一部分。
 *
 *     其子类
 *     java.io.FileWriter extends java.io.OutputStreamWriter extends java.io.Writer
 *
 *     FileWriter：
 *     作用：把内存中数据以字符的形式写入到硬盘中
 *
 *     构造器：
 *      FileWriter(File file)
 *           根据给定的 File 对象构造一个 FileWriter 对象。
 *      FileWriter(String fileName)
 *           根据给定的文件名构造一个 FileWriter 对象。
 *
 *       参数：写入数据的目的地
 *       File file：目的地是一个文件File对象
 *       String fileName：目的地是一个文件的路径
 *
 *      构造器的作用：
 *          1. 创建一个FileWriter对象
 *          2. 根据构造器中传递的文件/路径，在硬盘中创建一个文件
 *          3.把创建的对象的应用指向硬盘中创建的文件
 *
 *      字符输出流的使用步骤:
 *      1. 创建FileWriter对象，绑定构造器传递的文件路径
 *      2.使用FileWriter的方法write()，把数据写入到内存缓冲区中【有一个字符转换为字节的过程】
 *      3. 使用flush()方法，把内存缓冲区的数据是，刷新到文件中
 *      4. 使用close()方法，释放资源【先把内存缓冲区中的数据刷新到文件中，所以可以没有第三步】
 *
 *     注意！！write方法执行后不调用flush方法或者close方法不会把数据【现在在内存缓冲区】刷新到硬盘中，程序结束，数据丢失
 *
 *
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
         // 1. 创建FileWriter对象，绑定构造器传递的文件路径
        FileWriter fw = new FileWriter("D:\\JavaSETestDirectory01\\FileWriterTest.txt");
        //2.使用FileWriter的方法write()，把数据写入到内存缓冲区中【有一个字符转换为字节的过程】

        //写入单个字节
        fw.write(48);
        //写入一个字符数组
        fw.write(new char[]{'A', 'B', 'C', 'D'});
        //写入一个字符串
        fw.write("你好啊");

        //3. 使用flush()方法，把内存缓冲区的数据是，刷新到文件中
        fw.flush();

        //4. 使用close()方法，释放资源【先把内存缓冲区中的数据刷新到文件中，所以可以没有第三步】
        fw.close();
    }
}
