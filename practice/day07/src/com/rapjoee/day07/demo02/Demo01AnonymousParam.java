package com.rapjoee.day07.demo02;

import java.util.Scanner;

/**
 * ClassName:Demo01Anonymous
 *
 * @Author:baba
 * @Date:2020/1/17 9:55
 * Description:
 *    匿名对象：
 *    不需要写左边的类型和对象名，仅可使用一次
 *    new 类名();
 *
 *    匿名对象也可以作为参数与返回值
 *    匿名对象只能使用一次
 */
public class Demo01AnonymousParam {
    public static void main(String[] args) {
        //普通的调用Scanner方式
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        ScannerParam(sc);
*/
        //使用匿名对象
        System.out.println("请输入一个整数：");
        ScannerParam(new Scanner(System.in));
    }
    public static void ScannerParam(Scanner sc1){

        int resultSc= sc1.nextInt();
        System.out.println("输入的整数为："+resultSc);
    }
}
