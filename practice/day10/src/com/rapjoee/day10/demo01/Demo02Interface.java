package com.rapjoee.day10.demo01;

/**
 * ClassName:Demo02Interface
 *
 * @Author:baba
 * @Date:2020/1/26 15:38
 * Description:
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultImplA a = new MyInterfaceDefaultImplA();
        a.methodAbs();
        a.methodDefault();
        System.out.println("============================");

        MyInterfaceDefaultImplB b = new MyInterfaceDefaultImplB();
        b.methodAbs();
        b.methodDefault();      //调用默认方法、如果实现类中没有，则向上接口中找
    }
}
