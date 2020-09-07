package com.rapjoee.day08.demo03;

/**
 * ClassName:Demo03Static
 *
 * @Author:baba
 * @Date:2020/1/19 16:33
 * Description:
 * 静态代码块的格式是：
 * public class 类名{
 *     static {
 *         //静态代码的内容
 *     }
 * }
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 */
public class Demo03Static {
    public static void main(String[] args) {
        Person one = new Person();      //创建对象，则执行了构造方法
        Person two = new Person();         //创建了两次对象，但静态代码块只执行唯一一次
    }
}
