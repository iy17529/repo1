package com.rapjoee.day04.demo03;

/**
 * ClassName:sum100
 *
 * @Author:baba
 * @Date:2020/1/9 15:41
 * Description:
 * 定义方法，求0-100的累加值
 */
public class Demo01Sum100 {


    /**
     * 三要素：
     * 参数：无需参数
     * 返回值：有返回值，结果为int型
     * 方法名：getSum
     **/
    public static void main(String[] args) {
        System.out.println("1~100累加的结果为："+getSum());
    }

    public static int getSum() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        return result;
    }
}
