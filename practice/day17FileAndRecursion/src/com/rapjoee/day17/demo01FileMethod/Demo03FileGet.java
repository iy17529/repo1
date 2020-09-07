package com.rapjoee.day17.demo01FileMethod;

import java.io.File;

/**
 * ClassName:Demo03FileGet
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 12:17
 * Description:
 *
 * File类有很多方法，主要可以分为三类
 *      第一种：获取相关的方法：
 *          1.String getAbsolutePath():返回此File对象的绝对路径名字符串
 *          2.String getPath()        :将此File对象转换为路径名字符串
 *          3.String getName()        :返回此File对象表示的文件或者目录的名
 *          4.long length()           :返回此File对象表示的文件的长度，单位为字节
 */
public class Demo03FileGet {
    public static void main(String[] args) {
        //传递一个真实的绝对路径
        File file1 = new File("D:\\Downloads\\picture\\Test.jpg");
        //传递一个不存在的绝对路径
        File file2 = new File("D:\\Downloads\\picture\\downloads");
        //传递一个相对路径
        File file3 = new File("day01.iml");

        //1.String getAbsolutePath():返回此File对象的绝对路径名字符串【无论绝对相对，都转换为绝对的路径】
        System.out.println("fil1绝对路径名字符串:" + file1.getAbsolutePath());
        System.out.println("fil3相对路径名字符串:" + file3.getAbsolutePath());
        System.out.println("==========================================");

        //2.String getPath()        :将装换为路径名字符串（传递的是谁，就转换为谁）
        System.out.println("fil1路径名字符串:" + file1.getPath());
        System.out.println("fil3路径名字符串:" + file3.getPath());
        System.out.println("==========================================");

        //3.String getName()        :返回此File对象表示的文件或者目录的名
        System.out.println("file1文件名:" + file1.getName());
        System.out.println("file2文件夹名:" + file2.getName());
        System.out.println("==========================================");

        //   4.long length()           :返回此File对象表示的文件的长度，单位为字节
                //1. 文件夹没有大小的概念，所以对象不是文件夹
                //2. 路径正确且有此文件则返回文件长度，文件不存在或者路径不正确则返回0
        System.out.println("正确文件路径下的文件["+file1.getName()+"]大小为" + file1.length());
        System.out.println("不正确文件路径下的文件["+file2.getName()+"]大小为" + file2.length());
    }
}
