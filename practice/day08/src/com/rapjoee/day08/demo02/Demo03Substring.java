package com.rapjoee.day08.demo02;

/**
 * ClassName:Demo04Substring
 *
 * @Author:baba
 * @Date:2020/1/18 19:19
 * Description:
 * 学习字符串截取的相关方法：
 * 1、public String substring(int index):从索引位置index开始截取一直到字符串结束，返回新字符串
 * 2、public String substring(int begin,int end):截取位置[begin,end)中间的字符串，包含左边，不包含右边
 */
public class Demo03Substring {
    public static void main(String[] args) {

        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str1Substring1 = str1.substring(18);
        System.out.println("原字符串为：" + str1);
        System.out.println("从索引"+18+"处截取后字符串为：" + str1Substring1);      //stuvwxyz
        System.out.println("=============================================");
        String str1Substring2 = str1.substring(3,15);       //左闭右开
        System.out.println("原字符串为：" + str1);
        System.out.println("从索引"+18+"处截取后字符串为：" + str1Substring2);      //defghijklmno

        /*
        下面的写法，并不是改变了字符串的内容
        而是改变了变量str11的地址值
        */
        String str11 = "Hello";
        System.out.println(str11);      //Hello
        str11 = "World";
        System.out.println(str11);      //World
    }
}
