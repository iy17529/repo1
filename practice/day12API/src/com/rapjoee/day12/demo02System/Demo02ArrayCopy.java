package com.rapjoee.day12.demo02System;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:Demo02ArrayCopy
 *
 * @Author:baba
 * @Date:2020/2/5 15:16
 * Description:
 *
 * arrayCopy()方法
 *      参数：src - 源数组。
 *           srcPos - 源数组中的起始位置。
 *           dest - 目标数组。
 *           destPos - 目标数据中的起始位置。
 *           length - 要复制的数组元素的数量。
 *
 * arrayCopy()方法练习：将源数组前3个元素，赋值到目标数组的前3个位置上
 *      源数组元素：[1, 2, 3, 4, 5]       复制后  [1, 2, 3, 4, 5]
 *      目标数组元素：[6, 7, 8, 9, 10]     复制后 [1, 2, 3, 9, 10]
 */
public class Demo02ArrayCopy {
    public static void main(String[] args) {
        demo01ArrayCopy();
    }

    private static void demo01ArrayCopy() {
        Random ra = new Random();
        int []arrA =new int[8];                              //创建源数组
        int []arrB =new int[8];                              //创建目标数组
        for (int i = 0; i < arrA.length; i++) {
            //随机数给两个数组赋值
            arrA[i] = ra.nextInt(2);     //0~1
            arrB[i] = ra.nextInt(99);       //0~99
        }

        System.out.println("复制前：");
        System.out.println("数组A:" + Arrays.toString(arrA));     //使用System的arrayCopy方法
        System.out.println("数组B:" + Arrays.toString(arrB));
        System.arraycopy(arrA,0,arrB,0,3);
        System.out.println("复制后：");
        System.out.println("数组A:" + Arrays.toString(arrA));
        System.out.println("数组B:" + Arrays.toString(arrB));
    }
}
