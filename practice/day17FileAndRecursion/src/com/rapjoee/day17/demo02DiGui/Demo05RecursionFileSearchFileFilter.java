package com.rapjoee.day17.demo02DiGui;

import java.io.File;
import java.io.FileFilter;

/**
 * ClassName:Demo04RecursionForDirectory
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 19:27
 * Description:
 *
 * 文件搜索练习：搜索D:\JavaSETestDirectory01下的所有.txt文件
 *
 * 递归打印多级目录
 *      多级目录，遍历目录，由于不知道子目录下是否还有东西，所以使用递归来嵌套
 *      遇到.txt结尾的文件打印出来
 *
 * 用过滤器的方式搜索：File类中的两个方法
 *
 *      File[] listFiles(FileFilter filter)
 *              返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *         用来过滤文件【File对象】的
 *           一个方法：boolean accept(File pathname)   测试指定【抽象路径名】是否应该包含在某个路径名列表中。
 *                  参数：File pathname  本题中也就是每一个遍历到的File对象
 *
 *      File[] listFiles(FilenameFilter filter)
 *              返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *          用来过滤文件名称的
 *           一个方法：boolean accept(File dir, String name) 测试指定【文件】是否应该包含在某一文件列表中。
 *
 *  注意：两个接口都是没有实现类，需要我们自己去写实现类
 *
 *          过滤器的原理：listFiles()方法会遍历传递的File对象，遍历得到当前File对象里的子File对象，调用过滤器accept规则判断
 *          满足规则的返回true，则可以把此对象保存在数组里，不满足的不放入直到判断完所有的子File对象，返回数组
 */
public class Demo05RecursionFileSearchFileFilter {
    public static void main(String[] args) {
        //传递一个根目录
        File dir = new File("D:\\JavaSETestDirectory01");
        //传递一个不存在的目录
        File dirFalse = new File("D:\\JavaSETestDirectory04");

        //判断该File对象是否存在，不存在就没必要打印了，存在则继续
        if(dir.exists()) {
            System.out.println("所有以[.txt]结尾的文件如下：");
            printTxtFile(dir);
        }else {
            System.out.println("对象路径[ " + dir .getAbsolutePath() +  " ]不存在！！");
        }
    }

    /*定义一个方法递归打印多级目录【一条】
            递归的限定条件：当获取到本目录里没有文件夹时【即isDirectory方法判断File对象为不是文件夹时结束】
            递归的目的：获取下一级目录
     */
    private static void printTxtFile(File file) {
        //测试参数路径是否包含在指定目录里，匿名内部类实现接口
        FileFilter ff1 = new FileFilter() {

            //重写规则，当且仅当目录在返回true
            @Override
            public boolean accept(File pathname) {
                //如果File对象是目录，就返回true【将被保存到数组中】，否则判断其是不是.txt结尾
                if (pathname.isDirectory()) {
                    return true;
                }
                //是.txt结尾返回true【将被保存到数组中】
                return pathname.getName().toLowerCase().endsWith(".txt");
            }
        };
        //获取本目录下的满足过滤规则的File对象，存到数组中
        File[] files = file.listFiles();

        //遍历并判断文件是否为目录，为目录就进去获取并判断,不是目录就遍历打印
        for (File file1 : files) {

            //判断是否为目录，为目录就进去获取并判断...
            if(file1.isDirectory()) {
                printTxtFile(file1);

            //不是目录就是文件，判断是不是.txt/.TXT结尾，是则直接打印文件名，不是则不作为
            //boolean endsWith(String suffix) 测试此【字符串】是否以指定的后缀结束。
            }else if(file1.getName().toLowerCase().endsWith(".txt")) {      //此处toString()方法、getPath()方法都可
                System.out.println(file1);
            }
        }
    }
}
