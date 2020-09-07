package com.rapjoee.day16.demo02ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:Demo01ThreadPool
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 18:36
 * Description:
 *
 * 线程池的底层原理：实现最好是LinkedHashList集合，因为一个线程池中的线程一次只能被一个任务拿出去用，此时其他任务不可使用这个线程，实现的时候，使用remove
 * 方法把线程移除，这样保证了此线程在此时只能哟一个任务再用它，任务执行完后，add方法再把它添加进来
 *
 * 线程池：JDK1.5之后的新特性
 *
 * java.util.concurrent.Executors       线程池的工厂类，用来生成线程池
 *          通常使用Executors类里的静态方法newFixedThreadPool()创建一个可重用固定线程数的线程池
 *                  static ExecutorService newFixedThreadPool(int nThreads)
 *                      1. 参数：nThreads表示需要创建的线程数
 *                      2. 返回值：ExecutorService是一个接口，这里返回的是一个它的实现类，【多态接收】
 *
 * java.util.concurrent.ExecutorService：线程池接口
 *      用来从线程池中获取线程，调用start方法开启新线程
 *              获取【取出】线程的方法：Future<?> submit(Runnable task)  提交一个 Runnable 任务用于执行
 *              销毁线程池的方法：void shutdown()  【不建议】
 *
 *      从线程池中获取新线程的步骤：
 *              1. Executors类里的静态方法newFixedThreadPool()创建一个线程池，多态接收
 *              2. 创建Runnable接口的一个实现类，里边覆盖重写run方法设置线程任务
 *              3. submit(Runnable task)方法获取线程
 *              4. start方法开启新线程
 *
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //创建线程池,包含3个线程,多态接收线程池的实现类
        ExecutorService threadPool1 = Executors.newFixedThreadPool(2);
        ExecutorService threadPool2 = Executors.newFixedThreadPool(2);


        //匿名内部类实现Runnable()接口
        //获取一个Runnable实现类,线程池只有3个线程时，四个任务执行重复归怀获取线程
        threadPool1.submit(getE());             //pool-1-thread-1执行任务
        threadPool2.submit(getE());             //pool-1-thread-3执行任务
        threadPool2.submit(getE());             //pool-1-thread-2执行任务
        threadPool1.submit(getE());             //pool-1-thread-1执行任务，执行完会归怀线程

        //销毁线程池，再下面不可获取线程了
        //threadPool1.shutdown();
        threadPool1.submit(getE());             //RejectedExecutionException  抛出异常，线程池没了，不可获取线程
        //System.exit(3000);
    }
    private static Runnable getE(){
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行任务");
            }
        };
        return run;
    }
}
