package com.rapjoee.day04.demo03;

/**
 * ClassName:Demo02Print
 *
 * @Author:baba
 * @Date:2020/1/9 15:51
 * Description:
 * 需求：定义方法打印指定次数的HelloWorld
 */
public class Demo02Print {
    /*三要素：
     *   方法名：Print
     *   参数：有，必须指定次数；为int
     *   返回值：没有结果告诉调用处，无需返回值
     * */

    public static void Print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("HelloWorld!!!" + i );
        }
    }

    public static void main(String[] args) {
        Print(20);
    }
}
