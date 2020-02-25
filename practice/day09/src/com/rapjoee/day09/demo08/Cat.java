package com.rapjoee.day09.demo08;

/**
 * ClassName:Cat
 *
 * @Author:baba
 * @Date:2020/1/25 16:34
 * Description:
 */
public class Cat extends Animal {

    //Animal animal = new Animal()      报错，不能直接new抽象类对象
    @Override
    public void eat() {
        System.out.println("猫吃鱼！！");
    }
}
