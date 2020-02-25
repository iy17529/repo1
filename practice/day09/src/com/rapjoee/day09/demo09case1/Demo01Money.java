package com.rapjoee.day09.demo09case1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ClassName:Demo01Money
 *
 * @Author:baba
 * @Date:2020/1/25 17:08
 * Description:
 */
public class Demo01Money {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");       //double数据保留两位的工具
        Scanner sc = new Scanner(System.in);
        System.out.print("群主发放的红包总金额为：");
        double outMoney = sc.nextDouble();
        System.out.println("发放人数为：");
        int num = sc.nextInt();

        double receiveMoney = outMoney/num;

        Member mem = new Member();
        com.rapjoee.day09.demo09case1.Master ma = new com.rapjoee.day09.demo09case1.Master();

        mem.setMoney(300.0);
        mem.setName("甲");
        System.out.println("群成员"+mem.getName()+"的余额为："+df.format(mem.getMoney()));
        System.out.println("抢红包后，群成员"+mem.getName()+"的余额为："+df.format(com.rapjoee.day09.demo09case1.Member.inMoney(mem.getMoney(),receiveMoney)) + "\n");
        //调用群员的抢红包方法

        ma.setMoney(1200.00);
        ma.setName("苦逼群主张三三");
        System.out.println("群主"+ma.getName()+"的余额为："+ df.format(ma.getMoney()));
        System.out.println("被迫发红包后，群主 "+ma.getName()+"的余额为："+ df.format(com.rapjoee.day09.demo09case1.Master.outMoney(ma.getMoney(),outMoney)));
        //调用群主发红包方法
    }
}
