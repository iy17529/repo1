package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:Demo02MyThread2
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 15:54
 * Description:
 *
 * Thread类中提供了一些方法
 *      构造方法：
 *          1. public Thread()                              :分配一个新的线程对象
 *          2. public Thread(String name)                   ：分配一个指定名字的新的线程对象
 *          3. public Thread(Runnable target)               ：分配一个带有指定目标的新的线程对象
 *          4. public Thread(Runnable target, String name)  ：分配一个带有指定目标的新的线程对象并指定名字
 *
 *       常用方法：
 *          1. String getName()                             :获取当前线程名
 *          2. void start()                                 :使此线程开始执行；jvm调用此线程的run方法
 *          3. void run()                                   :此线程要执行的任务在此定义代码
 *          4. static void sleep(long millis)               :使当前在执行的线程以指定的毫秒值暂停
 *          5. static Thread currentThread()                :返回当前正在执行的线程对象的引用
 *
 *  获取线程的名称：
 *          1. 使用Thread类中getName()方法   【String getName()】   返回当前线程的名称
 *          2. 可以先获取当前正在执行的线程，使用Thread的静态方法  【static Thread currentThread() 】  返回当前执行的线程的引用
 *
 */
public class Demo02MyThread2 {
    public static void main(String[] args) {

        MyThread2 mt2 =new MyThread2();
        mt2.setName("线程A[setName方法取名]");
        mt2.start();

        //匿名对象调用start方法
        //new MyThread2().start();
        //new MyThread2().start();
        new MyThread2("线程B[构造方法取名]").start();

        //获取主线程的名称
        System.out.println("主线程：" + Thread.currentThread().getName());

    }
}
