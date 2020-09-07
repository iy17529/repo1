package com.rapjoee.day17.demo02DiGui;

import java.util.Scanner;

/**
 * ClassName:Demo02RecursionSum
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 15:30
 * Description:
 *
 * 使用递归求1~n的和
 *
 * 原理:假设n = 3;
 *      main方法入栈，调用sum方法，传递参数n值为3
 *          sum方法带【 n=3 】入栈，做判断
 *
 */
public class Demo02RecursionSum {
    public static void main(String[] args) {
        System.out.print("请输入n的值：");
        int n = new Scanner(System.in).nextInt();
        int result = sum(n);

        System.out.println("从1~" + n + "的累加求和为：" + result);
    }

    /*
    递归求1~n的值
        可以从 n 开始加，每执行一次使数 -1,一直减到 1 为止

      明确两个东西：
            1. 什么时候停止：当获取到1时停止
            2. 递归的目的:获取下一个被加的值
     */
    private static int sum(int n) {
        //当获取到1时停止
        if(n == 1) {
            return 1;           //这个值返回给上一个调用此方法的方法
        }
        //获取下一个被计算的值
        return n + sum(n - 1);
    }
}
