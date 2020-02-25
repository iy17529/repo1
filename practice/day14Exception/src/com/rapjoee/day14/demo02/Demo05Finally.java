package com.rapjoee.day14.demo02;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName:Demo05DFinally
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 12:54
 * Description:
 *
 *学习finally关键字的使用
 *          try {
 *                      //try中写可能出现问题的代码
 *                      readFile("c:\\a.tx");
 *                      System.out.println("资源施放");
 *                  } catch (IOException e) {
 *                      //异常的处理逻辑}
 *         上面这段代码的try中的【   System.out.println("资源施放"); 】 如果上一行代码有异常则此行不会执行，此时可以用finally关键字进行处理
 *
 *        格式：
 *        try{
 *             //可能产生异常的代码
 *        }catch(异常类名 变量名) {		//定义一个异常变量，接收try中抛出的异常
 *            //异常处理逻辑  【记录日志/打印异常信息/继续抛出】
 *        }finally{
            System.out.println("资源施放");    //此行代码不论try中内容是否出现异常都会执行
 *      }
 *
 *          注意：
 *          1. finally不可单独使用，必须和try配合使用
 *          2. finally一般用于资源释放【资源回收】，无论程序是否有异常，都要释放资源
 *
 */
public class Demo05Finally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");                         //此行代码一定会执行
        }
    }
    private static void readFile(String fileName) throws FileNotFoundException, IOException {
        if(!fileName.endsWith(".txt")) {         //文件名后缀是否一致
            throw new IOException("参数文件名后缀不正确！！");
        }
        System.out.println("路径没有问题");
    }
}
