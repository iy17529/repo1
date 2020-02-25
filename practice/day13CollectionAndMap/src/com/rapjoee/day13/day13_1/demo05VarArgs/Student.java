package com.rapjoee.day13.day13_1.demo05VarArgs;

/**
 * ClassName:Student
 *
 * @Author:baba
 * @Date:2020/2/8 16:26
 * Description:
 *
 * 自定义一个学生类
 *
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
