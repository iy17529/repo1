package com.rapjoee.day08.demo02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:Demo04StringConvert
 *
 * @Author:baba
 * @Date:2020/1/18 19:42
 * Description:
 * 学习字符串的转换相关方法
 * 1、public char[] toCharArray():将当前字符串拆分成字符数组作为返回值。
 * 2、public byte[] getBytes():获得当前字符串底层的字节数组。
 * 3、public String replace(CharSequence oldString,CharSequence newString): 将所有出现的老字符串替换成新的字符串，替换之后的新字符串作为返回值
 */
public class Demo04StringConvert {
    public static void main(String[] args) {

        //toCharArray()方法拆分字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str1 = sc.next();
        char [] charResult = str1.toCharArray();
        System.out.println("拆分此的字符数组为" );
        System.out.println(Arrays.toString(charResult));
        System.out.println("===================================");

        //getBytes()方法获得底层字节数组
        byte [] byteResult = str1.getBytes();
        System.out.println();
        System.out.println("拆分此字符串后的字符数组为" );
        System.out.println(Arrays.toString(byteResult));
        System.out.println("===================================");

        //replace替换
        //System.out.println("请输入要替换的字符串：");
        //String str2 = sc.next();
        String str2 ="How do you do?";
        String strReplace1 = str2.replace("o","*");
        System.out.println("把 “o” 替换成 “*” 后的字符串为：" + strReplace1);
        System.out.println("===================================");

        //用处
        String str3 = "会不会玩啊！！你大爷的！！啊你大爷的，你大爷的！！";
        String str3Replace = str3.replace("大爷","*");
        System.out.println("原字符串为："+str3);
        System.out.println("替换后的字符串为："+str3Replace);

    }
}
