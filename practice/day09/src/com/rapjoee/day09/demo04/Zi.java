package com.rapjoee.day09.demo04;

/**
 * ClassName:Zi
 *
 * @Author:baba
 * @Date:2020/1/20 13:35
 * Description:
 */
public class Zi extends Fu{
    public void methodZi(){
        System.out.println("子类方法执行啦！！");
    }
    @Override
    public  void method(){
        System.out.println("子类同名方法执行啦！！");
    }
}
