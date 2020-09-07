package com.rapjoee.day01.demo4InterfaceAndExtendsPractice.demo03InterfaceAndExtendsPractice;

/**
 * ClassName:Fish
 *
 * @Author:baba
 * @Date:2020/2/3 17:15
 * Description:
 * 1. 创建Fish类，它继承Animal类
 * 2. 重写Animal的walk方法以表明鱼不能走且没有腿。
 * 3. 实现Pet接口
 * 4. 无参构造方法
 * 5. 提供一个private 的name属性
 */
public class Fish extends Animal implements Pet{

    private String name;                //鱼的名字

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("鱼吃饭饭");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("鱼在玩耍");
    }

    @Override
    public void walk(){                 //鱼不能走且没有腿
        System.out.println("鱼没有腿，不能走路");
    }
}
