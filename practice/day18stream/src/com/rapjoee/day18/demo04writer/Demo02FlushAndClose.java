package com.rapjoee.day18.demo04writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:Demo02FlushAndCLose
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 15:55
 * Description:
 *
 * 注意！！write方法执行后不调用flush方法或者close方法不会把数据【现在在内存缓冲区】刷新到硬盘中，程序结束，数据丢失
 *
 * flush()方法与close()方法的区别：
 *          flush：刷新内存缓冲区，流对象还可以继续使用，资源未关闭
 *          close：刷新缓冲区，通知系统关闭资源，流对象不可使用
 *
 */
public class Demo02FlushAndClose {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JavaSETestDirectory01\\FileWriterTest1.txt");
        fw.write("flush方法与close方法的区别");
        fw.flush();     //执行flush方法

        //字符串ABCD还可以继续写入
        fw.write("ABCD");

        fw.close();     //close方法关闭资源
        //字符串abcd无法写入
        //fw.write("qwer");       //java.io.IOException: Stream closed
    }
}
