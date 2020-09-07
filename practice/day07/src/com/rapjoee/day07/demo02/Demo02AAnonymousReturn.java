package com.rapjoee.day07.demo02;

import java.util.Scanner;

/**
 * ClassName:Demo02AAnonymousReturn
 *
 * @Author:baba
 * @Date:2020/1/17 10:05
 * Description:
 * 匿名对象也可以作为返回值
 * 匿名对象只能使用一次
 */
public class Demo02AAnonymousReturn {

    public static void main(String[] args) {

        int resultSc = scannerReturn().nextInt();
        System.out.println("输入的整数为：" + resultSc);
    }

    public static Scanner scannerReturn(){
        System.out.println("请输入一个整数:");
        return new Scanner(System.in);
    }
}
