package com.rapjoee.day17.demo01FileMethod;

import java.io.File;

/**
 * ClassName:Demo04FileIs
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 12:48
 * Description:
 *
 * File类中第二类方法
 *      判断功能的方法：
 *          1. boolean exists()     :此File对象表示的文件或者目录是否真实存在
 *          2. boolean isDirectory():此File对象表示的是否是目录
 *          3. boolean isFile()     :此File对象表示的是否是文件
 *
 *      注意：
 *          1. 对于 2和3方法 ，由于PC中只有文件/文件夹，所以两个方法是互斥的
 *          2. 对于2和3方法，前提是：路径是必须正确的，否则返回false
 *          3. 所以获取前可以进行判断，不存在的文件/文件夹没有必要获取了
 *
 */
public class Demo04FileIs {
    public static void main(String[] args) {
        //传递一个真实存在的绝对路径【文件】
        File file1 = new File("D:\\Downloads\\picture\\Test.jpg");
        //传递一个不存在的绝对路径【文件】
        File file2 = new File("D:\\Downloads\\picture\\Test100.jpg");
        //传递一个真实存在的绝对路径【文件】
        File file3 = new File("day01\\day01.iml");          //day01\day01.iml

        //1. boolean exists() :此File对象表示的文件或者目录是否真实存在
        System.out.println("对象file1[" + file1.getAbsolutePath() + "]存在吗？" + file1.exists());
        System.out.println("对象file2[" + file2.getAbsolutePath() + "]存在吗？" + file2.exists());
        System.out.println("对象file3[" + file3.getAbsolutePath() + "]存在吗？" + file3.exists());
        System.out.println("==========================================");

        //2. boolean isDirectory():此File对象表示的是否是目录【判断给定的路径是不是以目录结尾】
        //判断是不是目录前判断是否存在,不存在就没必要判断是不是目录
        if(file1.exists()) {
            System.out.println("对象file1[" + file1.getName() + "]是目录吗？" + file1.isDirectory());
        }else {
            System.out.println("对象file1[" + file1.getName() + "]不存在！！");
        }
        if(file2.exists()) {
            System.out.println("对象file2[" + file2.getName() + "]是目录吗？" + file2.isDirectory());
        }else {
            System.out.println("对象file2[" + file2.getName() + "]不存在！！");
        }
        if(file3.exists()) {
            System.out.println("对象file3[" + file3.getName() + "]是目录吗？" + file3.isDirectory());
        }else {
            System.out.println("对象file3[" + file3.getName() + "]不存在！！");
        }
        System.out.println("==========================================");

        //3. boolean isFile()   :此File对象表示的是否是文件 【判断给定的路径是不是以文件结尾】
        //判断是不是文件前判断是否存在,不存在就没必要判断是不是文件
        if(file1.exists()) {
            System.out.println("对象file1[" + file1.getName() + "]是目录吗？" + file1.isDirectory());
        }else {
            System.out.println("对象file3[" + file1.getName() + "]不存在！！");
        }
        if(file2.exists()) {
            System.out.println("对象file2[" + file2.getName() + "]是文件吗？" + file2.isFile());
        }else {
            System.out.println("对象file2[" + file2.getName() + "]不存在！！");
        }
        if(file3.exists()) {
            System.out.println("对象file3[" + file3.getName() + "]是文件吗？" + file3.isFile());
        }else {
            System.out.println("对象file3[" + file3.getName() + "]不存在！！");
        }
    }
}
