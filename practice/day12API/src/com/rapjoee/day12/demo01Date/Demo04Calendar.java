package com.rapjoee.day12.demo01Date;

import java.util.Calendar;

/**
 * ClassName:Calendar
 *
 * @Author:baba
 * @Date:2020/2/5 14:22
 * Description:
 * Calendar：日历类
 * Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法
 *
 * Calendar类无法直接创建对象使用里边有一个静态方法getInstance()，该方法返回一个Calendar类的子类对象
 *      getInstance()【使用默认时区和语言环境获得一个日历】
 */
public class Demo04Calendar {
    public static void main(String[] args) {

        //getInstance()方法返回一个Calendar的子类对象，此处用一个父类类型的对象接收子类对象，为多态
        Calendar obj = Calendar.getInstance();
        System.out.println(obj);
    }
}
