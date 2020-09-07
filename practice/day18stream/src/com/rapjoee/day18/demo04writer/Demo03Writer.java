package com.rapjoee.day18.demo04writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:Demo03Writer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 16:02
 * Description:
 *
 * 其他的write()方法：
 *      void write(char[] cbuf)
 *         写入字符数组。
 *      abstract  void write(char[] cbuf, int off, int len)
 *         写入字符数组的某一部分。
 *      void write(String str)
 *         写入字符串。
 *      void write(String str, int off, int len)
 *         写入字符串的某一部分。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\JavaSETestDirectory01\\FileWriterTest2.txt");

        //void write(char[] cbuf) 写入字符数组。
        fw.write(new char[]{'测', '试', '字', '符', '数', '组'});
        fw.write(new char[]{'\n', '=', '=', '=', '=', '=', '=', '\n'});

        //abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
        fw.write(new char[]{'我', '是', '字', '符', '数', '组', '的', '一', '部', '分'}, 0, 4);
        fw.write(new char[]{'\n', '=', '=', '=', '=', '=', '=', '\n'});

        //void write(String str) 写入字符串。
        fw.write("测试写入字符串");
        fw.write(new char[]{'\n', '=', '=', '=', '=', '=', '=', '\n'});

        //void write(String str, int off, int len) 写入字符串的某一部分。
        fw.write(new String("写入字符串的一部分"), 2, 4);

        fw.flush();
        fw.close();
    }
}
