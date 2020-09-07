package com.rapjoee.day10.demo01;

/**
 * ClassName:MyInterfaceImpl
 *
 * @Author:baba
 * @Date:2020/1/26 15:19
 * Description:
 */
public class MyInterfaceImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbstract1(int num) {
        System.out.println("这是方法1！");
    }

    @Override
    public void methodAbstract2(int num) {
        System.out.println("这是方法2！");
    }

    @Override
    public void methodAbstract3(int num) {
        System.out.println("这是方法3！");
    }

    @Override
    public void methodAbstract4(int num) {
        System.out.println("这是方法4！");
    }
}
