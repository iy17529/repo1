package com.rapjoee.day08.demo01;

/**
 * ClassName:Demo01String
 *
 * @Author:baba
 * @Date:2020/1/18 11:00
 * Description:
 * java.Lang.String类代表字符串。
 *
 * API当中说：Java程序中的所有字符串字面值（如"abc"）都作为此类的实例实现。
 * 其实就是说：程序当中所有的双引号字符串，都是 string类的对象。（就算没有new，也照样是。）
 *
 * 字符串的特点：
 * 1.字符串的内容永不可变。        【重点】
 * 2.正是因为字符串不可改变，所以字符串是可以共享使用的。
 * 3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。
 * 创建字符串的常见3+1种方式。
 * 3种构造方法:
 * public String()：创建一个无参空白字符串，不含内容
 * public String(char[] array):根据字符数组的内容，来创建对应的字符串。
 * public String(byte[] array):根据字节数组的内容，来创建对应的字符串。
 *
 * 1种直接创建：
 * String str = "Hello";
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("无参创建创建为：" + str1);

        //字符数组创建
        char [] arrayChar = new char[]{'A','B','C','D','E','F'};
        String str2 =new String(arrayChar);
        System.out.println("字符数组创建为：" + str2);

        //字节数组创建
        byte [] arrayByte = new byte[]{78,79,80,81,82,83};
        String str3 = new String(arrayByte);
        System.out.println("字节数组创建为：" + str3);

        //直接创建
        String str4 = "Hello!!";
        System.out.println("直接创建为：" + str4);

        String str5 = new String("World");      //问：这句在内存中会创建几个字符串对象
        System.out.println(str5);                       //答：一个或者两个，如果常量池中存在 "World" ，则hi在堆内存中创建一个"World"对象
                                                        //   如果常量池中不存在则常量池中创建一个，堆内存中创建一个


    }

}
