package com.rapjoee.day18.demo01outputstream;

/**
 * ClassName:demo01outputstream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 11:17
 * Description:
 *
 *       Input【i】:    硬盘-->内存     也叫读取 【输入：把硬盘的数据，读取到内存中使用】
 *       Output【o】:   内存-->硬盘     也叫写入 【输出：把内存的数据，写入到硬盘中保存】
 *       流：数据（字符、字节） 1字符 = 2字节，  1字节 = 8二进制位【bit】
 *
 *            分类：
 *                            输入流                         输出流
 *              字节流     字节输入流【InputStream】        字节输出流【OutputStream】
 *              字符流     字符输入流【Reader】             字符输出流【Writer】
 *
 *           一切皆为字节：字节流可以读取任意文件
 *
 *      java.io.OutputStream 此抽象类是表示输出字节流的所有类的超类，将指定的字节信息写出到目的地
 *      定义了字节输出流的基本共性方法
 *         void close()
 *                   关闭此输出流并释放与此流有关的所有系统资源。
 *         void flush()
 *                   刷新此输出流并强制写出所有缓冲的输出字节。
 *         void write(byte[] b)
 *                   将 b.length 个字节从指定的 byte 数组写入此输出流。
 *         void write(byte[] b, int off, int len)
 *                   将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *         abstract  void write(int b)
 *                   将指定的字节写入此输出流。【由内存写入到硬盘】
 *
 *       注意：完成流的操作时，必须使用close()方法，释放系统资源
 *
 */
public class demo01OutputStream {
}
