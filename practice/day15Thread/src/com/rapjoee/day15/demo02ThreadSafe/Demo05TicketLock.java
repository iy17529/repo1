package com.rapjoee.day15.demo02ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:Demo01Ticket
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 11:43
 * Description:
 *
 * 卖票案例：三个窗口同时都卖0~100号票子
 *
 * 解决问题的第三种方式：Lock锁机制
 *
 *  java.lang.concurrent.Locks.Lock接口提供了获取锁与释放锁的方法
 *        1. 方法
 *          vod lock()获取锁
 *          vod lock()释放锁
 *
 *         2. 步骤：
 *              1. 在成员位置创建一个ReentrantLock对象
 *              2. 在可能出现问题的代码前调用Lock的lock方法获取锁
 *              3. 在可能出现问题的代码后调用Lock的unLock方法释放锁
 */
public class Demo05TicketLock {
    public static void main(String[] args) {

        //匿名内部类实现Runnable接口
        Runnable runn = new Runnable() {

            //多态创建Lock接口的实现类
            Lock lo = new ReentrantLock();
            //100张票子
            private int ticketCode = 100;
            @Override
            public void run() {
                while (true){

                    //在可能出问题的代码前获取锁
                    lo.lock();
                    if(ticketCode > 0) {
                        try {
                            //睡眠十毫秒
                            Thread.sleep(10);
                            System.out.println(Thread.currentThread().getName() + "-->正在卖出[" +  ticketCode +"]号票子");
                            ticketCode--;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }finally {
                            //代码后释放锁,写在finally中，这样不论异常是否发生都会释放锁
                            lo.unlock();
                        }
                    }
                }
            }
        };

        //创建三个Thread类对象,传递同一个Runnable()对象。这样保证多线程共享100张票
        Thread th0 = new Thread(runn,"售票口A");
        Thread th1 = new Thread(runn,"售票口B");
        Thread th2 = new Thread(runn,"售票口C");
        //开启三个线程，实现三个窗口同时买票
        th0.start();
        th1.start();
        th2.start();


        //出现了不合法的数据与重复的数据
        //售票口B-->正在卖出[-1]号票子        因为本线程【卖0号票，但还没卖，但是进入了if语句】睡着了【】，另外的线程醒来并卖出这张票子【0号，已经 ticketCode-- 】后本线程苏醒卖出 -1 这张票
        //售票口C-->正在卖出[1]号票子         因为本线程睡着了【但是进入了if语句】，另外的线程醒来卖出这张票的同时，多个线程同时卖了票，并还没来得及ticketCode--
        //售票口B-->正在卖出[1]号票子
    }
}
