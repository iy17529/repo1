package com.rapjoee.day14.demo02;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName:Demo03Throws
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 11:30
 * Description:
 *
 * 学习处理异常的第一种方式：throws关键字声明异常
 *      - 作用：当方法内部抛出一个异常，我们必须处理这个异常对象，可以使用throws关键字进行处理，会把异常对象爹给方法的调用者，最终抛给jvm
 *      - 格式：【在方法声明时使用】
 *              修饰符 返回值 方法名(参数) throws AAAException, BBBException{
 *     		            throw new AAAException();
 *     		            throw new BBBException();
 *     		        }
 *   - 注意：
 *
 *   -      1.  `throws`关键字必须写在方法声明处
 *          2. `throws`后边声明的异常必须是``Exception`或其子类
 *          3. 方法内部抛出了多个异常对象，则throws关键字后边也必须声明多个异常【如果异常之间存在父子类关系，则声明父类异常即可】
 *          4. 调用了一个声明异常的方法，则必须处理声明的异常
 *                  4.1  继续声明抛出，交给方法调用者，最终交给jvm
 *                  4.2  `try...catch`自己处理异常
 */
public class Demo03Throws {
    //public static void main(String[] args) throws FileNotFoundException,IOException {
    //public static void main(String[] args) throws IOException {     //IOException是FileNotFoundException的父类
    public static void main(String[] args) throws Exception {     //Exception是所有Exception的父类
        readFile("d:\\a.txt");
    }

    /*
    定义一个方法来读取文件
    参数：
            String fileName  文件路径
     无返回值
     */

    //这个是编译异常，索引得处理，使用throws关键字声明，同时在此方法调用者处声明【即main方法】,最终交给jvm处理
    private static void readFile(String fileName) throws FileNotFoundException,IOException {
        //对传递的字符串进行校验，1. 路径一致  2. 文件名一致
        if(!fileName.equals("c:\\a.txt")) {      //路径是否一致
            throw new FileNotFoundException("文件路径不正确！！");
        }
        if(!fileName.endsWith(".txt")) {         //文件名后缀是否一致
            throw new IOException("参数文件名后缀不正确！！");
        }
        System.out.println("路径没有问题");
    }
}
