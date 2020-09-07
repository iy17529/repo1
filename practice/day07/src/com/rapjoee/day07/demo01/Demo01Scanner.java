package com.rapjoee.day07.demo01;

import java.util.Scanner;

/**
 * ClassName:Demo01Scanner
 *
 * @Author:baba
 * @Date:2020/1/16 17:27
 * Description:
 *
 *      引用类型使用的步骤：
 *    1、导包
 *        import 包路径.类名;
 *        和当前类在同一个包下则不需要import
 *        java.lang包下的可以不写import
 *    2、创建
 *          类名 对象名 = new 类名();
 *
 *    3、使用
 *          对象名.方法名();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2、创建  System.in表示从键盘输入
        Scanner sc1=new Scanner(System.in);

        ////获取键盘输入的一个int数字：sc.nextInt();    调用此方法就返回一个int数字
        //获取键盘输入的字符串，则是 String str = sc.next();输入的其实都是字符串，只不过像nextInt是把字符串转化为int型
        System.out.print("请输入数字：");
        int resultSc = sc1.nextInt(); //用int型的resultSc进行接收
        System.out.println("输入的数字为："+resultSc);

        //键盘输入字符串
        System.out.print("请输入一个字符串：");
        String str1=sc1.next();
        System.out.println("输入的字符串为："+str1);


    }
}
