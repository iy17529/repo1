package com.rapjoee.day16.demo01BaoZi;

/**
 * ClassName:BaoZiMain
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 14:49
 * Description:
 *
 * 测试类
 */
public class BaoZiMain {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi zi = new BaoZi();

        //创建做包子线程和吃包子线程的对象
        BaoZiShopThread bzs = new BaoZiShopThread(zi);
        EatThread eat = new EatThread(zi);

        Thread makeBaoZi = new Thread(bzs);
        Thread eatBaoZi = new Thread(eat);

        //start方法开启两个线程
        makeBaoZi.start();
        eatBaoZi.start();
    }
}
