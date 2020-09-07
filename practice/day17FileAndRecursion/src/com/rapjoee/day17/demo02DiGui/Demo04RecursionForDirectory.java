package com.rapjoee.day17.demo02DiGui;

import java.io.File;

/**
 * ClassName:Demo04RecursionForDirectory
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 19:27
 * Description:
 *
 * 递归打印多级目录
 *      多级目录打印，遍历目录，由于不知道子目录下是否还有东西，所以使用递归来嵌套
 *
 *   思路：
 *           想打印根目录，但是不知道根目录下是否还有目录，判断一下【可以遍历本目录，当本目录无文件夹/文件时，长度为0，不为0时，依次判断每个元素是不是目录，是就进去【instance】，并判断】
 *              如果还有，就打印此目录，打印之前判断一下是否还有子目录
 *                  如果还有，就打印此目录，打印之前判断一下是否还有子目录
 *                  没有子目录，打印上一级目录
 *               打印上一级目录
 *           打印上一级目录，结束。
 *
 *   D:\JavaSETestDirectory01
 *   D:\JavaSETestDirectory01\a
 *   D:\JavaSETestDirectory01\a\d
 *   D:\JavaSETestDirectory01\a\d\q.txt
 *   D:\JavaSETestDirectory01\a\d\r
 *   D:\JavaSETestDirectory01\a\d\t.java
 *   D:\JavaSETestDirectory01\a\w.txt
 *   D:\JavaSETestDirectory01\a.txt
 *   D:\JavaSETestDirectory01\b
 *   D:\JavaSETestDirectory01\b\a.jpg
 *   D:\JavaSETestDirectory01\b\c.txt
 *   D:\JavaSETestDirectory01\b.java
 */
public class Demo04RecursionForDirectory {
    public static void main(String[] args) {
        //传递一个根目录
        File dir = new File("D:\\JavaSETestDirectory01");
        //传递一个不存在的目录
        File dirFalse = new File("D:\\JavaSETestDirectory04");
        /*//传递一个计数器，每往下一级，打印的时候，多打印一个制表符【\t】
        int count = 0;*/

        //判断该File对象是否存在，不存在就没必要打印了，存在则继续
        if(dir.exists()) {
            printDir(dir);
        }else {
            System.out.println("对象路径[ " + dir.getAbsolutePath() +  " ]不存在！！");
        }
    }

    /*定义一个方法递归打印多级目录【一条】
            递归的限定条件：当获取到本目录里没有文件夹时【即判断为是文件夹的File对象为null时结束】
            递归的目的：获取下一级目录
     */
    private static void printDir(File file) {
        //遍历本目录下的所有File对象
        File[] files = file.listFiles();

        //打印本目录
        System.out.println(file.getAbsoluteFile());

        //遍历本目录并判断遍历到的File对象否为目录，为目录就进去获取并判断,不是目录就打印
        for (File file1 : files) {
            //是目录就进去获取并判断...
            if(file1.isDirectory()) {
                printDir(file1);
            }else {// 不是目录就是文件，直接打印
                System.out.println(file1);
            }
        }
        //return files;               //返回这个File对象，进行遍历打印
    }
}
