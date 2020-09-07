package com.rapjoee.day11.demo06;

/**
 * ClassName:DemoMain
 *
 * @Author:baba
 * @Date:2020/2/1 18:41
 * Description:
 * 学习引用类型作为成员变量
 */
public class Demo01Main {
    public static void main(String[] args) {
        //创建英雄对象
        Hero garen = new Hero();
        //给英雄设置属性
        garen.setAge(112);
        garen.setName("盖伦");
        garen.setWeapon(new Weapon("AK-47"));      //创建匿名武器对象

        garen.attack();        //年龄为 112的盖伦正在拿着 AK-47攻击敌人
    }
}
