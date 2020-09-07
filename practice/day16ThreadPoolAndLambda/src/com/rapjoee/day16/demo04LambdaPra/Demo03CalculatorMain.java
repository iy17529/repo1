package com.rapjoee.day16.demo04LambdaPra;

/**
 * ClassName:Demo03CalculatorMain
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 21:19
 * Description:
 *
 * Lambda表达式标准格式练习：
 *      调用invokeCalc()方法，完成120与130相加集计算
 */
public class Demo03CalculatorMain {

    public static void main(String[] args) {

        //参数有一个接口类型对象，用匿名内部类实现calculator接口
        invokeCalc(24, 58, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //Lambda表达式标准格式
        invokeCalc(120,130,(int a,int b)->{
            return a + b;
        });
        //Lambda省略式写法：省略了 数据类型int与return
        invokeCalc(12,23,(a,b) -> a+ b );
    }

    /*
    定义一个方法
    参数：两个int整数与一个calculator接口的实现类
    返回值：方法内部调用calculator接口的抽象方法求a与b的和
     */
    private static void invokeCalc(int a,int b,Calculator calculator){
        int re = calculator.calc(a, b);
        System.out.println("结果是：" + re);
    }
}
