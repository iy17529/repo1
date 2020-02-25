package com.rapjoee.day11.demo03;

/**
 * ClassName:Outer2
 *
 * @Author:baba
 * @Date:2020/2/1 14:21
 * Description:
 */
public class Outer2 {       //外部类

    public void methodOuter() {
        class Inner2 {
            public void methodInner() {
                System.out.println("这是局部内部类方法");
            }
        }
        Inner2 inner2 = new Inner2();       //作用范围为本方法，故此只能在此方法内创建对象，再由外部类的方法调用
        inner2.methodInner();
    }
}
