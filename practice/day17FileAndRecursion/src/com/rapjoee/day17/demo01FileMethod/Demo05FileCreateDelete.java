package com.rapjoee.day17.demo01FileMethod;

import java.io.File;
import java.io.IOException;

/**
 * ClassName:Demo05CreateDelete
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 13:24
 * Description:
 *
 * File类中第三类方法
 *      创建于删除功能的方法：
 *          1. boolean createNewFile():当且仅当该名的文件不存在时，创建一个新的空文件
 *          2. boolean delete()       :删除此File对象表示的文件或者目录               【彻底删除！！谨慎使用！！不走回收站】
 *          3. boolean mkdir()        :创建File对象表示的目录
 *          4. boolean mkdirs()       :创建由此File对象表示的目录。包括任何必需但不存在的父目录
 */
public class Demo05FileCreateDelete {
    public static void main(String[] args) {
        //创建一个不存在的目文件
        File file1= new File("D:\\testFile.txt");

        //1. boolean createNewFile()    当且仅当该名的文件不存在时，创建一个新的空文件
                // 文件不存在则创建，存在则创建失败【在电脑中没有此路径则抛出异常】
        try {
            boolean b1 = file1.createNewFile();         //IOException: 系统找不到指定的路径
            System.out.println("创建[" + file1.getAbsolutePath() + "]成功了没？" + b1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2. boolean delete()   删除此File对象表示的文件或者目录  【彻底删除！！谨慎使用！！】
                //文件存在则删除并返回true
                // 不存在则返回false，路径不正确也返回false，文件夹中有内容不删除并返回false  JavaSETestDirectory02
        File file2 = new File("D:\\testFile2");      //一个不存在的文件
        File dirTrue = new File("D:\\JavaSETestDirectory02");       //存在的文件夹，并且有内容
        System.out.println("删除[" + file2.getAbsolutePath() + "]成功了没？" +file2.delete());
        System.out.println("删除[" + dirTrue.getAbsolutePath() + "]成功了没？" +dirTrue.delete());
        //System.out.println("删除[" + file1.getAbsolutePath()+ "]成功了没？" +file1.delete());

        //3. boolean mkdir()        :创建File对象表示的目录。存在则创建返回true，不存在则返回发false，路径不正确则返回false
        File directory1 = new File("D:\\JavaSETestDirectory01");
        //创建一个空目录,前判断是否存在
        if(directory1.exists()){
            System.out.println("创建"+ directory1.getAbsolutePath() +"失败！存在此目录");
        }else {
            boolean b9 = directory1.mkdir();
            System.out.println("创建目录[" + directory1.getAbsolutePath() + "]成功了没？" + b9);
        }

        //4. boolean mkdirs()       :创建由此File对象表示的目录。包括任何必需但不存在的父目录【即可以创建单级文件夹，也可以多级】
        File directory2 = new File("D:\\JavaSETestDirectory02\\test01\\directory01");
        if(directory2.exists()){
            System.out.println("创建"+ directory2.getAbsolutePath() +"失败，目录已经存在！！");
        }else {
            boolean b2 = directory2.mkdirs();
            System.out.println("目录[" + directory2.getAbsolutePath() + "]创建成功了吗？" + b2);
        }
    }
}
