package com.rapjoee.day08.demo04;

import java.util.Arrays;

/**
 * ClassName:Demo01Arrays
 *
 * @Author:baba
 * @Date:2020/1/19 16:43
 * Description:
 * 学习Arrays类的使用(主要是两个静态方法)
 * public String toString(数组)：将参数数组按照默认格式转换为字符串[元素1,元素2,元素2,元素4,]
 *
 * public void sort(数组)：将参数数组按照默认升序方式对数组进行排序
 * 注意：
 *      1.如果是数值数组，则按照从小到大升序
 *      2.如果是字符串数组，则按照字母顺序
 *      3.如果是自定义的类型，那么这个自定义的类需要有 Comparable或者 Comparator接口的支持。（今后学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int [] array1 = {12,45,78,56,43,15};
        String str1 = Arrays.toString(array1);
        System.out.println("数组转换后为："+ str1);

        Arrays.sort(array1);        //数值数组排序
        String str2 = Arrays.toString(array1);
        System.out.println("数值数组排序后为："+ str2);

        String [] array2 = {"aaa","yyy","kkk","eee","ppp"};
        Arrays.sort(array2);
        System.out.println("字符串数组排序后为："+ Arrays.toString(array2));

    }
}
