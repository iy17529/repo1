package com.rapjoee.day06.demo05;

/**
 * ClassName:Demo01Student
 *
 * @Author:baba
 * @Date:2020/1/16 17:15
 * Description:
 */
public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Rapjoee1");
        stu1.setAge(21);
        System.out.println("我的名字是：" + stu1.getName() + "年龄是：" + stu1.getAge());
        System.out.println("=========================");

        Student stu2 = new Student("Rapjoee2", 19);
        System.out.println("我的名字是：" + stu2.getName() + "年龄是：" + stu2.getAge());
        stu2.setAge(22);
        System.out.println("我的名字是：" + stu2.getName() + "年龄是：" + stu2.getAge());

    }
}
