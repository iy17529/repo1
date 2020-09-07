package com.rapjoee.day15.demo02ThreadSafe;

/**
 * ClassName:Demo04RunnableImpl
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 13:18
 * Description:
 *
 * 使用静态同步方法【匿名内部类不能定义静态变量】
 *
 */
public class Demo04RunnableImpl implements Runnable{

    //100张票子
    private static int ticketCode = 100;
    @Override
    public void run() {
        while (true){

            //调用静态同步方法
            payTicketsStatic();
        }
    }
    //这里的同步锁不是this，因为静态方法与对象无关，这里的同步锁对象是本类的class文件
    public static /*synchronized*/ void payTicketsStatic(){
        synchronized (Demo04RunnableImpl.class) {
            if (ticketCode > 0) {
                /*try {
                    //睡眠十毫秒
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println(Thread.currentThread().getName() + "-->正在卖出[" + ticketCode + "]号票子");
                ticketCode--;
            }
        }
    }
}
