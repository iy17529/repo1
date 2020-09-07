package com.rapjoee.day08.demo04;

/**
 * ClassName:Demo04MathPractice
 *
 * @Author:baba
 * @Date:2020/1/19 17:58
 * Description:
 * 需求：
 * 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个，并输出
 *
 * 思路：
 * 1.取定范围-10.8~5.9之间，则整数范围为：-10~5
 *      -10转化有两种方法，一种是(int)强转
 *                       一种是Math.ceil()方法，转化为double型，也可以++
 * 2.for循环遍历
 * 3.定义一个计数器，每获得一个符合条件的，就++
 * 4.拿到绝对值，Math.abs()
 */
public class Demo04MathPractice {
    public static void main(String[] args) {

        int countNum = 0;       //计数器
        double min = -10.8;
        double max = 5.9;

        double temp = Math.ceil(min);    //Math.ceil方法把min转化为整数
        System.out.println("所有的整数为：");
        System.out.print("[");
        for(double i = temp;i < max;i++){
            double abs = Math.abs(i);
            if( abs < 2.1||abs > 6.0) {         //小范围进行约束
                if(i == Math.floor(2.1)) {      //如果是最后一个则打印一个]，否则带 ,
                    System.out.println(i + "]");
                }else {
                    System.out.print(i + ",");
                }
                countNum++;
            }
        }
        System.out.println("范围内共"+countNum+"个整数");

    }
}
