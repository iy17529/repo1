package com.rapjoee.day19.demo02reversestream;

import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName:Demo01FileReader
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/21 19:37
 * Description:
 *
 * 编码引起的问题：
 *  IDEA的编码默认是UTF-8的，FileReader可以读取
 *      但是系统编码默认为GBK，用其读取会产生乱码
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        //创建FileReader对象
        FileReader fr = new FileReader("D:\\JavaSETestDirectory01\\我是GBK编码的文件.txt");

        //读取文件数据
        int len;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);       //系统的这个文件不是UTF-8保存的，读取有乱码��ð�
        }

        //释放资源
        fr.close();
    }
}
