package com.rapjoee.day21.demo01funinterface;

/**
 * ClassName:Demo01MyFunctionalInterface
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 15:03
 * Description:
 *
 * 函数式接口：
 *      有且仅有1个抽象方法的接口，称之为函数式接口
 *          【当然接口中可以包含其他的方法（默认、私有、静态）】
 *
 *          @FunctionalInterface注解的作用：
 *              检测接口是否是一个函数式接口
 *                      是：可以编译通过
 *                      否：编译不通过【1. 接口中没有抽象方法 2. 抽象方法的个数大于一个】
 */
@FunctionalInterface
public interface Demo01MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();

    //怎么保证接口是函数式接口呢？【仅有一个抽象方法】

    //void method1();
}
