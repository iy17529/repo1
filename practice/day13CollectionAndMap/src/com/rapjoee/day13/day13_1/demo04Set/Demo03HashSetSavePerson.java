package com.rapjoee.day13.day13_1.demo04Set;

import java.util.HashSet;

/**
 * ClassName:Demo03HashSetSavePerson
 *
 * @Author:baba
 * @Date:2020/2/8 14:47
 * Description:
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {

        //创建一个存储自定义类型Person的集合   规则是  同名同年龄的人只能存储唯一一次
        // 【如果不允许存储重复元素，则自定义类型比较覆盖重写属性的toString()方法和equals()方法】
        HashSet<Person> hs = new HashSet<>();
        Person p1 = new Person("吐槽星人",22);
        Person p2 = new Person("汪星人",32);
        Person p3 = new Person("网管",18);
        Person p4 = new Person("吐槽星人",22);      //如果没有覆写属性的toString()方法和equals()方法，则此对象也会被存进去

        //打印p1与p4的哈希码值
        //未覆写前：  [24324022//21685669]
        //覆写后：[-766596177//-766596177]
        System.out.println("打印p1与p4的哈希码值:[" + p1.hashCode() + "//" + p4.hashCode() + "]");

        //添加对象元素
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        System.out.println("打印集合为： " + hs);
    }
}
