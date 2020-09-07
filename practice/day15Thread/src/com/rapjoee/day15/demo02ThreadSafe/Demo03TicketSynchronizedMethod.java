package com.rapjoee.day15.demo02ThreadSafe;

/**
 * ClassName:Demo01Ticket
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 11:43
 * Description:
 *
 * 卖票案例：三个窗口同时都卖0~100号票子
 *
 * 解决问题的第二种方案：使用同步方法
 *      步骤：1. 把可能出现问题的代码抽取成一个方法【多线程访问共享数据】
 *           2. 在方法声明处添加一个关键字synchronized
 *
 *      格式：修饰符 synchronized 返回值类型  方法名(){
 *          //可能出现问题的代码
 *      }
 */
public class Demo03TicketSynchronizedMethod {
    public static void main(String[] args) {

        //匿名内部类实现Runnable接口
        Runnable runn = new Runnable() {
            //100张票子
            private int ticketCode = 20;
            @Override
            public void run() {
                while (true){

                    //调用同步方法
                    payTickets();
                }
            }
            //把共享数据的代码抽取出来，添加synchronized关键字，同步方法锁住了代码
            //这里的同步锁是this，即谁调用的此方法，谁就是同步锁对象
            public synchronized void payTickets(){
                if(ticketCode > 0) {
                    try {
                        //睡眠十毫秒
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖出[" +  ticketCode +"]号票子");
                    ticketCode--;
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

    }
}