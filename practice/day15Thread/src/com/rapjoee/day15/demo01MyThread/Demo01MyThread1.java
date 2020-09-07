package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:Demo01MyThread
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 15:28
 * Description:
 *
 *   主线程：执行主方法（main）的线程
 *
 *        单线程程序：Java程序中只有一个线程，执行从main方法开始，从上到下依次执行
 *
 *        1. jvm执行main方法，main方法hi进入到栈内存
 *        2. jvm会找OS开辟一条main方法通向cpu的执行路径
 *        3. cpu通过这个路径来执行main方法。路径就叫线程
 *
 *
 *      创建多线程程序的第一种方式：创建Thread类的子类【java.lang.Thread类是描述线程的类，我们想要实现多线程程序，就必须继承Thread类】
 *          实现步骤：
 *              1. 创建一个Thread类的子类，
 *              2. 覆盖重写Thread类中的run方法，来自定义线程的任务（此线程做什么）
 *              3. 创建Thread类的子类的对象
 *              4. 调用Thread类中的start方法，开启新的线程，执行run方法
 *                      void start()方法使该线程【开辟一条新线程】开始执行：jvm调用该线程的run方法
 *
 * 结果是两个线程【main线程/创建的新线程（执行run方法）】并发运行，
 *      多次启动一个线程是非法的，特别是当线程已经执行结束后，不可重新启动【同一对象多次调用start方法是非法的】
 *
 *   Java程序属于抢占式调度，哪个优先级高，调度哪个；
 *                  同一优先级则随机选择一个执行
 *
 */
public class Demo01MyThread1 {

    public static void main(String[] args) {

        //创建MyThread对象
        MyThread1 mt = new MyThread1();
        //MyThread类中覆盖重写的run方法
        mt.start();
        //mt.start();     //IllegalThreadStateException   同一对象多次调用start方法是非法的

        //main方法中其他代码
        for (int i = 0; i < 10; i++) {
            System.out.println("Start:" + i);
        }
    }
}
