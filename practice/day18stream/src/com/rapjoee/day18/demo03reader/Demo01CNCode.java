package com.rapjoee.day18.demo03reader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ClassName:Demo01CNCode
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 14:38
 * Description:
 *
 * 中文字符GBK是两个字节一个中文字符
 *          如果是utf8编码是三个字节一个中文字符
 *
 *     一个中文：
 *          GBK：两个字节
 *          UTF-8：三个字节
 *
 *      一次读取一个字节，不能读取到完整的UTF-8下的三个字节一个中文的字符
 *
 *      所以Java提供了字符流，不管是中文字符，还是英文字母，还是符号，都可以读取
 *
 */
public class Demo01CNCode {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JavaSETestDirectory01\\a.txt");  //文本内容：你好abcd
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print(/*(char)*/len);//228 189 160 229 165 189 97 98 99 100
            System.out.print(" ");          //ä ½   å ¥ ½ a b c d ,发现UTF-8三个字节一个中文，并且出现了乱码
                                            //因为每个中文三个字节，所以每次读取只能一个字节，就是1/3个中文，出现乱码
        }

        //释放资源
        fis.close();
    }
}
