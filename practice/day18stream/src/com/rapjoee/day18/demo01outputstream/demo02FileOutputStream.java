package com.rapjoee.day18.demo01outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName:demo02FileOutputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 11:25
 * Description:
 * 无法直接创建OutputStream抽象类的对象，这里我们研究一个其子类FileOutputStream
 *
 *      java.io.FileOutputStream下的 FileOutputStream extends OutputStream
 *           FileOutputStream:文件字节输出流
 *           作用：把内存中的数据写入到硬盘的文件中
 *
 *     构造方法：
 *              FileOutputStream(String name)  创建一个向具有指定名称的文件中写入数据的输出文件流。
 *                      参数：【String name】目的是一个文件的路径
 *              FileOutputStream(File file)  创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *                      参数：【File file】目的是一个文件
 *
 *      构造方法的作用:
 *              1. 创建一个FileOutputStream对象
 *              2. 根据构造方法传递的文件/路径，在硬盘中创建一个空文件
 *              3. 把FileOutputStream对象的引用指向创建好的文件
 *
 *       写入数据的原理：
 *              Java程序 --> jvm --> OS（操作系统） --> OS调用写数据的方法 -->把数据写入到硬盘的方法中
 *
 *       字节输出流的使用步骤：
 *          1. 创建FileOutputStream对象
 *          2. 调用FileOutputStream对象的write()方法，把数据写入到硬盘的文件中
 *          3. close()方法释放系统资源
 */
public class demo02FileOutputStream {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\JavaSETestDirectory01\\aaa.txt");

        //1. 创建FileOutputStream对象
        //创建一个对象fos并在硬盘中创建aaa.txt这个文件，并把对象fos的引用指向此文件
        FileOutputStream fos = new FileOutputStream(file1);

        //2. 调用FileOutputStream对象的write()方法，把数据写入到硬盘的文件中【abstract  void write(int b)】
        //写数据时，会把十进制整数75转换为二进制，存储进去
        // 我们使用记事本打开的时候，文本的数据是0~127的查询ASCII码表，把数据转换为字母字符啥的，方便我们阅读
        //其他的值查询系统默认码表【中午系统为GBK】
        fos.write(75);

        //3. close()方法释放系统资源
        fos.close();//IOException
    }
}

