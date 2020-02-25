package com.rapjoee.day11.demo01;

/**
 * ClassName:MyClass1
 *
 * @Author:baba
 * @Date:2020/1/31 19:15
 * Description:演示同一个类下
 */
public class MyClass1 {

    private int num1 = 100;
    int num2 = 200;         //      (default)不是关键字，而是不写就是本修饰符
    protected  int num3 = 300;
    public int num4 = 400;

    public void method(){
        System.out.println(num1 + num2 + num3 + num4);       //同一个类下四种都能访问
    }
}
