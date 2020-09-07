package com.rapjoee.day01.demo03;

/**
 * ClassName:Hero
 *
 * @Author:baba
 * @Date:2020/2/3 13:44
 * Description:
 */
public class Hero {
    String name;        //姓名
    float hp;           //血量
    float armor;        //护甲
    int moveSpeed;      //移速

    public Hero() {
    }

    public Hero(String name, float hp, float armor, int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
