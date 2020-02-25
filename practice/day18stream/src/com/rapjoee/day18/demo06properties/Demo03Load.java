package com.rapjoee.day18.demo06properties;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName:Demo03Load
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 20:13
 * Description:
 *      可以使用properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中进行使用
 *
 *           1. void load(InputStream inStream)
 *                   从输入流中读取属性列表（键和元素对）。
 *           2. void load(Reader reader)
 *                   按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
 *
 *           参数：InputStream inStream：字节输入流，不能读取含有中文的键值对
 *                Reader reader：字符输入流，可以读取含有中文的键值对
 *
 *            使用步骤：
 *              1. 创建Properties集合对象
 *              2. 创建输入流对象Reader reader/InputStream inStream ,构造器中传递要读取的源文件
 *              3. 使用对象的方法load读取保存到键值对的文件
 *              4. 遍历Properties集合
 *
 *           注意！！
 *              1. 存储键值对的文件中，键与值的默认的连接符可以是【 = ， 空格 ， 其他符合】
 *              2. 存储键值对的文件中，可以使用 # 进行注释，被注释的键值对不是再被读取
 *              3. 存储键值对的文件中，键与值默认都是字符串，不用再加引号。
 */
public class Demo03Load {
    public static void main(String[] args) throws IOException {
        //1. 创建Properties集合对象
        Properties pp1 = new Properties();      //存储可以读取中文的字符输入流
        Properties pp2 = new Properties();      //存储不可以读取中文的字节输入流

        //2. 创建输入流对象Reader reader/InputStream inStream ,构造器中传递要读取的源文件
        FileReader fr = new FileReader("D:\\JavaSETestDirectory01\\FileWriterTest.txt");
        FileInputStream fos = new FileInputStream("D:\\JavaSETestDirectory01\\FileWriterTest.txt");

        //3. 使用对象的方法load读取保存到键值对的文件
        pp1.load(fr);
        pp2.load(fos);
        fr.close();
        fos.close();

        //4. 遍历Properties集合
        Set<String> pp1Set = pp1.stringPropertyNames();
        Set<String> pp2Set = pp2.stringPropertyNames();
        Iterator<String> it1 = pp1Set.iterator();
        Iterator<String> it2 = pp2Set.iterator();

        System.out.println("遍历字符输入流FileReader得到的集合：");
        System.out.println("键\t" + "\t\t\t值");
        while (it1.hasNext()) {
            String key1 = it1.next();
            String value1 = pp1.getProperty(key1);
            System.out.println(key1 + "\t-->\t" + value1);              //字符输入流，没有乱码
        }
        System.out.println("==========================================");

        System.out.println("遍历字节输入流FileInputStream得到的集合：");
        System.out.println("键\t" + "\t\t\t值");
        while (it2.hasNext()) {
            String key2 = it2.next();
            String value2 = pp2.getProperty(key2);
            System.out.println(key2 + "\t-->\t" + value2);              //字节输入流，中文有乱码
        }
    }
}
