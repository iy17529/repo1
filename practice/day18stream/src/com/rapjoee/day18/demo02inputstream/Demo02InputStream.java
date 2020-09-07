package com.rapjoee.day18.demo02inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName:Demo02InputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 20:07
 * Description:
 *
 * 一次读取多个字节：
 *          int read(byte[] b)   从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *              明确：
 *              1. byte[]数组的作用？
 *                  A. 起到缓冲作用，存储每次读取的字节
 *                  B. 数组的长度我们一般定义1024（1kb），或者1024的整数倍
 *
 *              2. int返回值是什么
 *                  每次读取的有效字节的个数
 *
 *          int read(byte[] b, int off, int len)   将输入流中最多 len 个数据字节读入 byte 数组。
 *
 *      String类的构造器
 *          String(byte[] bytes)】可以把一个字节数组转换为一个字符串
 *          String(byte[] bytes, int offset, int length) 转换指定长度的字节数组
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象
        FileInputStream fis = new FileInputStream("b.txt");
        //调用read方法
        byte[] bytes = new byte[1024];  //存储读取到的字节
        int len = 100;      //记录有效读取的个数
        /*System.out.println(len);            //2
        //把获取的字节数组转换为字符串并打印
        System.out.println(new String(bytes));  //ab【初始值 0 0被覆盖】

        len = fis.read(bytes);
        System.out.println(len);            //2【有效读取的字节个数】
        System.out.println(new String(bytes));  //cd【ab被覆盖】

        len = fis.read(bytes);
        System.out.println(len);            //-1【已经读取到最后一个字节】
        System.out.println(new String(bytes));  //cd*/

        //上面的重复代码用循环实现
            //不知道文件有多少字节，所以使用while循环
            //while循环结束的条件：读取到-1
        while ((len = fis.read(bytes)) != -1) {

            //这里String构造方法指定长度，因为数组长度太长，数组后买呢没有数据，打印为空格
            System.out.print(new String(bytes, 0, len));
        }


        //释放资源
        fis.close();
    }
}
