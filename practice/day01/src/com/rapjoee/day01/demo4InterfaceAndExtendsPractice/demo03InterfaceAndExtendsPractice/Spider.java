package com.rapjoee.day01.demo4InterfaceAndExtendsPractice.demo03InterfaceAndExtendsPractice;

/**
 * ClassName:Spider
 *
 * @Author:baba
 * @Date:2020/2/3 17:04
 * Description:
 * 1. Spider继承Animal类。
 * 2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
 * 3. 实现eat方法
 */
public class Spider extends Animal{
    public Spider() {
    }

    public Spider(int legs) {
        super(8);           //蜘蛛都是8条腿
    }

    @Override
    public void eat() {         //覆盖重写eat方法
        System.out.println("蜘蛛吃饭饭");
    }
}
