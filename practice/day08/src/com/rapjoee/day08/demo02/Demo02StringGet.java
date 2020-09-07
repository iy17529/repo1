package com.rapjoee.day08.demo02;

/**
 * ClassName:Demo02StringGet
 *
 * @Author:baba
 * @Date:2020/1/18 18:54
 * Description:
 * string当中与获取有关的方法如下：
 * 1、public int length():获取字符串当中含有的字符个数，即拿到字符串的长度
 * 2、public String concat(String str):将当前字符串与参数字符串拼接新的字符串作为成为返回值
 * 3、public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
 * 4、public int indexOf(String str):查找参数字符串在本字符当中首次出现的索引位置，如果没有则返回-1值
 */
public class Demo02StringGet {

    public static void main(String[] args) {

        //.length()方法获取字符串的长度
        int getLength = "asnaclaifoennvlvpavsbsgr".length();
        System.out.println("length()方法获取字符串长度为:" + getLength);      //24
        System.out.println("========================================================");

        //.concat()方法拼接字符串
        String str1 = "Hello";
        String str2 = "Java";
        String strResult1 = str1.concat(str2);
        System.out.println("concat方法str1与str2拼接结果为：" + strResult1);     //HelloJava
        String strResult2 = str1.concat("hahahahaha");
        System.out.println("concat方法str1与常量字符串拼接结果为：" + strResult2);        //Hellohahahahaha
        System.out.println("========================================================");

        //.charAt()方法获取指定索引位置的字符
        char cr = "alsidncasdoapaiefdkasasd".charAt(6);
        System.out.println("charAt方法获取字符的结果为：" +cr);        //c
        System.out.println("========================================================");

        //.indexOf()方法获取首次出现的索引位置

        int b = "abcdefghijk".indexOf("def");
        System.out.println("\"def\"字符串第一次出现的索引位置为：" + b);    //返回索引位置3
        int c = "abcdefghijk".indexOf("dae");
        System.out.println("\"def\"字符串第一次出现的索引位置为：" + c);   //没有则返回 -1

    }
}
