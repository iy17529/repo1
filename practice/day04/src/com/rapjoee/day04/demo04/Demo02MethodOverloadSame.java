package com.rapjoee.day04.demo04;

import java.sql.SQLOutput;

/**
 * ClassName:Demo02MethodOverloadSame
 *
 * @Author:baba
 * @Date:2020/1/9 16:41
 * Description:
 * <p>
 * 比较两个数据是否相同
 * 两个数据分别为两个byte,两个int，两个short，两个long
 */
public class Demo02MethodOverloadSame {
    /*
    三要素：
        参数：两个参数
        返回值：是否相同，返回值类型为boolean
        方法名：Same即可
    */
    // boolean isSame;
    public static void main(String[] args) {
        System.out.println("byte数据比较结果为：" + Same(20, 19));
        System.out.println("int数据比较结果为：" + Same(23, 23));
        System.out.println("long数据比较结果为：" + Same(29999, 899));
        System.out.println("short数据比较结果为：" + Same(34, 67));
    }

    public static boolean Same(byte a, byte b) {
        return a == b;
    }

    public static boolean Same(short a, short b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Same(int a, int b) {
        boolean isSame;
        return isSame = a == b ? true : false;
    }

    public static boolean Same(long a, long b) {
        boolean isSme;
        if (a == b) {
            isSme = true;
        } else {
            isSme = false;
        }
        return isSme;
    }
}
