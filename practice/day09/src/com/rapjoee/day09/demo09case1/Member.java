package com.rapjoee.day09.demo09case1;

/**
 * ClassName:Member
 *
 * @Author:baba
 * @Date:2020/1/25 16:58
 * Description:群成员类
 */
public class Member extends User {
    /*
    收红包方法的三要素：
    方法名：inMoney
    参数：进来余额、收的金额
    返回值：返回余额
    */
    public static double inMoney(double myMoney,double receiveMoney){

        myMoney = myMoney + receiveMoney;

        return myMoney;
    }
}
