package com.rapjoee.day19.demo01bufferedstream.outandin;

import java.io.*;

/**
 * ClassName:Demo03PracticeFileCopy
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/21 13:54
 * Description:
 *
 * 文件复制，使用缓冲流，并做效率测试
 *
 *      步骤：
 *          1. 创建 BufferedInputStream 对象，绑定要读取的源文件
 *          2. 创建 BufferedOutputStream 对象，绑定要写入的目标文件
 *          3. 使用BufferedInputStream对象的read方法读取源文件数据
 *          4. 使用BufferedOutputStream对象的write方法写入数据到目标文件
 *          5. 释放资源
 *
 *     效率：
 *          文件大小：7,408,726 字节
 *          一次读写一个字节：总用时：327ms
 *          一次读写多个字节：总用时：26ms
 */
public class Demo03PracticeFileCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();        //记录初始时间
        int len = 0;                                    //记录有效读取字节个数

        //1. 创建 BufferedInputStream 对象，绑定要读取的源文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\JavaSETestDirectory01\\a\\test2.jpg"));

        //2. 创建 BufferedOutputStream 对象，绑定要写入的目标文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\JavaSETestDirectory01\\a\\copyTest2.jpg"));

        //3. 使用BufferedInputStream对象的read方法读取源文件数据
        //4. 使用BufferedOutputStream对象的write方法写入数据到目标文件
        //一次读写一个字节
        /*while ((len = bis.read()) != -1) {
            bos.write(len);
        }*/

        //一次读写多个字节
        byte[] bytes = new byte[1024];      //数组缓冲
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0 ,len);
        }

        //5. 释放资源
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();          //记录结束时间
        System.out.println("总用时：" + (end - start) + "ms");
    }
}
