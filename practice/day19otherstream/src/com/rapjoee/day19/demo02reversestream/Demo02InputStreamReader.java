package com.rapjoee.day19.demo02reversestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName:Demo02InputStreamReader
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 12:18
 * Description:
 *
 * 学习转换流
 *      java.io.InputStreamReader extends Reader
 *          【解码】InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符
 *                  把看不懂的解码为看得懂的
 *
 *      继承自父类的成员方法：
 *           int read()  读取单个字符。
 *           int read(char[] cbuf)  将字符读入数组。
 *           abstract  void close()  关闭该流并释放与之关联的所有资源。
 *
 *     构造器：
 *          InputStreamReader(InputStream in)
 *              创建一个使用默认字符集的 InputStreamReader。
 *          InputStreamReader(InputStream in, String charsetName)
 *              创建使用指定字符集的 InputStreamReader。
 *          参数：
 *              InputStream in：字节输入流对象，用来读取文件中保存的字节数据
 *              String charsetName：指定编码格式，不区分大小写。UTF-8/utf-8，gbk/GBK...不指定则默认为UTF-8
 *
 *      使用步骤：
 *          1. 创建 InputStreamReader 对象，构造器中传递InputStream对象和指定编码格式，绑定要读取的源文件/路径
 *          2. 使用InputStreamReader对象的read方法，读取文件
 *          3. 释放资源
 *         注意！！要读取文件的编码格式与指定的编码一致，否则产生乱码
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        //1. 创建 InputStreamReader 对象，构造器中传递InputStream对象和指定编码格式，绑定要读取的源文件/路径
        //指定与文件不同的编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream
                        ("D:\\JavaSETestDirectory01\\我是GBK编码的文件.txt"), "utf-8");
        //指定与文件相同的编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream
                        ("D:\\JavaSETestDirectory01\\我是GBK编码的文件.txt"), "GBK");

        //2. 使用InputStreamReader对象的read方法，读取文件
        char[] chars = new char[1024];
        int len = 0;
        System.out.println("gbk文件指定UTF-8编码：");
        while ((len = isr.read(chars))!= -1) {
            System.out.print(new String(chars, 0, len));//�ַ�ת���������ַ���产生乱码：gbk
        }

        System.out.println("gbk文件指定GBK编码：");
        while ((len = isr2.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));//字符转换流测试字符串gbk  相同编码，没有乱码
        }

        //3. 释放资源
        isr.close();
        isr2.close();
    }
}
