package com.rapjoee.day12.demo04Integer;

/**
 * ClassName:Demo03IntegerAndString
 *
 * @Author:baba
 * @Date:2020/2/6 17:08
 * Description:
 * 基本类型与字符串类型之间的相互转换
 *
 * 1. 基本类型  -->  字符串
 *      1.1 直接 基本类型数据 + ""   【最简单的方式，常用】
 *      1.2 使用包装类的静态方法toString()方法
 *                  static String toString(int i);     返回一个表示指定整数的String对象
 *      1.3 使用String的静态方法valueOf(int i)
 *                  static String valueOf(int i)
 * 2. 字符串  --->  基本类型
 *      包装类的方法，以Integer举例
 *                  【Integer类】static int parseInt(String s)  将字符串参数作为有符号的十进制整数进行解析。
 *         其他的如  【Double类】 static double parseDouble(String s)
 *
 */
public class Demo03IntegerAndString {
    public static void main(String[] args) {
        //1. 基本类型  -->  字符串
        int i1 = 80;
        String s1 = i1 + "";                        // 1. 基本类型 + ""
        System.out.println(s1 + 70);

        Integer integer2 = 55;
        String s2 = Integer.toString(integer2);     // 2. 包装类的静态toString方法
        System.out.println(s2);

        String s3 = String.valueOf(69);              // 3. String类的 valueOf方法
        System.out.println(s3);

        System.out.println("============================");

        // 2. 字符串  --->  基本类型
        String s4 = "678";
        int i4 = Integer.parseInt(s4);
        System.out.println(i4);
    }
}
