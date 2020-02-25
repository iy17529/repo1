package com.rapjoee.day10.demo01;

/**
 * ClassName:MyInterfaceDefaultImpl
 *
 * @Author:baba
 * @Date:2020/1/26 15:35
 * Description:
 */
public class MyInterfaceDefaultImplA implements MyInterfaceDefault {

    /*覆盖重写接口类中的所有抽象方法
     * */
    @Override
    public void methodAbs() {
        System.out.println("接口的实现类A的方法");
    }

    @Override
    public void methodDefault() {               //实现类也可以覆盖重写接口的默认方法
        System.out.println("实现类A覆盖重写默认方法");
    }
}
