package com.rapjoee.day19.demo04printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * ClassName:Demo02PrintStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 17:40
 * Description:
 *
 * 可以改变输出语句的目的地【打印流的流向】
 *
 *  System类中一个静态方法，可以更改输出语句的目的地，改为参数中传递的打印流的目的地
 *      static void setOut(PrintStream out)  重新分配“标准”输出流。
 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //不更改输出目的地
        System.out.println("输出语句在控制台输出！！");

        //打印流参数的 a.txt 文件里
        PrintStream ps = new PrintStream("D:\\JavaSETestDirectory01\\a.txt");
        //重新分配输出目的地，改为打印流目的地
        System.setOut(ps);
        System.out.println(("输出语句在文件里！！"));

        //释放资源
        ps.close();
    }
}
