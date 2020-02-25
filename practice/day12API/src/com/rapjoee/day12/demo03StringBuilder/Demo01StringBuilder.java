package com.rapjoee.day12.demo03StringBuilder;

/**
 * ClassName:Demo01StringBuilder
 *
 * @Author:baba
 * @Date:2020/2/5 16:42
 * Description:
 * 学习StringBuilder类
 * java.lang.StringBuilder  此为可变长字符串缓冲区，一个可变的字符序列
 *
 * 其有两个常用的构造方法
 * 1. StringBuilder()
 *           构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
 * 2. StringBuilder(String str)
 *           构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();                         //空参构造，不带任何字符串
        System.out.println("空参构造对象如下：" + stringBuilder1);
        StringBuilder stringBuilder2 = new StringBuilder("How da you do?");         //带参构造，初始化为指定的字符串
        System.out.println("带参构造对象如下：" + stringBuilder2);
    }
}
