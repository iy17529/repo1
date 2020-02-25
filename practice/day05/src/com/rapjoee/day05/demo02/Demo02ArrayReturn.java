package com.rapjoee.day05.demo02;

import java.util.Scanner;

/**
 * ClassName:Demo02ArrayReturn
 *
 * @Author:baba
 * @Date:2020/1/10 18:40
 * Description:
 * 一个方法可以有多个参数，但是只能有0/1个返回值，不能有多个返回值。
 * 如果希望返回值多个数据
 * 可以使用一个数组作为返回值类型
 *      题目：方法返回值三个数据的总和与其平均数
 *
 *    总结：任何数据类型都可以作为方法的参数类型，或者返回类型。
 *
 *    数组作为方法的参数，传递进去的其实是数组的地址值
 *    数组作为方法的返回值，返回的也是数组的地址值。
 */
public class Demo02ArrayReturn {
    public static int[] arrayReturn(int a, int b, int c) {
        int sum = a + b + c;
        int avg = (sum) / 3;
        int[] arrayA = {sum, avg};

        return arrayA;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        //创建Scanner对象
        System.out.println("请输入三个整数：");
        int a = sc.nextInt();                       //获取三个参数
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] resultA = arrayReturn(a, b, c);
        System.out.println("三个数的总和是：" + resultA[0]);
        System.out.println("三个数的平均数是：" + resultA[1]);
    }
}
