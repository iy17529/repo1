package com.rapjoee.day13.day13_1.demo02Generics;

/**
 * ClassName:Demo04GenericsInterfaceImpl
 *
 * @Author:baba
 * @Date:2020/2/7 14:30
 * Description:
 *
 * 匿名内部类实现含有泛型的接口
 *
 * 实现含有泛型的接口的两种方式：
 *
 *
 *       2. 定义接口的实现类，实现接口，并含有与接口相同的泛型，在创建对象时指定泛型类型
 *          public interface List<E>{
 *              boolean add(E e);}
 *            【下面的ArrayList类实现了接口并含有与接口相同的泛型，在创建对象时指定类型】
 *          public class ArrayList<E> implements List<E>{
 *              public boolean add(E e){}}
 *
 */
public class Demo04GenericsInterfaceImpl2<Q> implements GenericsInterface<Q> {

    //第二种方式

    @Override
    public void method1(Q q) {
        System.out.println("第二种方式：实现类含有接口，创建对象指定：" + q);
    }

    public static void main(String[] args) {
        Demo04GenericsInterfaceImpl2<Integer> dgi = new Demo04GenericsInterfaceImpl2<>();       //创建对象时指定泛型Integer
        dgi.method1(668);                   //此处参数只能是int型整数
    }
}
