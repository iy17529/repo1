package com.rapjoee.day08.demo02;

import java.util.Objects;

/**
 * ClassName:Demo01StringEquals
 *
 * @Author:baba
 * @Date:2020/1/18 17:42
 * Description:
 *==是字符串的地址值的比较，如果确实需要字符串的内容的比较，可以用一下两个方法：
 * （一）、public boolean equals(Object obj):  参数可以是任何的对象【对于字符串比较，只有参数是一个字符串并且内容相同才是true，否则为false】
 *
 * 注意：
 * 1、任何对象都可以用Object进行接收
 * 2、equals方法具有对称性，意即 b.equals(a)和a.equals(b)效果是一样的
 * 3、如果比较双方一个常量一个变量，则推荐把常量字符放在前面
 *      "abc".equals(str)   推荐
 *      str.equals("abc")   不推荐
 *
 * （二）、public boolean equalsIgnoreCase(String str):忽略大小写进行内容比较
 */
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        char [] arrayChar = {'H','e','l','l','o'};
        String str3 = new String(arrayChar);

        System.out.println("str1与str2的比较结果为："+str1.equals(str2));      //false
        System.out.println("str1与str3的比较结果为："+str1.equals(str3));      //true
        System.out.println("str3与str2的比较结果为："+str3.equals(str2));      //false
        System.out.println("str3与Hello的比较结果为："+str1.equals("Hello"));      //true
        System.out.println("Hello与str1的比较结果为："+"Hello".equals(str1));      //true

        String str4 =null;
        System.out.println("常量与变量str4的比较结果为："+"abc".equals(str4));      //推荐，这里输出false，不会报错
        //System.out.println("变量str4与常量的比较结果为："+str4.equals("abc"));      //不推荐，这里会报错  NullPointerException

        //这里引入一个静态的Objects.equals()方法，比较的是两个对象， 是可以容忍空指针的
        boolean b = Objects.equals(str2,str4);
        System.out.println("Objects.equals()方法输出：" + b);

        System.out.println("不区分大小写的比较结果为：" +str1.equalsIgnoreCase(str2));  //true
        System.out.println("严格区分大小写的比较结果为：" +str1.equals(str2));    //false

    }
}
