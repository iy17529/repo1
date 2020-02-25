package com.rapjoee.day19.demo01bufferedstream.writerandread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:Demo01BufferedWriter
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/21 14:17
 * Description:
 *
 * java.io.BufferedWriter extends Writer
 *      字符缓冲输出流
 *      继承自父类的成员方法：
 *            abstract  void close()
 *                    关闭此流，但要先刷新它。
 *            abstract  void flush()
 *                    刷新该流的缓冲。
 *            void write(char[] cbuf)
 *                    写入字符数组。
 *            abstract  void write(char[] cbuf, int off, int len)
 *                    写入字符数组的某一部分。
 *            void write(int c)
 *                    写入单个字符。
 *            void write(String str)
 *                    写入字符串。
 *            void write(String str, int off, int len)
 *                    写入字符串的某一部分。
 *
 *        构造器：
 *              BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *              BufferedWriter(Writer out, int sz) 创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
 *
 *           参数：
 *              Writer out：字符输出流，可以传递 FileWriter，缓冲流给其增加一个缓冲区，提高FileWriter写入效率
 *              int sz：指定缓冲区的大小，不指定则默认大小
 *
 *        特有的成员方法：
 *              void newLine()  写入一个行分隔符。写入一个行分隔符，会根据不同的操作系统，写入不同的分隔符
 *
 *      使用步骤：
 *          1. 创建一个字符缓冲输出流 BufferedWriter 对象，构造器中传递字符输出流对象
 *          2. 使用BufferedWriter对象的write方法，把数据写入到内存缓冲区中
 *          3. 使用flush方法把内存缓冲区的数据刷新到硬盘文件中
 *          4. 释放资源
 */
public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1. 创建一个字符缓冲输出流 BufferedWriter 对象，构造器中传递字符输出流对象【续写】
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaSETestDirectory01" +
                "\\BufferedWriterTest.txt", true));

        //2. 使用BufferedWriter对象的write方法，把数据写入到内存缓冲区中
        bufferedWriter.write("哈哈哈哈");
        bufferedWriter.newLine();       //换行符
        bufferedWriter.write("hhhh".toCharArray());
        bufferedWriter.newLine();       //换行符
        bufferedWriter.write(74);

        //3. 使用flush方法把内存缓冲区的数据刷新到硬盘文件中
        //4. 释放资源
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
