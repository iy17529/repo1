package com.rapjoee.day07.demo01;

import java.util.Scanner;

/**
 * ClassName:Demo03ScannerMax
 *
 * @Author:baba
 * @Date:2020/1/16 20:24
 * Description:
 * 需求：
 * 键盘输入三个int数字，然后求出其中的最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = sc1.nextInt();
        System.out.print("请输入第二个整数：");
        int b = sc1.nextInt();
        System.out.print("请输入第三个整数：");
        int c = sc1.nextInt();

        System.out.println("其中最大值为：" + max(a, b, c));

    }

    public static int max(int paramA, int paramB, int paramC) {
        /*要素：
         * 方法名：max
         * 参数：接收三个来自键盘的数字
         * 返回值：返回三个数字中的最大值
         * */

       /* int max = paramA;
        if (max < paramB) {
            max = paramB;
        }
        if (max < paramC) {
            max = paramC;
        }
        */
        //第二种比较方法：
        int temp = paramA > paramB ? paramA : paramB;
        int max = temp > paramC ? temp : paramC;

        return max;
    }
}
