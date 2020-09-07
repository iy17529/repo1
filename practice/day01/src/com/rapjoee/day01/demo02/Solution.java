package com.rapjoee.day01.demo02;

import java.util.Scanner;

/**
 * ClassName:Test
 *
 * @Author:baba
 * @Date:2020/1/24 16:05
 * Description:
 */

/*
合同
*/


/*
宠物需要主人
*/
public class Solution {

    public static void main(String[] args) {
  /*      //在此编写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上次考试成绩：");
        int pre = sc.nextInt();
        System.out.println("请输入本次考试成绩：");
        int next = sc.nextInt();

        String a = "HELLO".toLowerCase();
        System.out.println(a);
        System.out.println(Arrays.toString(args));

        double result = (double) (next - pre)/pre;
        System.out.printf("成绩提高百分比为：%.2f\n",result);*/

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入您的体重：");
        double wei = sc1.nextDouble();
        System.out.println("请输入您的身高：");
        double hei = sc1.nextDouble();
        double result = wei / (Math.pow(hei, 2));

        if (result < 18.5) {
            System.out.println("过轻！");
        } else if (result < 25) {
            System.out.println("正常");
        } else if (result < 28) {
            System.out.println("过重！");
        } else if (result < 32) {
            System.out.println("肥胖！");
        } else {
            System.out.println("非常肥胖！！");
        }
    }
}
