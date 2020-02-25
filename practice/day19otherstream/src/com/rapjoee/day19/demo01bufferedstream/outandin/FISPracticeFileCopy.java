package com.rapjoee.day19.demo01bufferedstream.outandin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName:Demo03FISPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 20:28
 * Description:
 *
 * 字节流练习：
 *      图片复制
 *
 *  复制原理：
 *          读取已有图片的数据【字节流】，再在另一个文件中写入进去
 *
 *    效率测试：
 *          文件大小：7,408,726 字节
 *          读一次写一次： 总用时：52650ms
 *          读多次写多次： 总用时：78ms
 *
 */
public class FISPracticeFileCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();        //测试程序用时【开始时间】

        //创建FileOutputStream对象，并创建这个File对象表示的文件【目标文件】
        FileOutputStream fos = new FileOutputStream(new File("D:\\JavaSETestDirectory01\\a\\copyTest2.jpg"));

        int len = 0;              //有效读取个数

        //创建读取的源文件
        FileInputStream fis = new FileInputStream(new File("D:\\JavaSETestDirectory01\\a\\test2.jpg"));
        //调用read方法
        byte[] bytes = new byte[1024];  //存储读取到的字节
        while ((len = fis.read(bytes)) != -1) {         //总用时：2ms
             //读多次写多次
            fos.write(bytes, 0 ,len);
        }

        /*while ((len = fis.read()) != -1) {      //总用时：524ms
            //读一次写一次
            fos.write(len);
        }*/

        //释放资源【先关闭写的，因为如果写完了，肯定读取也完了】
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();        //测试程序用时【结束时间】
        long result = end - start;

        System.out.println("总用时：" + result + "ms");
    }
}
