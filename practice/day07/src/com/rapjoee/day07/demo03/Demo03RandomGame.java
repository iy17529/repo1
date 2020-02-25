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
public class Demo03RandomGame {

    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int answer = ra.nextInt(101);   //产生一个0~100之间的数字作为答案

        System.out.println("游戏开始！！");
        System.out.println("==========================================");
        System.out.print("请输入0~100之间你猜测的数：");


        int resultNum = numPrint(sc,answer);
        if(resultNum < 100 && resultNum > 0 ) {
            Equals(resultNum, answer, sc);
        }else {
            System.out.print("输入有误，请输入0~100之间的数！！");
            resultNum = numPrint(sc,answer);
        }
    }
    public static int numPrint(Scanner scParam,int answerParam) {
        int num = scParam.nextInt();
        return num;
    }
    public static void Equals(int resultNumPa, int answerPa, Scanner scPa) {
        if (resultNumPa > answerPa) {
            System.out.println("您输入的数字过大，请重新输入！");
            System.out.println();
            resultNumPa = numPrint(scPa,answerPa);
            Equals(resultNumPa, answerPa, scPa);
        } else if (resultNumPa < answerPa) {
            System.out.println("您输入的数字过小，请重新输入！");
            System.out.println();
            resultNumPa = numPrint(scPa,answerPa);
            Equals(resultNumPa, answerPa, scPa);
        } else {
            System.out.println("答案是：" + answerPa + ",猜测正确!!");
        }
    }
}

