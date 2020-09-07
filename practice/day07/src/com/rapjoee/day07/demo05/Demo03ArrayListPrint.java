package com.rapjoee.day07.demo05;

import java.util.ArrayList;

/**
 * ClassName:Demo03ArrayListPrint
 *
 * @Author:baba
 * @Date:2020/1/17 19:59
 * Description:
 * 需求：
 * 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起来集合，使用@分隔符分个每个元素。
 * 意即原格式为：[ a , b , c , d ]    现在的格式为：{ a @ b @ c @ d }
 *
 * 思路：
 * 1、有一个方法，需求打印，有参数ArrayList，不需要返回值
 * 2、打印时需要遍历
 *
 * 练习的是集合也可以作为参数，传递过来的是集合的地址值
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();   //创建ArrayList集合

        al.add(20);         //添加元素
        al.add(30);
        al.add(40);
        al.add(90);
        al.add(10);
        al.add(80);
        al.add(50);

        print(al);
    }

    public static void print(ArrayList<Integer> alParam) {

        System.out.println("原格式打印为： " + alParam);
        System.out.println("===============================================");
        System.out.print("指定格式打印为： \n{");
        for (int i = 0; i < alParam.size(); i++) {        //遍历集合
            if (i < alParam.size() - 1) {
                System.out.print(alParam.get(i) + " @ ");    //做判断，不是卒后一个元素则加 @ ，否则加，并打印 }
            } else {
                System.out.println(alParam.get(i)+" }");
            }
        }
    }
}
