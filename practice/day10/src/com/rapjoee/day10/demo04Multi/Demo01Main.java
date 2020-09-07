package com.rapjoee.day10.demo04Multi;

/**
 * ClassName:Demo01Main
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/17 11:47
 * Description:
 *
 * 多态代码中成员变量与成员方法的访问规则：
 *
 * 成员方法：【编译看左边，运行看右边】
 *
 * 成员变量：编译看左边，运行也看左边【成员变量无法覆盖重写】
 *
 */
public class Demo01Main {
    public static void main(String[] args) {
        //多态创建子类对象,左侧父类引用指向右侧子类对象
        Fu obj = new Zi();

        //编译看左边，运行也看左边
        System.out.println("多态下的父类成员变量obj.stringFu：" + obj.stringFu);
        System.out.println("多态下的同名成员变量obj.str：" + obj.str);

        //new的是谁，则优先用谁，没有则想上找
        //子类覆盖重写了就用子类的/没有覆盖重写则用父类的
        obj.method();//编译看左边、左边是Fu,Fu有method方法则编译通过，但是运行时jvm知道zi有，所以运行看右边

        //编译看左边，子类没有则向上找
        obj.methodFu();
    }
}
