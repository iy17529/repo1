package com.rapjoee.day19.demo03objectstream;

import java.io.Serializable;

/**
 * ClassName:Person
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/22 15:04
 * Description:
 *      序列化与反序列化时，会抛出 NotSerializableException 异常
 * 【类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化】
 *      Serializable接也叫标记型接口
 *              要进行序列化与反序列化的类必须实现 Serializable 接口，这样会给类添加一个标记
 *              当我们要进行序列化与反序列化时，会检测类上是否有这个标记
 *                  有：则可以进行序列化与反序列化
 *                  没有：抛出NotSerializableException异常
 *           相当于去市场上买肉 ---> 肉上有一个蓝色的章【检测合格】  ---> 可以放心购买  ---> 买回来怎么做随意
 *
 *           Person类实现Serializable接口后，会根据类的定义给Person.class文件生成一个序列号serialVersionUID
 *           当class文件更改时，会重新编译，生成一个新序列号。
 *
 *   序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联
 *   该序列号在反序列化过程中用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。
 *   如果接收者加载的该对象的类的 serialVersionUID 与对应的发送者的类的版本号不同，则反序列化将会失败，并抛出 InvalidClassException。
 *
 *          所以当序列化后更改Person类会导致InvalidClassException异常。
 *
 *       解决办法：手动给Person定义一个序列号serialVersionUID，该序列号必须是 static、final修饰的long型字段【即为常量，不可更改！！】
 *                这样即使改动了Person类的class文件，其序列号不会改变，依旧可以反序列化成功
 */
public class Person implements Serializable {       //Serializable接口中没有任何方法，仅仅标记作用

    private String name;
    private /*transient*/ int age;                  //添加transient关键字则不会被序列化
    static final long serialVersionUID = 42L;       //手动添加一个不可变的序列号

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

