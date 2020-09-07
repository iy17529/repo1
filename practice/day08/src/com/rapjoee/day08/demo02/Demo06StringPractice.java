package com.rapjoee.day08.demo02;

import java.util.Arrays;

/**
 * ClassName:Demo06StringPractice
 *
 * @Author:baba
 * @Date:2020/1/19 11:08
 * Description:
 * 需求：
 * 定义一个方法，把数组{1,2,3}按照指定格式拼接成为一个字符串。格式如下：[word1#word2#word3].
 * <p>
 * 思路：
 * 1、定义一个数组与一个字符串变量，存入三个字符串
 * 2、拼接使用.concat()方法
 * 3、用到：for循环、字符串拼接、每个数组元素之前都有一个word字样、分隔使用的是#、区分一下是不是最后一个
 */
public class Demo06StringPractice {
    public static void main(String[] args) {

        //定义一个int数组
        int[] array1 = {1, 2, 3};
        System.out.println("打印数组为：" + Arrays.toString(array1));   //打印数组
        String resultStr = arrayToArray(array1);
        System.out.println("结果是：" + resultStr);
    }

    /*
    参数：数组   int []
    * 返回值：字符串 String  返回[word1#word2#word3]
    * */
    public static String arrayToArray(int[] arrayParam) {

        String str1 = "[";
        for (int i = 0; i < arrayParam.length; i++) {
            if (i == arrayParam.length - 1) {       //判断如果是最后一个，则后面接]，否则接 #6
                str1 += "word" + arrayParam[i] + "]";       //直接进行字符串的拼接
            } else {
                str1 += "word" + arrayParam[i] + "#";
            }
        }
        return str1;
    }
}
