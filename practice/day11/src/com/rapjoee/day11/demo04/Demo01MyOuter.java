package com.rapjoee.day11.demo04;

/**
 * ClassName:Demo01MyOuter
 *
 * @Author:baba
 * @Date:2020/2/1 14:36
 * Description:
 * 局部内部类的final问题
 * 局部内部类要想使用所在方法的局部变量，需要这个局部变量是【有效final的】意即只能赋值一次
 *
 * 原因：
 * 1. 所在方法是位于桟内存的，方法用完则出栈。而局部变量跟着方法走，方法出栈则局部变量消失
 * 2. 局部内部类对象new出来位于堆内存，持续存在，直到垃圾回收消失
 * 3. 所以局部 变量不可变，只能一次赋值
 *
 */
public class Demo01MyOuter {
    public static void main(String[] args) {
        MyOuterFinal mo = new MyOuterFinal();
        mo.methodOuter();
    }
}
