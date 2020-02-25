package com.rapjoee.day08.demo01;

/**
 * ClassName:Demo02StringPool
 *
 * @Author:baba
 * @Date:2020/1/18 17:15
 * Description:
 * 字符串常量池：程序中直接写上的双引号字符串，就在字符串常量池中
 *
 * 对于基本类型来说，==是进行数值的比较
 * 对于引用类型来说，==是进行【地址值】的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char [] arrayChar = new char[]{'a','b','c'};
        String str3 = new String(arrayChar);
        System.out.println(str1==str2);         //true
        System.out.println(str1==str3);        //false
        System.out.println(str3==str2);        //false

    }
}
