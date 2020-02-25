package com.rapjoee.day17.demo01FileMethod;

import java.io.File;
import java.io.IOException;

/**
 * ClassName:Demo06FileFor
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 14:29
 * Description:
 *
 * 学习目录的遍历，主要两个方法：
 *      1. String[] list()   :返回一个String数组，表示该File目录下的所有子文件或目录【遍历得到文文件/文件夹的名称】
 *      2. File[] listFiles():返回一个File数组，表示该File目录下的所有子文件或目录，【遍历得到/文件文件夹的绝对路径】
 *
 *    注意：
 *          1. 两个方法遍历的是构造方法中给出的目录的路径
 *          2. 如果构造方法中给的目录的路径不正确，会抛出空指针异常NullPointerException
 *          3. 如果构造方法中给的目录的路径表示的不是一个目录，会抛出空指针异常NullPointerException
 *          4. 两种方法可以遍历到文件夹中的隐藏文件/文件夹
 */
public class Demo06FileFor {
    public static void main(String[] args) throws IOException {
        //传递三个文件夹路径与一个文件路径
        File dir0 = new File("D:\\JavaSETestDirectory01\\");
        File dir1 = new File(dir0,"testDirectory01");
        File dir2 = new File(dir0,"testDirectory02\\新建文件夹");
        File dir3 = new File(dir0,"testDirectory03");
        File file1 = new File(dir0,"a.txt");

        //把三个文件夹和一个文件分别创建出来
        boolean b1 = dir1.mkdirs();
        boolean b2 = dir2.mkdirs();
        boolean b3 = dir3.mkdirs();
        boolean newFile1 = file1.createNewFile();
        System.out.println("创建 ["+dir1.getAbsolutePath() + "] 成功了吗？ " + "\t" + b1);
        System.out.println("创建 ["+dir2.getAbsolutePath() + "] 成功了吗？ " + "\t" + b2);
        System.out.println("创建 ["+dir3.getAbsolutePath() + "] 成功了吗？ " + "\t" + b3);
        System.out.println("创建 ["+file1.getAbsolutePath() + "] 成功了吗？ " + "\t" + newFile1);

        //1. String[] list()    遍历含有文件夹的文件夹，存放在String数组内
        String[] dir0List = dir0.list();
        System.out.println("遍历dir0：");
        for (String dirLi : dir0List) {
            System.out.println(dirLi);
        }
        /*//匿名对象传递一个不存在路径，抛出NullPointerException
        String[] listFalse = new File("D:\\qwe").list();
        System.out.println("遍历不正确的路径：");
        for (String s : listFalse) {
            System.out.println(s);
        }*/
        //  2. File[] listFiles()       获取到文件/文件夹，封装到File对象中，存储到File数组中并返回
        File[] filesList = dir0.listFiles();
        System.out.println("listFiles方法遍历：");
        for (File file : filesList) {
            System.out.println(file);
        }
    }
}
