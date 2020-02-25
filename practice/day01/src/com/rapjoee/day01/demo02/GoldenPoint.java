package com.rapjoee.day01.demo02;

/**
 * ClassName:GoldePoint
 *
 * @Author:baba
 * @Date:2020/2/2 14:21
 * Description:
 * 寻找某两个数相除，其结果离黄金分割点0.618最近
 * 要求：
 * 1. 分母与分子不能同时为偶数
 * 2. 分母分子取值范围为[1~20]
 */
public class GoldenPoint {
    public static void main(String[] args) {
        final double golden = 0.618;        //黄金分割点
        double minDiff = 10000;             //差值
        int ii = 0;                         //找到的分子
        int jj = 0;                         //找到的分母

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % 2 == 0 & j % 2 == 0) {                      //如果同时为偶数跳出此次循环
                    continue;
                }
                double divisor = (double) i / j;                    //取相除
                double minus = Math.abs(divisor - golden);          //相除完的数与黄金分割数的差值的绝对值

                if (minus < minDiff) {
                    minDiff = minus;
                    ii = i;
                    jj = j;
                }
            }
        }
        System.out.println("相除离黄金分割点[0.618]最近的两个数是：" + ii + "/" + jj + "=" + (double) ii / jj);
    }
}
