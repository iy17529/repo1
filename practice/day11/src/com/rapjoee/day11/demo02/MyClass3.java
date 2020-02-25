package com.rapjoee.day11.demo02;

import com.rapjoee.day11.demo01.MyClass1;

/**
 * ClassName:MyClass2
 *
 * @Author:baba
 * @Date:2020/1/31 19:18
 * Description:演示不同包非父子关系
 */
public class MyClass3 {
    MyClass1 myClass1 = new MyClass1();

    public void method3(){
        System.out.println(myClass1.num4);          //private、(default)、protected修饰的均不可访问
    }
}
