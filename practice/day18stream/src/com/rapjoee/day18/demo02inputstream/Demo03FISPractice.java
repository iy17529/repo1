package com.rapjoee.day18.demo02inputstream;

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
 *      源：
 *
 */
public class Demo03FISPractice {
    public static void main(String[] args) throws IOException {
        //创建源图片File对象
        File picture = new File("D:\\JavaSETestDirectory01\\a\\test.jpg");
        //要复制到这个文件
        File picCopy = new File("D:\\JavaSETestDirectory01\\a\\copy.jpg");
        //创建FileOutputStream对象，并创建这个File对象表示的文件
        FileOutputStream fos = new FileOutputStream(picCopy);
        long start = System.currentTimeMillis();        //测试程序用时【开始时间】

        byte[] bytes = new byte[1024];  //存储读取到的字节
        int sum = 0;                //总共的有效读取字节个数
        int len = 0;              //有效读取个数
        int count = 0;              //记录循环次数

        //创建读取的源文件
        FileInputStream fis = new FileInputStream(picture);
        //调用read方法
        while ((len = fis.read(bytes)) != -1) {         //总用时：2ms
             //读多次写多次
            fos.write(bytes, 0 ,len);
            count++;
            sum+=len;
        }
       /* while ((len = fis.read()) != -1) {      //总用时：524ms
            //读一次写一次
            fos.write(len);
            count++;
        }*/

        //释放资源【先关闭写的，因为如果写完了，肯定读取也完了】
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();        //测试程序用时【结束时间】
        long result = end - start;

        System.out.println("循环了：" + count + "次");
        System.out.println("总有效读取字节为：" + sum + "字节");//读一次写一次时，循环了多少次即总有效字节读取数
        System.out.println("总用时：" + result + "ms");
    }
}
