package com.rapjoee.day08.demo04;

import java.util.Arrays;

/**
 * ClassName:Demo02ArraysPractice
 *
 * @Author:baba
 * @Date:2020/1/19 16:58
 * Description:
 * 需求：
 * 请使用Arrays相关的api，将一个随机字符串中的所有字符升序排列，并倒序打印
 *
 * 思路：
 * 1.升序排列  Arrays.sort()
 * 2.倒序打印  for 遍历
 * 3.把字符串转换为字符数组，
 */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        //定义一个随机字符串
        String str = "APsovFdsfgMyEIerXSwiTemBvzo";
        System.out.println("字符串为： " + str);
        //字符串转换为字符数组
        char []charString = str.toCharArray();
        //升序
        Arrays.sort(charString);
        System.out.println("打印排序后的字符数组为：" + Arrays.toString(charString));

        //倒序遍历数组
        System.out.print("倒序打印为：");
        System.out.print("[");
        for (int i = charString.length - 1; i >= 0; i--) {
            if(i==0) {
                System.out.println(charString[i] + "]");
            }else {
                System.out.print(charString[i] + ",");
            }
        }
    }
}
