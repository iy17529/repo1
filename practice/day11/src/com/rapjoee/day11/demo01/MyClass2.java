package com.rapjoee.day11.demo01;

/**
 * ClassName:MyClass3
 *
 * @Author:baba
 * @Date:2020/1/31 19:20
 * Description:演示同一个包下
 */
public class MyClass2 {

    public void method2(){
        MyClass1 myClass1 = new MyClass1();

        System.out.println(myClass1.num2 +myClass1.num3 + myClass1.num4);       //private修饰的num1不可访问
    }


}
