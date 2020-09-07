package com.rapjoee.day19.demo03objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ClassName:Demo02ObjOutputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 14:36
 * Description:
 *
 * 对于Person类，创建的对象以流的形式写入【writeObject()方法】至文件中保存，写对象，也叫对象的序列化
 *      对象包含的不仅仅是字符，所以使用字节流，ObjectOutputStream :对象的序列化流
 *
 *   写入到文件中的对象字节我们是看不懂的，所以对于文件中保存的对象，以流的形式读取出来，也叫读对象，也叫对象的反序列化
 *      读取的对象保存的都是字节流，使用字节流读取 ObjectInputStream：对象的反序列化，使用readObject()方法读取，用Object类型接收
 *
 *
 *      java.io.ObjectOutputStream extends OutputStream
 *              对象的序列化流，把对象以流的形式写入到文件中保存
 *
 *      构造器：
 *              ObjectOutputStream(OutputStream out)  创建写入指定 OutputStream 的 ObjectOutputStream。
 *                  参数：OutputStream  字节输出流对象
 *
 *      特有的成员方法：
 *             void writeObject(Object obj)  将指定的对象写入 ObjectOutputStream。
 *
 *       使用步骤：
 *          1. 创建 ObjectOutputStream 对象，构造器中传递字节输出流对象
 *          2. 使用 ObjectOutputStream 对象的writeObject()方法，把对象序列化到文件中
 *          3. 释放资源
 *
 */
public class Demo02ObjOutputStream {

    public static void main(String[] args) throws IOException {


        //1. 创建 ObjectOutputStream 对象，构造器中传递字节输出流对象【要写入的目标文件】
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JavaSETestDirectory01\\对象序列化文件.txt"));

        //2. 使用 ObjectOutputStream 对象的writeObject()方法，把对象序列化到文件中
        oos.writeObject(new Person("张三", 19));  //NotSerializableException 没有序列化异常
        //oos.writeObject(new Person("吐槽星人", 22));

        //3. 释放资源
        oos.flush();
        oos.close();

    }
}
