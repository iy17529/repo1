package com.rapjoee.day11.demo07;

/**
 * ClassName:Demo01Interface
 *
 * @Author:baba
 * @Date:2020/2/1 19:00
 * Description:
 * 使用接口作为成员变量
 */
public class Demo01Interface {
    public static void main(String[] args) {
        Hero teemo = new Hero();        //创建提莫对象
        teemo.setName("提莫");            //为其设置姓名

        //创建技能接口的匿名内部类
        Skill muDa = new Skill() {
            @Override
            public void use() {
                System.out.println("木大木大木大木大木大木大木大木大木大木大木大木大");
            }
        };
        teemo.setSkill(muDa);      //设置英雄技能

        teemo.attack();
        System.out.println("=========================");
        Hero rapjoe = new Hero();       //创建另一个对象rapjoe
        rapjoe.setName("rapjoe");


        rapjoe.setSkill(new Skill() {           //【简化】以匿名内部类匿名对象方式实现接口，设置英雄技能
            @Override
            public void use() {
                System.out.println("欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉欧拉");
            }
        });
        rapjoe.attack();
    }
}
