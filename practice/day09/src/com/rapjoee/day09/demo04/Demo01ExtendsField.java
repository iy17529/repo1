package com.rapjoee.day09.demo04;

/**
 * ClassName:Demo01ExtendsField
 *
 * @Author:baba
 * @Date:2020/1/20 13:36
 * Description:
 * 在子类的继承关系中，创建子类对象，访问成员方法的规则：
 *      创建的对象是谁，就优先用谁，没有则向上找。
 *
 *  总结：无论是成员方法还是成员变量，如果没有都是向上找父类，不会向下找子类。
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();      //  子类对象使用子类方法
        zi.methodFu();      //  子类对象使用父类方法，子类没有则向上【父类】找
        zi.method();        //创建的对象是谁，就优先用谁
    }
}
