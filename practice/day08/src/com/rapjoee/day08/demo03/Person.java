package com.rapjoee.day08.demo03;

/**
 * ClassName:Person
 *
 * @Author:baba
 * @Date:2020/1/19 16:32
 * Description:
 */
public class Person {

    static {
        System.out.println("静态代码块执行了！！！");
    }
    public Person(){
        System.out.println("构造方法执行了！！");
    }
}
