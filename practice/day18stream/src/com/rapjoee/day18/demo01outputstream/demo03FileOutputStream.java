package com.rapjoee.day18.demo01outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * ClassName:demo03FileOutputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 11:59
 * Description:
 *
 * 一次写入多个字节的方法：
 *          void write(byte[] b)
 *              将 b.length 个字节从指定的 byte 数组写入此输出流。
 *          void write(byte[] b, int off, int len)
 *              将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。【写入数组的一部分】
 *
 *         一个小扩展：如果写入的第一个字节是正数【0~127】，则查询的是ASCII码表
 *                   如果写入的第一个字节是负数，那么第一个字节与第二个字节会组成一个中文，查询系统迷人码表【GBK】
 *
 *                   写入字符串的方法：
 *                      String类中有一个方法可以把字符串转换为字节数组【getBytes()】
 *                      再把该字节数组写入即可
 *
 */
public class demo03FileOutputStream {
    public static void main(String[] args) throws IOException {
        //写入一个字符串
        String str = "测试字符串";
        byte[] strBytes = str.getBytes();

        //1. 创建FileOutputStream对象，指定写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("D:\\JavaSETestDirectory01\\aaa.txt"));
        //2. 调用write方法写入数据
        //fos.write(new byte[]{-78, 79, -80, 81, 82, 83});//睴隘RS
        fos.write(new byte[]{78, -79, 80, 81, 82, 83}, 0,5 );//N盤QR

        //写入一个字符串
        System.out.println(Arrays.toString(strBytes));//[-26, -75, -117, -24, -81, -107, -27, -83, -105, -25, -84, -90, -28, -72, -78]
        fos.write(strBytes);

        //3. 释放系统资源
        fos.close();
    }
}
