package com.rapjoee.day18.demo03reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName:Demo02Reader
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 14:53
 * Description:
 *
 * java.io.Reader下的Reader类是用于读取字符流的抽象类，是所有字符输入流的最顶层的父类，定义了一些共性的成员方法
 *
 * 我们使用   继承者 其子类【java.io.InputStreamReader】的子类java.io.FileReader类
 *      FileReader类：用来读取字符文件的便捷类，文件字符输入流
 *              作用：把硬盘中的数据以字符的方式读取到内存中
 *
 *      构造器：
 *      FileReader(File file)   在给定从中读取数据的 File 的情况下创建一个新 FileReader。
 *      FileReader(String fileName)  在给定从中读取数据的文件名的情况下创建一个新 FileReader。
 *          参数：读取文件的数据源
 *              File file：一个文件【File对象】
 *              String fileName：文件的路径
 *
 *       构造器的作用：
 *              1. 创建一个FileReader类对象
 *              2. 把创建的对象的引用指向参数传递的要读取的File文件
 *
 *
 *      方法：
 *          int read()
 *              读取单个字符。
 *          int read(char[] cbuf)
 *              将字符读入数组。
 *          abstract  void close()
 *              关闭该流并释放与之关联的所有资源。
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\JavaSETestDirectory01\\a.txt");  //文本内容：你好abcd
/*        int len = fr.read();
        System.out.println((char)len);
        len= fr.read();
        System.out.println((char)len);
        len= fr.read();
        System.out.println((char)len);
        len= fr.read();
        System.out.println((char)len);
        len= fr.read();
        System.out.println((char)len);
        len= fr.read();
        System.out.println((char)len);
        len= fr.read();
        System.out.println(len);        //-1  读取到最后一个没有文件了  返回-1*/

        //读取单个字符
        /*int len1 = 0;
        System.out.println("一次读取单个字符为：");
        while ((len1 = fr.read()) != -1) {
            System.out.print((char)len1);            //你好abcd？？？、//*@
        }*/
        System.out.println("========================");

        //读取多个字符，以一个数组缓冲存储
        char[] charArr = new char[1024];
        int len2 = 0;
        System.out.println("一次读取多个字符打印为：");
        /*while ((len2 = fr.read(charArr)) != -1) {
            System.out.print(Arrays.toString(charArr));
        }*/
        while ((len2 = fr.read(charArr)) != -1) {
            System.out.println(new String(charArr, 0, len2));
        }
        /*
        String(char[] value)
                分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
        String(char[] value, int offset, int count)
                分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
                 offset是要从字符数组索引开始的地方，count是要转换的长度*/

        //释放资源
        fr.close();
    }
}
