package com.rapjoee.day14.demo02;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName:Demo04TryCatch
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 12:03
 * Description:
 *
 * 学习处理异常的第二种方式：try catch自己处理异常
 * - 格式：
 *     try{
 *          //可能产生异常的代码
 *     }catch(异常类名 变量名) {		//定义一个异常变量，接收try中抛出的异常
 *         //异常处理逻辑  【记录日志/打印异常信息/继续抛出】
 *     }...
 *     catch(异常类名 变量名) {
 *         //...}
 *
 * - 注意：
 *   1. try中可能会抛出多个异常，可以使用多个catch来接收并处理
 *      2.1. 如果try中产生异常，会执行catch中的异常处理逻辑，然后继续执行try...catch之后的代码
 *      2.2. 如果try中没产生异常，则不是执行catch中内容，执行完try中内容后直接执行后续代码
 *
 *
 * 如何获取异常信息？
 *      Throwable类中定义了一些查看的方法
 *          1. String toString()        ：获取异常的类型与异常描述信息
 *          2. String getMessage()      ：获取一次的描述信息、原因
 *          3. void printStackTrace()   ：打印异常的跟踪栈信息并输出到控制台，包含了异常的类型，原因，出现的位置
 */
public class Demo04TryCatch {
    public static void main(String[] args) {

        //此时main处不是把异常继续抛给jvm。而是自己处理，
        try {
            //try中写可能出现问题的代码
            readFile("c:\\a.tx");
            System.out.println("资源施放");
        } catch (IOException e) {               //readFile()方法抛出的是IOException，就用IOException类型来接收
            //异常的处理逻辑
            //System.out.println("try catch--文件后缀名不是.txt");               //try catch--文件后缀名不是.txt
            System.out.println("异常信息：" + e.getMessage());               //参数文件名后缀不正确！！
            System.out.println("异常信息：" + e);                            //等同于[e.toString()]java.io.IOException: 参数文件名后缀不正确！！
            e.printStackTrace();                                            //
        }
        System.out.println("后续代码");                             //后续代码继续执行
    }

    //对传递的字符串进行校验，1. 路径一致  2. 文件名一致
    private static void readFile(String fileName) throws FileNotFoundException, IOException {
        if(!fileName.endsWith(".txt")) {         //文件名后缀是否一致
            throw new IOException("参数文件名后缀不正确！！");
        }
        System.out.println("路径没有问题");
    }
}
