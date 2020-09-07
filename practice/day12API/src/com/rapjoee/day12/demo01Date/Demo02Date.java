package com.rapjoee.day12.demo01Date;

import java.util.Date;

/**
 * ClassName:Demo02Date
 *
 * @Author:baba
 * @Date:2020/2/4 18:41
 * Description:
 * 学习Date类的构造方法与成员方法
 *
 * 1. 构造方法
 *      1.1 Date()  空参构造            获取系统当前时间
 *      1.2 Date(long date)             获取自时间原点以来的指定毫秒数，与System.currentTimeMillis()方法作用相同
 * 2. 成员方法
 *      2.1 getTime()方法                 获取自时间原点以来的指定毫秒数，与System.currentTimeMillis()方法作用相同
 *      2.2 toString()方法                获取系统当前时间
 */
public class Demo02Date {
    public static void main(String[] args) {
        //空参构造，获取系统当前时间
        Date date0 = new Date();
        System.out.println(date0);

        //带参(毫秒值)构造，获取这个毫秒值离时间原点的日期【System.currentTimeMillis()】
        Date date1 = new Date(1580812637512L);
        System.out.println("时间为：" + date1);

        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        long time1 = date0.getTime();
        System.out.println("此时距离时间原点毫秒值为： " + time1);

        String s = date1.toString();        //当前系统时间
        System.out.println(s);

    }
}
