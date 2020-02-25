package com.rapjoee.day07.demo03;

import java.util.Random;

/**
 * ClassName:Demo01Random
 *
 * @Author:baba
 * @Date:2020/1/17 10:13
 * Description:
 * 学习使用Random的API
 * 1、导包         import java.util.Random;
 * 2、创建         Random ra = new Random();    小括号留空即可，构造方法可以没有参数
 * 3、使用
 *      3、1     int resultRa = ra.nextInt();     nextInt()无参数则是获取一个随机的int数字，范围是int范围所有（包括正负）
 *      3、2     int resultRa = ra.nextInt(5);    有参数则是代表左闭右开区间[),此处范围是0~4
 */
public class Demo01Random {

    public static void main(String[] args) {
        double max = 0.5;
        double min = 0.5;

        Random ra = new Random();
        int resultRa = ra.nextInt();
        System.out.println("无参获取的随机数为：" +resultRa);

        for (int i = 0; i < 10; i++) {
            int raI = ra.nextInt(15);
            System.out.println("有参获取的随机数" + i + "是" + raI);
        }

        for (int i = 0; i < 99999; i++) {
            double randomMath = Math.random();          //Math.random()默认产生大于等于0.0且小于1.0之间的随机double型随机数
            max = Math.max(randomMath,max);
            min = Math.min(randomMath,min);
        }
        System.out.println("最大值为： " + max);
        System.out.println("最小值为： " + min);
    }
}
