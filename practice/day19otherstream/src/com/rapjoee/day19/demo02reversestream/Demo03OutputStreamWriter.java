package com.rapjoee.day19.demo02reversestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * ClassName:Demo03OutputStreamWriter
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 12:49
 *
 * Description:
 *
 * java.io.OutputStreamWriter extends Writer  字符输出转换流
 *      【编码】OutputStreamWriter 是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节
 *              把看得懂的编码为看不懂的
 *
 *      继承自父类的共性方法：
 *            abstract  void close()  关闭此流，但要先刷新它。
 *            abstract  void flush()  刷新该流的缓冲。
 *            void write(char[] cbuf)  写入字符数组。
 *            abstract  void write(char[] cbuf, int off, int len)  写入字符数组的某一部分。
 *            void write(int c)  写入单个字符。
 *            void write(String str)  写入字符串。
 *            void write(String str, int off, int len)  写入字符串的某一部分。
 *
 *      构造器：
 *          OutputStreamWriter(OutputStream out)
 *                  创建使用默认字符编码的 OutputStreamWriter。
 *          OutputStreamWriter(OutputStream out, String charsetName)
 *                  创建使用指定字符集的 OutputStreamWriter。
 *
 *          参数：
 *              OutputStream：字节输出流，可以用来写转换之后的字节到文件中
 *              String charsetName：指定的编码表名称，不区分大小写，UTF-8/utf-8...不指定默认为UTF-8
 *
 *       使用步骤：
 *          1. 创建一个 OutputStreamWriter 对象，构造方法中传递 OutputStream 对象与指定编码表
 *          2. 使用 OutputStreamWriter 对象的write方法，把数据写入到内存缓冲区中【编码】
 *          3. 使用flush方法把内存缓冲区的数据刷新到硬盘文件中【使用字节流写字节的过程】
 *          4. 释放资源
 */
public class Demo03OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 OutputStreamWriter 对象，构造方法中传递 OutputStream 对象与指定编码表
        OutputStreamWriter osw = new OutputStreamWriter(
                        new FileOutputStream("D:\\JavaSETestDirectory01\\我是GBK编码的文件" + ".txt"), "gbk");
        OutputStreamWriter osw2 = new OutputStreamWriter(
                        new FileOutputStream("D:\\JavaSETestDirectory01\\我是utf-8编码的文件" + ".txt"), "utf-8");

        //2. 使用 OutputStreamWriter 对象的write方法，把数据写入到内存缓冲区中【编码】
        osw.write("字符转换流测试字符串gbk\r\n");
        osw2.write("字符转换流测试字符串utf-8\r\n");

        //3. 使用flush方法把内存缓冲区的数据刷新到硬盘文件中【使用字节流写字节的过程】
        //4. 释放资源
        osw.flush();
        osw2.flush();
        osw.close();
        osw2.close();
    }
}
