package com.rapjoee.day01.demo05test;

/**
 * ClassName:Person
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/16 10:31
 * Description:
 */
public class Person implements Primate{//人类，继承自灵长类
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void printAge() {
        if (isSex(sex)) {
            System.out.println(name + "是女生，年龄保密哦~~");
        }else {
            System.out.println(name + "的年龄是：" + age);
        }
    }
    private boolean isSex(String sex) {  //如果是女性，返回false
        if (!"女".equals(sex)) {
            return false;
        }
        return true;
    }

    @Override
    public void move() {
        System.out.println("人类" + name + "在行走！");
    }

    @Override
    public void eat() {
        System.out.println("人类" + name + "在吃饭饭！！");
    }
}
