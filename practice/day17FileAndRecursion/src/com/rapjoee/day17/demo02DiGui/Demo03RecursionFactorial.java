package com.rapjoee.day17.demo02DiGui;

import java.util.Scanner;

/**
 * ClassName:Demo03RecursionFactorial
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 19:10
 * Description:
 *
 * 递归求n的阶乘
 * !n = n*(n-1)*(n-2)*(n-3)...3*2*1
 */
public class Demo03RecursionFactorial {
    public static void main(String[] args) {
        System.out.print("请输入n:");
        int n = new Scanner(System.in).nextInt();

        //最后的积
        int result = factorial(n);
        System.out.println(n + "的阶乘为：" + result);
    }

    /*自定义方法求n的阶乘
            限定条件：乘到1结束
            目的：从n开始减少，获取下一个数
     */
    private static int factorial(int n){
        //如果下一个值为1【到底了】 则返回1，进行返回
        if(n == 1) {
            return 1;
        }
        //否则返回与下一个值的乘积
        return factorial(n -1) * n;
    }
}
