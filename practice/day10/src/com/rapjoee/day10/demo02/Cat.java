package com.rapjoee.day10.demo02;

/**
 * ClassName:Cat
 *
 * @Author:baba
 * @Date:2020/1/29 16:20
 * Description:
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼！！");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠！！");
    }
}
