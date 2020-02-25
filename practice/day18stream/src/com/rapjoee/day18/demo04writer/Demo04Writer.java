package com.rapjoee.day18.demo04writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:Demo04Writer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 16:28
 * Description:
 *
 * 续写与换行问题；
 *      续写需要使用另外两个构造器：
 *              FileWriter(File file, boolean append)
 *                  根据给定的 File 对象构造一个 FileWriter 对象。
 *              FileWriter(String fileName, boolean append)
 *                  根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
 *            参数：
 *              File file：目标文件File对象
 *              String fileName：目标文件路径
 *              boolean append：追加续写开关，true为可以在目标文件上续写，false为不可续写，覆盖原来的文件内容
 *
 *       回车换行符：
 *          windows:\r\n
 *          Linux:\n
 *          mac:\r
 *
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JavaSETestDirectory01\\FileWriterTest1.txt", true);
        for (int i = 1; i <= 8; i++) {
            fw.write("Java" + i + "\r\n");
        }
        fw.flush();
        fw.close();
    }
}
