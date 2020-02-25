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
 * 上一个卖票案例出现了问题，这里我们有解决问题的第一种方案：使用同步代码块
 *          格式：synchronized(同步锁对象){
 *              //可能出现问题的代码，给它锁住【访问了共享的数据的代码】
 *          }
 *
 *       注意：
 *              1. 同步代码块中的锁对象，可以是任意的对象
 *              2. 但是必须保证多个线程使用的锁对象是同一个
 *              3. 锁对象的作用：把同步代码块锁住，只让一个线程在同步代码块中执行
 *
 *     原理：第一个抢到cpu执行权的线程会判断是否有锁对象，有则获取并进入同步，执行代码
 *          此时第二个线程开启抢到执行权，但是获取不到锁对象，进入阻塞状态
 *          第一个线程执行完同步后，释放锁对象，其他的线程获取并执行
 *        总结：同步中的线程执行完毕前不是释放锁对象，同步外的线程未获取锁对象不会执行同步，
 *
 *     缺点：程序频繁地判断锁对象，获取锁对象，释放锁对象，效率低下
 *
 */
public class Demo02TicketSynchronized {
    public static void main(String[] args) {

        //创建一个锁对象，放在外面【任意对象】
        Thread lockSynchronized = new Thread();

        //匿名内部类实现Runnable接口
        Runnable runn = new Runnable() {
            //定义一个多个线程共享的100张票子
            private int ticketCode = 100;
            @Override
            public void run() {
                while (true) {

                    //同步代码块
                    synchronized (lockSynchronized) {
                        //ticketCode是共享数据，则整个if语句都是可能出现问题的地方
                        if (ticketCode > 0) {
                            /*try {
                                //提高安全问题出现的概率，让线程睡眠
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }*/
                            System.out.println(Thread.currentThread().getName() + "-->正在卖出[" + ticketCode + "]号票子");
                            ticketCode--;
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
