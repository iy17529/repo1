package com.rapjoee.day11.demo06;

/**
 * ClassName:Hero
 *
 * @Author:baba
 * @Date:2020/2/1 18:35
 * Description:
 */
public class Hero {             //英雄类

    private String name;
    private int age;
    private Weapon weapon;      //类【引用类型】作为成员变量

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为 " + age + "的" + name + " 正在拿着 " + weapon.getCode() + " 攻击敌人");      //weapon.getCode(),
        // 不能只写Weapon,这是地址值
    }

}
