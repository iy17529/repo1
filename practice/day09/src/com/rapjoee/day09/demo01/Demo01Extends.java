package com.rapjoee.day09.demo01;

/**
 * ClassName:Demo01Extends
 *
 * @Author:baba
 * @Date:2020/1/19 19:24
 * Description:
 * 在继承的关系中，“子类就是一个父类”。也就是说，子类可以被当做父类看待
 * 例如父类是员工，子类是讲师，那么“讲师就是一个员工。关系：is-a定义父类的格式：（一个普通的类定义）
 * public class父类名称{
 *     //...
 * }
 * 定义子类的格式:public class子类名称 extends父类名称{
 *     //...
 * }
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个Teacher对象
        Teacher teacher = new Teacher();
        teacher.method();       //Teacher类中未定义method()方法，只因继承自Employee类，便可以使用method()方法

        Assistant assistant = new Assistant();
        assistant.method();     //Assistant类同上

    }
}
