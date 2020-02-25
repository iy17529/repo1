package com.rapjoee.day19.demo02reversestream;

import java.io.*;

/**
 * ClassName:Demo04Practice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 13:39
 * Description:
 *
 * 练习：
 *      将GBK编码的文本文件，转换为UTF-8编码的文本文件
 *
 *      GBK文本文件：D:\JavaSETestDirectory01\出师表GBK版本.txt
 *
 *    思路：
 *      GBK转换流读取GBK的文本，写入时指定UTF-8编码装换流写入
 *
 *     步骤：
 *      1. 创建 InputStreamReader 对象，传递字节输入流对象，指定GBK编码
 *      2. 创建 OutputStreamWriter 对象，传递字节输出流对象，指定UTF-8编码
 *      3. InputStreamReader 对象read方法进行GBK编码读取【解码】
 *      4. OutputStreamWriter 对象write方法对读取的数据进行UTF-8编码写入【编码】
 *      5. flush方法刷新，释放资源
 *
 */
public class Demo04Practice {
    public static void main(String[] args) throws IOException {
        //创建字符转换输入输出流对象，分别绑定源文件与目标文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\JavaSETestDirectory01\\出师表GBK版本.txt"),
                "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaSETestDirectory01\\出师表utf8" +
                "版本" +
                ".txt"), "utf-8");

        //进行文件的读取
        int len;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1) {
            //指定UTF-8编码写入
            osw.write(chars,0 , len);
        }

        //释放资源
        isr.close();
        osw.flush();
        osw.close();
    }
}
