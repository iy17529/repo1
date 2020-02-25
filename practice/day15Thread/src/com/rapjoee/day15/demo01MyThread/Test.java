package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:Test
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 9:22
 * Description:
 *
 * 分别使用两种方式创建多线程
 *
 */
public class Test {
    public static void main(String[] args) {
        create2();
        for (int i = 0; i < 8; i++) {
            System.out.println("main:" + i);
        }
    }
    /*
    第二种方式：实现Runnable接口的方式
    1. 创建Runnable接口的实现类
    2， 实现类中覆盖重写run方法
    3. 由于接口没有start方法开启线程，所以多态创建Thread类的对象，构造方法中传递实现类对象
    4. Thread类对象调用start方法，开启线程
     */
    private static void create2() {

        //匿名内部类创建实现类
        Runnable ra = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 8; i++) {
                    System.out.println("Runnable:" + i);
                }
            }
        };
        Thread th = new Thread(ra);
        th.start();     //开启线程
    }

    /*
    第一种方式：继承Thread类
    1. 创建Thread类的子类，继承Thread类
    2. 子类中覆盖重写run方法，设置线程任务【让本线程做什么】
    3. 创建子类的对象，调用start方法，开启新线程
     */
    private static void create1() {

        //匿名内部类匿名对象创建
        new Thread(){
            @Override
            public void run() {
                //打印线程名
                for (int i = 0; i < 8; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
            //start方法开启线程
        }.start();
    }
}
