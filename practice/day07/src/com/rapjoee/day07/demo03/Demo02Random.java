package com.rapjoee.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName:Demo02Random
 *
 * @Author:baba
 * @Date:2020/1/17 10:30
 * Description:
 *
 * 需求：
 * 根据int变量n的值，获取随机数字，范围是[1，n]， 意即可以取到1，也可以取到n。
 */
public class Demo02Random {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        int resultSc = new Scanner(System.in).nextInt();        //匿名Scanner对象

        Random ra = new Random();
        for (int i = 0; i < 50; i++) {
            int resultRa = ra.nextInt(resultSc);
            System.out.println("获取[1,n]范围的随机数"+ (i + 1) +"为：" + (resultRa + 1));
        }
    }
}
