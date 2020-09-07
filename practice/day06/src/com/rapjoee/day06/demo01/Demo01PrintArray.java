package com.rapjoee.day06.demo01;

import java.util.Arrays;

/**
 * ClassName:Demo01PrintArray
 *
 * @Author:baba
 * @Date:2020/1/10 20:03
 * Description:
 * 分别使用面向过程和面向对象打印一个数组
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] arrayA = new int[]{15, 25, 30, 40, 55, 70, 100};

        //面向过程打印
        //要求格式为：[15,25,30,40,55,70,100]
        System.out.println("面向过程打印数组为：");
        System.out.print("[");
        for (int i = 0; i < arrayA.length; i++) {
            if (i < arrayA.length - 1) {
                System.out.print(arrayA[i] + ", ");
            } else {
                System.out.println(arrayA[i] + "]");
            }
        }
        System.out.println("================================");

        //面向对象打印
        //格式为：[15,25,30,40,55,70,100]
        System.out.println("面向对象打印数组为：\n" + Arrays.toString(arrayA));

    }
}
