package com.rapjoee.day01.demo03;

import java.util.Scanner;

/**
 * ClassName:Test
 *
 * @Author:baba
 * @Date:2020/2/4 12:27
 * Description:
 */
public class DiGuiTest {
    public static void main(String[] args) {

        //一个输入测试，输入不符合条件则重新输入
        System.out.println("请输入一个整数，范围为(0~100)：");
        print();
    }

    private static void print() {
        int a = new Scanner(System.in).nextInt();       //匿名对象
        if(a > 100 || a < 0){
            System.out.println("输入错误！！请重新输入：");
            print();
        }else {
            System.out.println("您输入的数为： " + a);
        }
    }
}
