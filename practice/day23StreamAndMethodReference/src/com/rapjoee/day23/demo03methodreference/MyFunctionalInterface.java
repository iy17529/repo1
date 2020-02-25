package com.rapjoee.day23.demo03methodreference;

/**
 * ClassName:MyFunctionalInterface
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 14:08
 * Description:
 * 自定义一个函数式接口
 *      打印字符串
 *
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void printString(String string);
}
