package com.rapjoee.day01.demo05test;

/**
 * ClassName:Whale
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/16 10:35
 * Description:
 */
public class Whale implements Fish{

    private String name;

    public Whale() {
    }

    public Whale(String name) {
        this.name = name;
    }

    @Override
    public void swing() {
        System.out.println("鲸鱼" + name + "在游泳");
    }

    @Override
    public void eat() {
        System.out.println("鲸鱼" + name + "在吃东西");
    }//鲸鱼类

}
