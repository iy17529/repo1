package com.rapjoee.day13.day13_1.demo01Collection;

import java.util.ArrayList;

/**
 * ClassName:Demo03ForEach
 *
 * @Author:baba
 * @Date:2020/2/7 12:43
 * Description:
 * 增强for循环  ：for each循环，对数组和集合可以进行遍历
 *
 *      格式：for(集合数据类型 变量名: 集合名){
 *              System.out.print(变量名);
 *    }
 *      【jdk1.5之后新特性】，底层也是迭代器，只能进行遍历，不能取值，删除等操作
 *
 *      所有的单列集合都可以使用for each循环
 */
public class Demo03ForEach {
    public static void main(String[] args) {

        //遍历数组
        String [] arr1 = {"qwe", "wer", "ert", "rty", "tyu", "yui"};
        System.out.println("for each循环数组集合为：");
        for (String s : arr1) {
            System.out.print(s + " ");
        }
        System.out.println("\n=============================================");

        //遍历集合
        ArrayList<Double> al = new ArrayList<>();
        al.add(12.3);
        al.add(23.4);
        al.add(34.5);
        al.add(45.6);
        al.add(56.7);
        al.add(67.8);
        System.out.println("for each循环遍历集合为：");
        for (Double aDouble : al) {
            System.out.print(aDouble + " ");
        }
    }
}
