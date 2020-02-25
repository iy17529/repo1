package com.rapjoee.day09.demo09case2;

/**
 * ClassName:User
 *
 * @Author:baba
 * @Date:2020/1/25 19:48
 * Description:
 */
public class User {

    private String name;
    private int money;


    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我叫："+name+",我的余额为："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
