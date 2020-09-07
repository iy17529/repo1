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
 *      1. 定义接口的实现类，实现接口，同时指定接口的泛型
 *          public interface Iterator<E> {
 *                E next();}
 *            【下面的Scanner类实现了上面的接口，同时指定泛型为String型】
 *          public final class Scanner implements Iterator<String>{
 *                public String next() {}  }
 *
 *       2. 定义接口的实现类，实现接口，并含有与接口相同的泛型，在创建对象时指定泛型类型
 *          public interface List<E>{
 *              boolean add(E e);}
 *            【下面的ArrayList类实现了接口并含有与接口相同的泛型，在创建对象时指定类型】
 *          public class ArrayList<E> implements List<E>{
 *              public boolean add(E e){}}
 *
 */
public class Demo04GenericsInterfaceImpl1 {
    public static void main(String[] args) {
        GenericsInterface<String>  gii1 = new GenericsInterface<String>() {     //匿名内部类实现接口，并指定String类型
            @Override
            public void method1(String q) {                                     //覆写接口中方法
                System.out.println("第一种方式，实现接口，同时指定接口的泛型：" + q);
            }
        };
        gii1.method1("Hello!World");                                         //这里参数只能是字符串类型


        //匿名内部类匿名对象
        new GenericsInterface<Double>(){

            @Override
            public void method1(Double q) {
                System.out.println("匿名内部类匿名对象: " + q) ;
            }
        }.method1(345.7);
    }
}
