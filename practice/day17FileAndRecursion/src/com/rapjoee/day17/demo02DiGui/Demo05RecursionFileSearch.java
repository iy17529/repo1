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
 *   思路：
 *           遍历根目录，但是不知道根目录下是否还有目录，判断一下【可以遍历本目录，获取File对象进行isDirectory方法判断，true为目录。继续进入，false则是文件，判断后缀为.txt则打印】
 *              如果还有，就打印此目录中的.txt文件【有的话】，打印之前判断一下是否还有子目录
 *                  如果还有，就打印此目录.txt文件【有的话】，打印之前判断一下是否还有子目录
 *                  没有子目录，打印.txt文件【有的话】
 *               返回上一级目录
 *           返回上一级目录，结束。
 */
public class Demo05RecursionFileSearch {
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
