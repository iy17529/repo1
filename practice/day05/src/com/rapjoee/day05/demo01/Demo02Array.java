package com.rapjoee.day05.demo01;

import java.util.Arrays;

/**
 * ClassName:Demo02Array
 *
 * @Author:baba
 * @Date:2020/1/9 18:24
 * Description:
 */
public class Demo02Array {

    public static void main(String[] args) {
        //直接创建数组，存放内容为：几个整形数字5,15,20
        int[] arrayA = new int[]{5, 15, 20};
        System.out.println(Arrays.toString(arrayA));

        //直接创建数组，存放内容为：几个字符串
        //省略格式的初始化
        String[] arrayB = {"AAA", "BBB", "ccc", "uio"};
        System.out.println(Arrays.toString(arrayB));

    }
}
