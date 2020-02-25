package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:MyThread2
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 15:53
 * Description:
 */
public class MyThread2  extends Thread{
    //空参构造
    public MyThread2() {
    }

    //带参构造，把name传递给父类，让父类给此线程取名
    public MyThread2(String name) {
        super(name);
    }

    //覆盖重写run方法，设置线程任务
    @Override
    public void run() {
        super.run();

        //method1       Thread类中getName()直接获得线程名
        //String threadName = getName();
        //System.out.println("线程：" + threadName);

        //method2     Thread类的静态方法currentThread获取当前执行的线程
        //Thread thread2 = Thread.currentThread();
        //System.out.println(thread2);                                    //Thread[Thread-0,5,main]
        //System.out.println(thread2.getName());                          //Thread-0

        //method2     链式编程直接获得
        System.out.println("当前线程：" + Thread.currentThread().getName());

    }
}
