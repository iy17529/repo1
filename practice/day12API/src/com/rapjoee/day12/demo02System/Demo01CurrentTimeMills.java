package com.rapjoee.day12.demo02System;

/**
 * ClassName:Demo01CurrentTimeMills
 *
 * @Author:baba
 * @Date:2020/2/5 14:44
 * Description:
 * java.lang.System类提供了大量的静态方法，用来获取与系统相关的信息或者系统级操作
 * 常用的有两个方法：
 *      public static long currentTimeMills()   返回系统当前时间，返回值单位为毫秒值【距离时间原点】
 *      public static void arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)
 *      将数组中指定的数据复制到另一个数组中
 *
 *   currentTimeMills方法练习，验证for循环打印数字1~9999所需要的时间（毫秒）
 */
public class Demo01CurrentTimeMills {
    public static void main(String[] args) {
        long pre = System.currentTimeMillis();      //获取打印前的毫秒值
        for (int i = 1; i <= 9999; i++) {           //执行for循环
            System.out.println(i);
        }
        long next = System.currentTimeMillis();     //获取打印后的毫秒值
        long result = next - pre;                   //取差值

        System.out.print("所需时间为：" + result + "ms");
        System.out.println("，即" + (double)result/1000 + "s");
    }
}
