package com.rapjoee.day08.demo02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:Demo07StringCount
 *
 * @Author:baba
 * @Date:2020/1/19 14:35
 * Description:
 * 需求：键盘输入一个字符串并且统计其中各种字符出现的次数。
 * 种类有：大写字母、小写字母、数字、其他
 * <p>
 * 思路：
 * 1、键盘输入    Scanner
 * <p>
 * 2、拆分成字节数组，查阅ASCII表
 * 48~57        为0~9
 * 65~90        为大写字母A~Z
 * 97~122       为小写字母a~z
 * 之外的都属于其他字符
 * 3、遍历字节数组，进行判断，分四种情况   for
 */
public class Demo07StringCount {
    public static void main(String[] args) {

        int num = 0;            //阿拉伯数字计数
        int majuscule = 0;      //大写字母计数
        int minuscule = 0;      //小写字母计数
        int other = 0;          //其他字符计数

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个任意字符串：");
        String str = sc.next();

        /*
                //第一种方法
        byte[] Array1 = str.getBytes();        //转换为字节数组
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] >= 48 && Array1[i] <= 57) {     //为阿拉伯数字0~9
                num++;
            } else if (Array1[i] >= 65 && Array1[i] <= 90) {        //为大小字母
                majuscule++;
            } else if (Array1[i] >= 97 && Array1[i] <= 122) {      //为小写字母
                minuscule++;
            } else {                                                    //其他字符
                other++;
            }
        }*/

        //或者转换为字符数组
        //第二种方法
        char[] Array1 = str.toCharArray();
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] >= 'A' && Array1[i] <= 'Z') {   //运算时，字符可以自动提升为int进行预算，因此这里直接写即可
                majuscule++;
            } else if (Array1[i] >= 'a' && Array1[i] <= 'z') {
                minuscule++;
            } else if (Array1[i] >= '0' && Array1[i] <= '9') {
                num++;
            } else {
                other++;
            }
        }

        System.out.println("输入的字符串为：" + str);
        System.out.println("转换数组成为：" + Arrays.toString(Array1));
        System.out.println("其中大写字母字符个数为：" + majuscule);
        System.out.println("小写字母字符个数为：" + minuscule);
        System.out.println("其他字符个数为：" + other);
        System.out.println("阿拉伯数字字符个数为：" + num);
    }
}
