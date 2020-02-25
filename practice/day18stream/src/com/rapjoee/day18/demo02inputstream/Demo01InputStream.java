package com.rapjoee.day18.demo02inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName:Demo01InputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 17:34
 * Description:
 *
 * java.io.InputStream下的InputStream，此抽象类是表示字节输入流的所有类的超类
 *      其定义了字节输入流的所有子类的共性方法
 *
 *      abstract  int read()   从输入流中读取数据的下一个字节。
 *      int read(byte[] b)   从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *      int read(byte[] b, int off, int len)   将输入流中最多 len 个数据字节读入 byte 数组。
 *      void close()  关闭此输入流并释放与该流关联的所有系统资源。
 *
 *
 * 一个子类：
 *      java.io.FileInputStream下的FileInputStream    文件字节输入流
 *          作用：把硬盘中数据读取到内存中
 *
 *      构造器：
 *         FileInputStream(String name)
 *           通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 *         FileInputStream(File file)
 *           通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
 *
 *       参数【读取文件的数据源】： File file：文件路径
 *                               String name ：文件
 *
 *       构造器的作用：
 *              1. 创建一个FileInputStream对象
 *              2. 把FileInputStream对象的引用指向构造方法中传递的要读取文件上
 *
 * 读取数据的原理：
 *      Java程序 --> jvm --> OS --> OS调用读取文件数据的方法 --> 读取文件数据
 *
 *      使用步骤：
 *              1. 创建FileInputStream对象构造器中传递要读取的数据源
 *              2. 调用read()方法来读取数据【读取到最后一个数据时返回-1】
 *              3. 释放资源
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1. 创建FileInputStream对象
        FileInputStream fis = new FileInputStream("a.txt");

        //2. 调用read()方法来读取数据
        //读取文件数据的一个字节，返回一个int数
        /*int readResult2 = fis.read();
        System.out.println("读取到的单个字节是：" + readResult2);//97
        readResult2 = fis.read();
        System.out.println("读取到的单个字节是：" + readResult2);//97
        readResult2 = fis.read();
        System.out.println("读取到的单个字节是：" + readResult2);//97
        readResult2 = fis.read();
        System.out.println("读取到的单个字节是：" + readResult2);//97
        readResult2 = fis.read();
        System.out.println("读取到的单个字节是：" + readResult2);//97
        readResult2 = fis.read();
        System.out.println("读取到的单个字节是：" + readResult2);//-1*/

        //上面的代码重复且繁杂，下面用循环来实现
        int len = 10000;

        /*      布尔表达式(len = fis.read()) != -1的含义：
            1. fis.read()方法执行，读取文件数据
            2. len = fis.read()，方法执行把读取到的字节赋值给len
            3. (len = fis.read()) != -1  判断(len = fis.read())的值是不是-1
         */
        while ((len = fis.read()) != -1) {
            System.out.print(" " + (char) len);
        }

        /*
        读取的流程：
            先创建一个FileInputStream对象，对象指向的文件数据最后一位是I个结束标记，
            然后对象调用read方法，Java程序告诉jvm
            jvm告诉OS，OS进行读取，并把读取的结果返回给jvm【比如字符a】，jvm把次字节返回给Java程序
            此时read方法指针会后移一位，Java程序继续读取..一直到读取最后一位，再读取时
            OS会读取到结束标记并返回给jvm，jvm返回给Java程序，Java程序表现出-1
         */

        //3. 释放资源
        fis.close();
    }
}
