package com.rapjoee.day01.demo05test;

/**
 * ClassName:Monkey
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/16 10:36
 * Description:
 */
public class Monkey implements Primate{//猴子类

    private String name;

    public Monkey() {
    }

    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("猴子" + name + "在爬");
    }

    @Override
    public void eat() {
        System.out.println("猴子" + name + "在吃香蕉");
    }
}
