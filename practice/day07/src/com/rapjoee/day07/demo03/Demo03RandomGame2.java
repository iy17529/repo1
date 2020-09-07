package com.rapjoee.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName:Demo03RandomGame
 *
 * @Author:baba
 * @Date:2020/1/17 10:46
 * Description:
 * 需求：
 * 设计一个猜数字的小游戏
 * <p>
 * 思路：
 * 1、产生一个随机数作为答案，且一旦产生不可改变
 * 2、从键盘输入每次猜的数字
 * 3、对键盘输入的数字与答案进行比较，此处判断语句
 *      3.1、大于答案则提示太大，并重试
 *      3.2、小于答案则提示太小，并重试
 * 3.3、相同则Win!
 * 4、重试为循环语句
 */
public class Demo03RandomGame2 {

    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int answer = ra.nextInt(101);   //产生一个0~100之间的数字作为答案
        int temp = 0;               //输入的数


        System.out.println("游戏开始！！");
        System.out.println("==========================================");
        System.out.print("请输入0~100之间你猜测的数：");

        int ww = print(temp);
        equalsPrint(ww,answer);
    }

    private static void equalsPrint(int tempParam,int answerParam) {
        if(tempParam > answerParam){
            int temp1 = 0;
            System.out.println("您输入的数过大！请重新输入：");
            System.out.println();
            int ww = print(temp1);
            equalsPrint(ww,answerParam);
        }else if(tempParam < answerParam){
            int temp1 = 0;
            System.out.println("您输入的数过小！请重新输入：");
            System.out.println();
            int ww = print(temp1);
            equalsPrint(ww,answerParam);
        }else {
            System.out.println("答案是：[" + answerParam + "] 猜测正确!!");

        }
    }

    public static int print(int temp1) {
        int qq = new Scanner(System.in).nextInt();
        if(qq > 100 || qq < 0){
            System.out.println("输入错误！！请重新输入：");
           int ww = print(temp1);
        }
        return qq;
    }
}

