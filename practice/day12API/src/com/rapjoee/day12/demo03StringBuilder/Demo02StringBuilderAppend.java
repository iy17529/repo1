package com.rapjoee.day12.demo03StringBuilder;

/**
 * ClassName:Demo02StringBuilder
 *
 * @Author:baba
 * @Date:2020/2/5 16:49
 * Description:
 * 学习StringBuilder类的几个主要的方法：
 *          1. public StringBuilder append(...)方法 添加任意类型数据【多中重载形式的方法】的字符串形式，【并返回当前对象自身】，即不需要返回值接收
 *          2. public String toString()方法：将当前StringBuilder对象转换为String对象
 */
public class Demo02StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("qwe");                //带参构造初始化一个字符串对象
        StringBuilder append1 = stringBuilder1.append("rtyvsfm?//");            //给对象添加数据

        System.out.println(stringBuilder1);
        System.out.println(append1);

        //比较原对象和返回对象的地址值        [返回给自身，不需要接收返回值]
        System.out.println("地址值比较为：" + (append1 == stringBuilder1));     //结果true

        //直接加在序列后面并追加到此序列  源码中返回的是this，谁调用的append方法，就返回谁
        stringBuilder1.append("abd");
        stringBuilder1.append(345);
        stringBuilder1.append(1111.9F);
        stringBuilder1.append('P');
        stringBuilder1.append("吃饭饭！");

        System.out.println(stringBuilder1);

        //链式编程。返回值是一个对象时，可以直接接在后面写方法
        System.out.println("aIUBc".toString().toLowerCase().toUpperCase().toLowerCase().toUpperCase());

        stringBuilder1.append("aaa").append(123).append("85io").append(34.7F);
        System.out.println(stringBuilder1);
    }
}
