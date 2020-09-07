package com.rapjoee.day12.demo01Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName:SimpleDateFormatPractice
 *
 * @Author:baba
 * @Date:2020/2/5 13:35
 * Description:
 * 日期时间相关的api的练习
 *
 * 需求：使用日期时间相关的api，计算一个人已经出生了多少天
 *
 * 思路：
 * 1. 给出他的生日并获取系统当前日期时间【可能是格式化过的，如果是，则解析】  Scanner键盘输入、SimpleDateFormat的parse方法进行解析
 * 2. 把日期和生日转化为毫秒值                                          Date类的getTime方法
 * 3. 取两个毫秒值差值
 * 4. 把毫秒值换算为天                                                 一天86400秒
 */
public class SimpleDateFormatPractice {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);             //创建Scanner对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");     //创建SimpleDateFormat对象
        System.out.println("                出生天数计算器");
        System.out.println("============================================");
        System.out.println("请输入出生日期(格式为xxxx/xx/xx)：");
        String birthdayString = sc.nextLine();
        Date birthdayDate = sdf.parse(birthdayString);            //输入的时间解析为标准时间

        Date date = new Date();                                  //获取系统当前时间
        System.out.println("系统当前时间为： " +sdf.format(date));          //格式化日期并输出

        long time1 = date.getTime();                       //当前时间转换为毫秒值
        long birthdayTime = birthdayDate.getTime();         //出生日期转化为毫秒值
        long resultTime = time1 - birthdayTime;              //毫秒值作差
        //System.out.println("毫秒值差值为：" + resultTime);

        int result = (int) (resultTime/1000/(24*60*60));        //毫秒值转换为天数
        System.out.print("这个人已经出生了：" + result + "天，");
        System.out.println("即" + result/365 + "年！");

    }
}
