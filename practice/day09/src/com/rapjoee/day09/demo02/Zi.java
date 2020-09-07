package com.rapjoee.day09.demo02;

/**
 * ClassName:Zi
 *
 * @Author:baba
 * @Date:2020/1/19 19:39
 * Description:
 * 子类
 */
public class Zi extends Fu {
    String strZi = "子类字符串";
    String str1 = "同名字符串子";

    public void methodZi() {
        System.out.println("子类方法    " + str1);  //因为本类有str1则访问本类的str1
    }
}
