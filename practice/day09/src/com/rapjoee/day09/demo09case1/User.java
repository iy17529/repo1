package com.rapjoee.day09.demo09case1;

/**
 * ClassName:User
 *
 * @Author:baba
 * @Date:2020/1/25 16:51
 * Description:
 * 做一个收发红包的案例：
 * 群主发红包，金额从群主余额中扣除；多名群成员抢红包，保存到成员余额中
 *
 * 1.定义一个User类[姓名、余额]作为父类，群主类（Master）[../发红包方法]与成员类（Member）[../收红包方法]继承自User类
 * 2.
 */
public class User {

    private double money;
    private String name;

    public User() {
    }

    public User(double money, String name) {
        this.money = money;
        this.name = name;
    }
    //展示余额
    public void show(){
        System.out.println("我叫："+name+",余额为："+money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
