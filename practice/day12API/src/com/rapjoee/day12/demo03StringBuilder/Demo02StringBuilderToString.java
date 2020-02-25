package com.rapjoee.day12.demo03StringBuilder;

/**
 * ClassName:Demo02StringBuilder
 *
 * @Author:baba
 * @Date:2020/2/5 16:49
 * Description:
 * 学习StringBuilder类的方法：
 *
 * String与StringBuilder可以相互转换
 *          1. String  -->  StringBuilder  使用StringBuilder的构造方法。把String对象传递进去即可
 *          1. StringBuilder  -->  String  用StringBuilder的toString方法  将当前StringBuilder对象转换为String对象
 *                  public String toString()
 */
public class Demo02StringBuilderToString {
    public static void main(String[] args) {

        String strStart = new String("Hello");                             //创建一个字符串对象
        System.out.println("str:" + strStart);

        StringBuilder stringBuilder1 = new StringBuilder(strStart);                //带参构造转换为StringBuilder对象
        stringBuilder1.append("/retoi");                                      //字符串添加到序列后面并返回到自身

        System.out.println("stringBuilder1：" + stringBuilder1);
        String strEnd = stringBuilder1.toString();                                 //toString方法转换为String类型对象
        System.out.println("strEnd：" + strEnd);
    }
}
