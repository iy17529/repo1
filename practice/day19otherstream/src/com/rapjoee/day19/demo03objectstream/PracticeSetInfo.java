package com.rapjoee.day19.demo03objectstream;

import java.io.*;
import java.util.ArrayList;

/**
 * ClassName:PracticeSetInfo
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 16:34
 * Description:
 *
 *
 *      当我们想对多个对象进行序列化与反序列化操作时，可以把他们保存在一个集合中【不可对一个文件多次序列化】
 * 练习：
 *      1. 将存有多个自定义对象的集合序列化操作，保存到list.txt文件中
 *      2. 反序列化list.txt，并遍历集合，打印对象信息
 *
 * 思路：
 *      1. 创建一个ArrayList集合，保存自定义类Person的对象
 *      2. 创建 ObjectOutputStream 对象，对集合进行序列化操作【不是对集合中的元素】，保存到硬盘文本文件中
 *      3. 创建 ObjectInputStream 对象，对文件中的集合对象进行反序列化操作，读取对象到一个集合中存储
 *      4. 释放资源
 *      4. 反序列化得到的Object向下转型为ArrayList集合，遍历集合，打印对象信息
 *
 */
public class PracticeSetInfo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //1. 创建ArrayList集合，并保存自定义类Person的对象
        ArrayList<Person> initList = new ArrayList<>();
        initList.add(new Person("长江", 6300));
        initList.add(new Person("亚马孙河", 6400));
        initList.add(new Person("黄河", 5464));
        initList.add(new Person("尼罗河", 6670));

        //2. 创建 ObjectOutputStream 对象，对集合进行序列化操作，保存到硬盘文本文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JavaSETestDirectory01\\list.txt"));

        //3. 创建 ObjectInputStream 对象，对文件中的对象【集合】进行反序列化操作
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JavaSETestDirectory01\\list.txt"));

        //writeObject()方法与readObject()进行序列化与反序列化操作
        oos.writeObject(initList);
        Object obj = ois.readObject();

        oos.close();
        ois.close();

        //4. 遍历集合，打印对象信息
        System.out.println("集合打印为：");
        //对象进行强转
        ArrayList<Person> list = (ArrayList<Person>) obj;
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
