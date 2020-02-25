package com.rapjoee.day12.demo01Date;

/**
 * ClassName:Demo01Date
 *
 * @Author:baba
 * @Date:2020/2/4 17:55
 * Description:
 * 学习Date类:表示日期与时间的类
 *      类Date表示特定的瞬间，精确到毫秒（1/1000s）
 *    毫秒值的作用：可以对时间与日期进行计算
 *
 *  把日期转换为毫秒：
 *          当前的日期：xxxx-xx-xx
 *          时间原点(0毫秒)：1970  1 月 1 日 00:00:00（英国格林威治皇家天文台）
 *
 *  注意：中国属于东八区，会把时间增加8个小时
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println("现在到时间原点的毫秒值为：" + System.currentTimeMillis());       //获取当前时间到时间原点的毫秒值
    }
}
