package com.rapjoee.day19.demo03objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ClassName:Demo01ObjInputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 14:36
 * Description:
 *
 * java.io.ObjectInputStream extends InputStream
 *      ObjectInputStream：对象的反序列化流
 *      作用：把文件中保存的对象，以流的方式读取出来
 *
 *    构造器：
 *      ObjectInputStream(InputStream in)  创建从指定 InputStream 读取的 ObjectInputStream。
 *      参数：InputStream 以字节流对齐，传递字节输入流
 *
 *   特有的成员方法：
 *          Object readObject()  从 ObjectInputStream 读取对象。 返回值是对象
 *
 *   使用步骤：
 *      1. 创建 ObjectInputStream 对象，传递一个字节输入流
 *      2. 使用 ObjectInputStream 对象的readObject()方法，读取文件中的对象【正在一字节的方式存储着】
 *      3. 释放资源
 *      4. 使用这个对象，可以打印输出一下
 *
 *
 *      readObject()声明了ClassNotFoundException异常
 *          当不存在对象的class文件时会抛出
 *         所以反序列化的前提：
 *          1. 类必须实现 Serializable 接口
 *          2. 对象的class文件必须存在
 *
 *    static 关键字：
 *          静态优先于非静态加载至内存中，被static关键字修饰的成员变量不可被序列化，因为序列化的都是对象
 *              如果给int age 添加static关键字，则age属性不会被正常序列化
 *                  Person{name='张三', age=0}
 *
 *    transient 关键字：瞬态关键字
 *          被transient关键字修饰的成员变量，不能被序列化
 *              Person{name='张三', age=0}
 *
 *            所以如果类中有不想被序列化的属性，可以添加此关键字
 */
public class Demo01ObjInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JavaSETestDirectory01\\对象序列化文件.txt"));

        Object o = null;
        try {
            o = ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(o);
        ois.close();

        //可以进行向下转型
        Person p = (Person) o;
        System.out.println("p.getName():" + p.getName() + ",  p.getAge():" + p.getAge());
    }
}
