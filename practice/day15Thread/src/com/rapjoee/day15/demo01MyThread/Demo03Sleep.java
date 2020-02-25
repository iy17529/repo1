package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:Demo03Sleep
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 16:25
 * Description:
 *
 * 使用Thread类的sleep方法制作一个计时器
 *      static void sleep(long millis)               :使当前在执行的线程以指定的毫秒值暂停
 *
 */
public class Demo03Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            //捕获异常
            try {
                //让线程每一秒停一次
                //线程进入计时等待状态【Time Waiting】
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
