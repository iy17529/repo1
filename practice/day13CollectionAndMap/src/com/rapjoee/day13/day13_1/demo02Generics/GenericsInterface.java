package com.rapjoee.day13.day13_1.demo02Generics;

/**
 * ClassName:GenericsInterface
 *
 * @Author:baba
 * @Date:2020/2/7 14:27
 * Description:
 *
 * 定义一个含有泛型的接口
 *
 * 格式：
 */
public interface GenericsInterface<Q> {                 //定义一个含有泛型的接口
    public abstract void method1(Q q);                  //使用接口泛型的抽象方法method1
}
