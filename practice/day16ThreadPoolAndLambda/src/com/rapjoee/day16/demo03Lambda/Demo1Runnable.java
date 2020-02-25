package com.rapjoee.day16.demo03Lambda;

/**
 * ClassName:demo03Lambda
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 19:31
 * Description:
 *
 * 先来看看OOP思想里的一些冗余的代码
 *
 * 使用实现Runnable接口的方式创建Thread对象
 *
 */
public class Demo1Runnable {
    public static void main(String[] args) {

        //匿名内部类的方式实现Runnable接口
        Runnable run1 = new Runnable() {

            //覆盖重写run方法,设置线程任务
            @Override
            public void run() {
                System.out.println("线程[" + Thread.currentThread().getName() + "]执行了");
            }
        };

        //匿名对象创建Thread对象，传递Runnable接口实现类并开启新线程
        new Thread(run1).start();               //线程[Thread-0]执行了
    }
}
