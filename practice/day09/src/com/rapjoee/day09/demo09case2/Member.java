package com.rapjoee.day09.demo09case2;

import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName:Member
 *
 * @Author:baba
 * @Date:2020/1/25 20:35
 * Description:
 *
 */
        //群员类
public class Member extends User{
    public Member(){}

    public Member(String name, int money) {
        super(name, money);
    }

    /*三要素：
        参数：小红包集合
        返回值：无  void
        名称：inMoney
        */
    public  void inMoney(ArrayList<Integer> al1){

        Random ra = new Random();
        int index = ra.nextInt(al1.size());         //随机获取集合索引值

        int myMoney = super.getMoney();         //把金额添加到余额中，并移除集合中此元素
        Integer remove1 = al1.remove(index);
        super.setMoney(myMoney + remove1);

    }
}
