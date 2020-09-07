package com.rapjoee.day08.demo04;

/**
 * ClassName:Demo04Math
 *
 * @Author:baba
 * @Date:2020/1/19 17:32
 * Description:
 * java.util.Math是数学相关工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
 *
 * public static double abs(double num):获取绝对值. 有很多重载。
 * public static double ceil(double num):向上取整.  用途：一车运10箱，36箱需要几车才能运完？
 * public static double floor(double num):向下取整.
 * public static long round(double num):四舍五入.
 *
 * Math.PI代表近似的圆周率常量
 */
public class Demo03Math {
    public static void main(String[] args) {

        //获取绝对值
        System.out.println("3.12的绝对值为："+Math.abs(3.12));    //3.12
        System.out.println("-26.2的绝对值为："+Math.abs(26.2));    //26.2
        System.out.println("0的绝对值为："+Math.abs(0));      //0
        System.out.println("=============================================");
        //向上取整
        System.out.println("3.12向上取整为："+Math.ceil(3.12));       //4.0
        System.out.println("33.92向上取整为："+Math.ceil(33.92));       //34
        System.out.println("=============================================");
        //向下取整
        System.out.println("3.12向下取整为："+Math.ceil(3.12));       //3.12
        System.out.println("-23.8向下取整为："+Math.ceil(-23.8));       //-23.0
        System.out.println("=============================================");
        //四舍五入
        System.out.println("3.12四舍五入为："+Math.round(3.12));     //3
        System.out.println("33.9四舍五入为："+Math.round(33.9));     //34
        System.out.println("-23.5四舍五入为："+Math.round(-23.5));     //-23

        //System.out.println(Math.pow(2,5));
    }
}
