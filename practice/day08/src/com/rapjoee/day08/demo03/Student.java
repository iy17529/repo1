package com.rapjoee.day08.demo03;

/**
 * ClassName:Student
 *
 * @Author:baba
 * @Date:2020/1/19 15:26
 * Description:
 *
 * 学习成员变量使用static关键字的情形和id自增
 */
public class Student {

    private int id;
    private String name;
    private int age;
    static String classRoom;        //static关键字修饰，属于类，对象共享
    private static int idCounter= 0;          //计数器，每当有新的对象被创建（new），就++


    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
