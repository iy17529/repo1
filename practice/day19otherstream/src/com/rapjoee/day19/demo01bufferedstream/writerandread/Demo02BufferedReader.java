package com.rapjoee.day19.demo01bufferedstream.writerandread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName:Demo02BufferedReader
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/21 15:24
 * Description:
 *
 * java.io.BufferedReader extends Reader.
 *
 *      构造器：
 *              BufferedReader(Reader in)
 *                  创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *              BufferedReader(Reader in, int sz)
 *                  创建一个使用指定大小输入缓冲区的缓冲字符输入流。
 *            参数：
 *                  Reader in：字符输入流，可以传递FileReader， 缓冲流会给 FileReader 添加一个缓冲区，提高缓冲效率
 *
 *      继承自父类Reader的成员方法：
 *              int read()
 *                  读取单个字符。
 *              int read(char[] cbuf)
 *                  将字符读入数组。
 *              abstract  void close(
 *                  关闭该流并释放与之关联的所有资源。
 *
 *            特有成员方法：
 *                   String readLine()  读取一个文本行。读取一行数据
 *                          读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
 *                    返回值：包含该行内容的字符串，不包含任何行终止符【\n\r】，如果已到达流末尾，则返回 null【不是-1】
 *
 *       使用步骤：
 *          1. 创建字符缓冲输入流对象，构造器传递字符输入流
 *          2. 使用字符缓冲输入流的方法read或者readLine读取文本
 *          3. 释放资源
 */
public class Demo02BufferedReader {
    public static void main(String[] args) throws IOException {
        //1. 创建字符缓冲输入流对象，构造器传递字符输入流
        BufferedReader br =
                new BufferedReader(new FileReader("D:\\JavaSETestDirectory01\\BufferedWriterTest.txt"));

        //2. 使用字符缓冲输入流的方法read或者readLine读取文本
        System.out.println("readLine()方法读取的字符如下：");
        String s = null;
        //则读取返回null，到达流末尾，循环结束
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        //3. 释放资源
        br.close();
    }
}
