package com.rapjoee.day19.demo04printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * ClassName:Demo01PrintStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 17:23
 * Description:
 *
 * java.io.PrintStream extends OutputStream：  字节打印流
 *      特点：
 *          1. PrintStream 永远不会抛出 IOException
 *          2. 只负责数据输出，不负责数据输入，即只能写入数据，不可读取
 *          3. 特有的方法为其他的流添加功能
 *  *              void print(任意类型)  打印
 *  *              void println(任意类型并换行)  打印并换行
 *
 *      构造器：
 *          PrintStream(File file) 创建具有指定文件且不带自动行刷新的新打印流。
 *                  输出目的地是一个文件
 *          PrintStream(OutputStream out) 创建新的打印流。
 *                  输出目的地是一个字节输出流
 *          PrintStream(String fileName) 创建具有指定文件名称且不带自动行刷新的新打印流。
 *                  输出目的地是一个文件路径
 *
 *      继承自父类字节流的方法：
 *          void close()
 *                    关闭此输出流并释放与此流有关的所有系统资源。
 *          void flush()
 *                    刷新此输出流并强制写出所有缓冲的输出字节。
 *          void write(byte[] b)
 *                    将 b.length 个字节从指定的 byte 数组写入此输出流。
 *          void write(byte[] b, int off, int len)
 *                    将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *          abstract  void write(int b)
 *                    将指定的字节写入此输出流。【由内存写入到硬盘】
 *
 *      注意！！如果使用继承自父类的 write方法写数据，则查看数据时会比对编码表【比如写入97, 读取时a】
 *              如果使用自己的特有 print/println 方法写数据，则查看数据时不是【写入什么样 读取什么样】
 *
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println("HelloWorld");
        //创建一个打印流，目的地是一个文件路径
        PrintStream ps = new PrintStream("D:\\JavaSETestDirectory01\\a.txt");   //路径不正确会抛出异常

        //使用父类write方法写入
        ps.write(97);                   //在a.txt中写入a

        //使用特有方法print写入
        ps.print("你好啊哈哈哈哈打印流");     //在a.txt中写入你好啊哈哈哈哈打印流
        ps.println("字符串换行");
        ps.println(8.8);
        ps.println(678);
        ps.println('Y');
        ps.println(true);

        //释放资源
        ps.close();
    }
}
