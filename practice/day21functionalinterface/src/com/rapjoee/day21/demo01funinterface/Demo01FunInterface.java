package com.rapjoee.day21.demo01funinterface;

/**
 * ClassName:Demo01FunInterface
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 15:11
 * Description:
 *
 * 自己写的函数式接口的测试类
 *
 * Lambda表达式可以看做是匿名内部类的语法糖，
 *  但是他们的原理是不太一样的，匿名内部类会生成带$符号的class文件，而Lambda表达式不会
 *
 */
public class Demo01FunInterface {
    public static void main(String[] args) {
        //匿名内部类作为参数
        show(new Demo01MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现接口，重写了抽象方法");
            }
        });

        //使用Lambda表达式
        //抽象方法中没有参数

        show(() -> System.out.println("Lambda表达式重写方法"));
    }

    /**
     * 函数式接口作为参数传递进来
     * @param my
     */
    private static void show(Demo01MyFunctionalInterface my) {
        //调用接口中的抽象方法
        my.method();
    }
}
//日志是使用一个文件记录程序执行的情况，记录运行结果，方便我们查阅日志解决一些问题。便于项目的监控与优化