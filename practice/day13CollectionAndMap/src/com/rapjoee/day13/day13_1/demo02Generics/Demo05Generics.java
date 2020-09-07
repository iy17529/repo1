package com.rapjoee.day13.day13_1.demo02Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ClassName:Demo05Generics
 *
 * @Author:baba
 * @Date:2020/2/7 15:15
 * Description:
 *
 * 泛型通配符
 *      ? : 表示任意的数据类型
 *    注意！！使用通配符时，只能作接收使用，不可向其中存储数据
 *
 *    泛型的上限限定：? extends E 代表使用的泛型只能是E类型的子类/自身
 *    泛型的下限限定：? super  E  代表使用的泛型只能是E类型的父类/自身
 */
public class Demo05Generics {

    public static void main(String[] args) {

        //这里装载的是integer，可以调用、、、如果装载String会编译报错
        Collection<Integer> al1 = new ArrayList<>();
        al1.add(123);
        al1.add(234);
        al1.add(345);
        al1.add(456);
        printCollection(al1);                       //ArrayList<>集合作为参数

        //
        Collection<String> hs = new HashSet<>();
        hs.add("吐槽星人");
        hs.add("汪星人");
        hs.add("喵星人");
        //HashSet<>集合作为参数，但装载的String不是Number的子类，编译报错
        //printCollection(hs);
    }

    //使用泛型通配符,这里通配符上限是Number，集合装载的只能是Number自身或其子类，否则编译报错
    private static  void printCollection(Collection<? extends Number> collection) {
        System.out.println("集合打印为：" + collection);
    }
}
