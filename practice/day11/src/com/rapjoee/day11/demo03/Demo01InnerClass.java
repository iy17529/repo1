package com.rapjoee.day11.demo03;

/**
 * ClassName:Demo01InnerClass
 *
 * @Author:baba
 * @Date:2020/1/31 19:59
 * Description:
 * 学习内部类相关
 * 如果一个事务包含另一个事务，则这就是一个类包含另一个类
 * 例如：汽车与汽车发动机的关系
 *
 * 内部类的分类：
 * 1. 成员内部类
 *      1.1 定义格式：public class 外部类名{
 *          public class 内部类名{
 *              //...}
 *          //...}
 *      1.2 注意：内用外，随意访问;外用内，需要创建内部类的对象
 *      1.3 使用成员内部类
 *              1.3.1 【间接使用】通过外部类的方法使用，main中调用外部类的方法，方法中创建内部类对象
 *              1.3.2 【直接使用】直接new内部类的对象   格式：【外部类名.内部类名  对象名 = new 外部类名().new 内部类名();】
 * 2. 局部内部类（匿名内部类）
 */
public class Demo01InnerClass {
    public static void main(String[] args) {


        //成员内部类间接使用方式
        Body body = new Body();
        body.methodOuter();     //通过外部类的方法使用内部类
        System.out.println("=============================");

        //成员内部类直接使用方式
        Body.Heart heart2 = new Body().new Heart();     //直接创建内部类对象
        heart2.methodInner();       //使用内部类里面的方法

    }
}
