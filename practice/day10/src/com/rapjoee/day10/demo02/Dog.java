package com.rapjoee.day10.demo02;

/**
 * ClassName:Cat
 *
 * @Author:baba
 * @Date:2020/1/29 16:20
 * Description:
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头！！");
    }

    public void watchHouse(){
        System.out.println("狗看家！！");
    }
}
