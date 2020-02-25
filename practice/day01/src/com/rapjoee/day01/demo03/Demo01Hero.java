package com.rapjoee.day01.demo03;

/**
 * ClassName:Demo01Hero
 *
 * @Author:baba
 * @Date:2020/2/3 13:52
 * Description:
 */
public class Demo01Hero {
    public static void main(String[] args) {
        Hero galen = new Hero();            //创建英雄盖伦
        galen.setName("盖伦");
        galen.setHp(345.7F);
        Hero teemo = new Hero();
        teemo.setHp(123.0F);
        teemo.setName("提莫");

        Support su1 = new Support();
        su1.setHp(56.4F);
        su1.setName("辅助1");
        su1.heal(galen);            //给盖伦治疗
        su1.heal(teemo,100);        //给提莫回100点血
    }
}
