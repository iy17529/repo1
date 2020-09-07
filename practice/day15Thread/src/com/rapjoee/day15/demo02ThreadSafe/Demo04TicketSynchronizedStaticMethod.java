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
 * 解决问题的第二种方案：使用静态同步方法
 *      步骤：1. 把可能出现问题的代码抽取成一个方法【多线程访问共享数据】
 *           2. 在方法声明处添加一个关键字synchronized
 *
 *      格式：修饰符 static synchronized 返回值类型  方法名(){
 *          //可能出现问题的代码
 *      }
 */
public class Demo04TicketSynchronizedStaticMethod {
    public static void main(String[] args) {

        //创建Runnable接口实现类的对象
        Demo04RunnableImpl ri = new Demo04RunnableImpl();

        //创建三个Thread类对象,传递同一个Runnable()对象。这样保证多线程共享100张票
        Thread th0 = new Thread(ri,"售票口A");
        Thread th1 = new Thread(ri,"售票口B");
        Thread th2 = new Thread(ri,"售票口C");
        //开启三个线程，实现三个窗口同时买票
        th0.start();
        th1.start();
        th2.start();

    }
}
