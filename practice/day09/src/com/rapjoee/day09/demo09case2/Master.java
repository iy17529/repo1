package com.rapjoee.day09.demo09case2;

import java.util.ArrayList;

/**
 * ClassName:Master
 *
 * @Author:baba
 * @Date:2020/1/25 20:23
 * Description:
 */
        //群主类
    /*群主发放红包，平均分成num份，有余数则放在最后一个包里*/
public class Master extends User{
    public Master() {
    }

    public Master(String name, int money) {
        super(name, money);
    }

    /*群主发红包三要素
    * 参数：群主要发的金额、发放人数
    * 返回值：小金额集合
    * */
    public ArrayList<Integer> outMoney(int outMoney,int num){
        ArrayList<Integer> al = new ArrayList<>();

        int leftMoney = super.getMoney();        //群主当前余额
        if(leftMoney < outMoney){
            System.out.println("余额不足！！");
            return al;
        }
        int avg = outMoney/num;          //平均分
        for (int i = 0; i < num - 1; i++) {         //平均分后存入集合
            al.add(avg);
        }
        int mod = outMoney % num;
        al.add(mod);
        super.setMoney(leftMoney - outMoney);       //减去发放的红包为群主余额

        return al;
    }
}
