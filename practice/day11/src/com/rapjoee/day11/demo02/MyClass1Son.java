package com.rapjoee.day11.demo02;

import com.rapjoee.day11.demo01.MyClass1;

/**
 * ClassName:MyClass1Son
 *
 * @Author:baba
 * @Date:2020/1/31 19:18
 * Description:演示不同包父子关系
 */
public class MyClass1Son extends MyClass1 {

    public void method3(){
        System.out.println(super.num3 + super.num4);            //private和(default)修饰的不可访问
    }
}
