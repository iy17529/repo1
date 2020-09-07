package com.rapjoee.day17.demo02DiGui;

import java.io.File;

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
 *           返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *      File[] listFiles(FilenameFilter filter)
 *           返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 */
public class Demo05RecursionFileSearchFileNameFilter {
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
        //获取本目录下的所有File对象
        File[] files = file.listFiles();
        //System.out.println(file.getAbsolutePath());

        //遍历并判断是本目录下文件否为目录，为目录就进去获取并判断,不是目录就遍历打印
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
