package com.rapjoee.day14.demo02;

import java.io.IOException;

/**
 * ClassName:Demo06Fu
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 13:33
 * Description:
 *
 * 父子类异常情况
 *      1. 如果父类抛出了多个异常，子类重写父类方法时，抛出与父类相同的异常/抛出父类异常的子类/不抛出异常
 *      2. 如果父类没有抛出异常，子类重写父类方法时，不可抛出异常。此时资历产生异常，只能try catch捕获处理，不能throws声明抛出
 *
 *   总结就是：  父类异常是什么样，子类就是什么样
 */
public class Demo06Fu {
    protected  void show01() throws NullPointerException, IndexOutOfBoundsException{}        //父类抛出了多个异常
    //protected void show02() throws NullPointerException, IndexOutOfBoundsException{}        //父类抛出了多个异常
    protected  void show03() throws IOException{}                                              //父类抛出了一个父类异常
    protected  void show04() {}                                                              //父类没有抛出异常
}
