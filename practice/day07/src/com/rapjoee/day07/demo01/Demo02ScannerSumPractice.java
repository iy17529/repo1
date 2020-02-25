package com.rapjoee.day07.demo01;

import java.util.Scanner;

/**
 * ClassName:Demo02ScannerSumPractice
 *
 * @Author:baba
 * @Date:2020/1/16 20:14
 * Description:
 * 需求：从键盘输入两个int数字进行求和
 */
public class Demo02ScannerSumPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //创建

        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();                  //使用
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        System.out.println("这两个整数的和是：" + sum(a, b));
    }
    public static int sum(int paramA, int paramB) {
        int sum = paramA + paramB;
        return sum;
    }
}
