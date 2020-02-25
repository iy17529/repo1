package com.rapjoee.day16.demo01BaoZi;

import java.util.Scanner;

/**
 * ClassName:BaoZiShopThread
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 14:42
 * Description:
 *
 * 包子铺线程：做包子的
 *      判断包子状态
 *          true：wait()进入等待状态
 *          false：生产包子【几种包子，皮的多少，馅的薄厚】
 *                 生产完，修改包子的状态为true
 *                 notify()唤醒吃货线程
 *       注意：包子铺线程与吃货线程是【通信关系】互斥关系，必须使用同步技术保证只有一个线程执行【即吃包子时你等待、做包子时我等待】
 *             锁对象必须唯一，可以使用包子对象作为锁对象
 *             两个线程可以把包子类作为参数传递进来
 *                  1. 在成员变量处创建一个包子变量
 *                  2. 使用带参构造为包子赋初值
 */
public class BaoZiShopThread implements Runnable {

    private BaoZi baoZi;

    public BaoZiShopThread(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    private boolean count = false;      //交替变化，两种包子

    @Override
    public void run() {
        System.out.print("请输入包子需求数量：");
        int n = new Scanner(System.in).nextInt();

        //做指定需求的包子
        while (baoZi.getCountBaoZi() < n) {
            //使用同步技术
            synchronized (baoZi) {
                if (baoZi.conditionOfBaoZi) {
                    try {

                        //如果有包子，则是等待状态
                        baoZi.wait();
                        //baoZi.wait(5000);         //有参数的wait方法是计时唤醒，时间到了，每人唤醒它，则自己醒来
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {             //如果没有包子
                    if (count) {
                        baoZi.setPiEr("皮薄");
                        baoZi.setXianEr("猪肉馅");
                        System.out.println("正在做 [" + baoZi.getPiEr() + baoZi.getXianEr() + "] 包子！！");
                        for (int i = 0; i < 3; i++) {                   //for循环输出等待的友好提示
                            try {
                                Thread.sleep(1000);             //总共睡眠三秒钟
                                System.out.println("剩余[" + (3 - i) + "]s...");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        baoZi.setPiEr("橘子皮");
                        baoZi.setXianEr("大葱馅");
                        System.out.println("正在做[" + baoZi.getPiEr() + baoZi.getXianEr() + "] 包子！！");
                        for (int i = 0; i < 3; i++) {
                            try {
                                Thread.sleep(1000);
                                System.out.println("剩余[" + (3 - i) + "]s...");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    System.out.println("[" + baoZi.getPiEr() + baoZi.getXianEr() + "]包子做完啦！！");
                    //条件变化，两种包子交替做
                    count = !count;
                    //修改包子状态
                    baoZi.conditionOfBaoZi = !baoZi.conditionOfBaoZi;
                    int Temp = baoZi.getCountBaoZi();
                    baoZi.setCountBaoZi(Temp + 1);
                    //唤醒吃包子线程，notifyAll方法是唤醒所有等待的线程
                    baoZi.notify();
                }
            }
        }
    }
}
