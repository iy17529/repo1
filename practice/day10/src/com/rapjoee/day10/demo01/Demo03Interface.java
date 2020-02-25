package com.rapjoee.day10.demo01;

/**
 * ClassName:Demo03Interface
 *
 * @Author:baba
 * @Date:2020/1/26 16:23
 * Description:
 */
public class Demo03Interface {
    public static void main(String[] args) {

        MyInterfaceStaticImpl mifs = new MyInterfaceStaticImpl();
        //mifs.methodStatic();    //错误写法

        MyInterfaceStatic.methodStatic();   //直接通过接口名调用静态方法
    }
}
