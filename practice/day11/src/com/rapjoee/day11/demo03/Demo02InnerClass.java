package com.rapjoee.day11.demo03;

/**
 * ClassName:Demo02InnerClass
 *
 * @Author:baba
 * @Date:2020/2/1 13:44
 * Description:学习内部类的访问
 * 如果出现了重名现象。则访问格式是： 外部类名.this.变量名
 */
public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner inn = new Outer().new Inner();
        inn.methodInner();
    }
}
