package com.rapjoee.day09.demo09case1;

/**
 * ClassName:Master
 *
 * @Author:baba
 * @Date:2020/1/25 16:58
 * Description:群主类
 */
public class Master extends User {

    /*发红包三要素：
    * 方法名：outMoney
    * 参数：余额、发的金额
    * 返回值：余额
    */
    public static double outMoney(double myMoney,double out){

        myMoney = myMoney - out;

        return myMoney;
    }

}
