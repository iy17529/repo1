package com.rapjoee.day08.demo02;

import java.util.Arrays;

/**
 * ClassName:Demo05StringSplit
 *
 * @Author:baba
 * @Date:2020/1/19 10:53
 * Description:
 * 学习字符串分割的相关知识：
 * 方法：public String[] split(String regex):按照参数的规则，把字符串分隔为若干片段
 *
 *注意事项：split方法的参数其实是一个正则表达式
 *  若要根据英文句点 . 进行分割，格式写成“\\.”(两个反斜杠)
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String initString1 = "aaa,bbb,ccc,ddd,eee";
        String array1[] = initString1.split(",");        //按照 , 进行分割
        System.out.println("分割后的结果为："+Arrays.toString(array1));

        String initString2 = "qqq bbb www ddd eee";
        String array2[] = initString2.split(" ");        //按照 空格 进行分割
        System.out.println("分割后的结果为："+Arrays.toString(array2));

        String initString3 = "How.are.you";
        String array3[] = initString3.split("\\.");        //按照 . 进行分割
        System.out.println("分割后的结果为："+Arrays.toString(array3));

    }
}
