package com.rapjoee.day06.demo05;

/**
 * ClassName:Student
 *
 * @Author:baba
 * @Date:2020/1/16 16:59
 * Description:
 * 一个标准的类通常要拥有如下四个组成部分：
 * 1、其成员变量都要用private关键字来进行修饰
 * 2、为每一个成员变量编写Getter/Setter方法
 * 3、编写一个无参构造方法
 * 4、编写一个全参构造方法
 *
 *      这样标准的类也叫Java Bean
 */
public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("这是无参构造方法");
    }

    public Student(String nameParam, int ageParam) {
        this.name = nameParam;
        this.age = ageParam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
