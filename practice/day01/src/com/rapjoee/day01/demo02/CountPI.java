package com.rapjoee.day01.demo02;

/**
 * ClassName:Test
 *
 * @Author:baba
 * @Date:2020/1/27 16:29
 * Description:
 * 计算π的近似值
 *
 * π/4 = 1 - 1/3 + 1/5 -1/7 + 1/9...
 */
public class CountPI {
    public static void main(String[] args) {
        //计算π的近似值
        double pi = 0;
        long start = System.currentTimeMillis();
        for (long i = 1, j = 1; i <= 900000; i = i + 2, j++) {
            if (j % 2 == 0) {
                pi -= (double) 1 / i;
            } else {
                pi += (double) 1 / i;
            }
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println("执行for循环时间为： " + (double)result/1000 + "s");

        double re = (double) 4 * pi;
        System.out.println((re));
    }
}
