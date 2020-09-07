package com.rapjoee.day13.day13_1.demo02Generics;

/**
 * ClassName:GenericsClass
 *
 * @Author:baba
 * @Date:2020/2/7 13:34
 * Description:
 * 也可以使用泛型来定义类、接口、方法等
 *
 * 此时  当创建对象时确定泛型
 */
public class GenericsClass<E> {
    private E name;                 //定义一个含有泛型的类  这里是一个泛型的属性name

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
