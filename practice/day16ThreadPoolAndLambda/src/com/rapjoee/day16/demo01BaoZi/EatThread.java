package com.rapjoee.day16.demo01BaoZi;

/**
 * ClassName:EatThread
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 14:47
 * Description:
 *
 * 吃货线程：吃包子
 *      判断包子状态：
 *          true：进行吃包子
 *                  吃完包子，修改包子的状态为false  notify唤醒包子铺线程
 *          false：
 *                  wait进入等待状态
 *
 *       注意：包子铺线程与吃货线程是【通信关系】互斥关系，必须使用同步技术保证只有一个线程执行【即吃包子时你等待、做包子时我等待】
 *             锁对象必须唯一，可以使用包子对象作为锁对象
 *             两个线程可以把包子类作为参数传递进来
 *                  1. 在成员变量处创建一个包子变量
 *                  2. 使用带参构造为包子赋初值
 */
public class EatThread implements Runnable{
    //包子变量
    private BaoZi baoZi;

    public EatThread(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        while (true) {
            //使用同步技术
            synchronized (baoZi) {
                if (baoZi.conditionOfBaoZi) {
                    System.out.println("大口吃[" + baoZi.getPiEr() + baoZi.getXianEr() + "]包子...");
                    for (int i = 0; i < 3; i++) {
                        try {
                            Thread.sleep(1000);
                            System.out.println("剩余[" + (3 - i) + "]s...");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("包子吃完啦！！");
                    //包子吃完，修改包子状态
                    baoZi.conditionOfBaoZi = !baoZi.conditionOfBaoZi;
                    //唤醒做包子线程
                    baoZi.notify();
                    System.out.println("====================");

                    //    没有包子，唤醒做包子线程，并进入等待状态
                } else {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
