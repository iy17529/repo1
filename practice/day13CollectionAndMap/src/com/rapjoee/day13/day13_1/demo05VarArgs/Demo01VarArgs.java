package com.rapjoee.day13.day13_1.demo05VarArgs;

/**
 * ClassName:Demo01VarArgs
 *
 * @Author:baba
 * @Date:2020/2/8 15:28
 * Description:
 *
 * 学习可变参数
 *      是jdk1.5之后的新特性
 *    底层原理：可变参数底层是一个数组，根据传递的参数不同，创建不同长度的数组来存储
 *
 *    使用场合：当方法的参数列表的数据类型确定，但参数的个数不确定时，可以使用可变参数
 *
 *    格式：
 *              修饰符 返回值类型 方法名(数据类型...参数名){
 *              //...}
 *
 *
 *     注意：使用可变参数时
 *          1. 一个方法中，只能有一个可变参数  【public void method(int...i, double...d)】是错误的
 *          2. 一个方法中除了有可变参数之外的参数，则可变参数置于最后面
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int result = sum(0,12, 20, 30, 40);      //求多个参数的和，第一个参数为 记录加法次数
        System.out.println("多个参数的和为：" + result);
    }

    //一个含有可变参数的方法
    //第一个参数记录参数有多少个
    private static int sum(int counter, int...i) {
        int sum = 0;
        for (int n : i) {
            sum += n;
            //计算一次则计数器+1
            counter++;
        }
        System.out.println("一共计算了：" + counter + "次");
        return sum;
    }

    //private static int method(Object...obj) {


}
