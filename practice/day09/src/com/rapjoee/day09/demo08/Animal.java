package com.rapjoee.day09.demo08;

/**
 * ClassName:Animal
 *
 * @Author:baba
 * @Date:2020/1/25 16:25
 * Description:
 * 学习抽象
 *
 * 1.抽象方法：就是在返回值类型前加“abstract”关键字，去掉大括号方法体，直接在小括号后加分号结束。
 * 2.抽象类：抽象方法必须位于抽象类中。在class前加“abstract”关键字即可。【抽象类中不一定有抽象方法】
 *
 * 如何让使用抽象类和抽象方法？？
 * 1.不能直接创建new抽象类对象。
 * 2.如果要使用，必须先创建子类继承自抽象类。
 * 3.子类必须覆盖重写抽象类里的【所有的，否则报错，除非子类也是一个抽象类】抽象方法         覆盖重写【实现】：去掉抽象方法的abstract关键字并补上大括号方法体
 * 4.创建子类对象进行使用
 */
public abstract class Animal {

    public abstract void eat();

}
