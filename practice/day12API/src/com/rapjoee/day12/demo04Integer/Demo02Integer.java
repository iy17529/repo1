package com.rapjoee.day12.demo04Integer;

import java.util.ArrayList;

/**
 * ClassName:Demo02Integer
 *
 * @Author:baba
 * @Date:2020/2/6 16:56
 * Description:
 * 自动装箱与自动拆箱：【jdk1.5之后的新特性】  基本数据类型和包装类之间可以相互转换
 */
public class Demo02Integer {
    public static void main(String[] args) {
        Integer integer1 = 456;     //自动装箱，直接把int数据复制给包装类Integer对象，相当于 Integer integer1 = new Integer(456);
        integer1 = integer1 + 34;   //自动拆箱再自动装箱，integer1是对象，无法直接参与运算，这里拆箱为int数据进行运算再装箱
                                            //相当于   integer1 = integer1.intValue() + 34;

        //典型的例子
        ArrayList<Integer> al = new ArrayList<>();
        al.add(34);                                 //自动装箱，存储的应当是Integer型的对象
    }
}
