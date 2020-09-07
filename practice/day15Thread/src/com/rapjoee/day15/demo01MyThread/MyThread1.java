package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:Mythread
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 15:24
 * Description:
 * public void run() {
 *         if (target != null) {
 *             target.run();
 *         }
 *     }
 *
 *
 *          Thread类的子类
 */
public class MyThread1 extends Thread{

    //Thread子类中覆盖重写run方法，设置线程任务
    @Override
    public void run(){
        for (int i = 0; i < 8; i++) {
            System.out.println("Run:" + i);
        }
    }

}
