package com.rapjoee.day13.day13_1.demo03List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ClassName:Demo01List
 *
 * @Author:baba
 * @Date:2020/2/8 11:19
 * Description:
 *
 * 学习Collection接口的List子接口
 *          三个特点：
 *          1. 元素有顺序，存储进去是什么顺序，拿取出来还是什么顺序【存1 2 3 取还是1 2 3 】
 *          2. 允许存储重复的元素
 *          3. 带有索引，包含一些带索引的方法
 *
 *      List接口中【特有】带索引的方法
 *      1. void add(int index, E element);   在指定索引位置添加元素element
 *      2. E set(int index, E element);      在指定索引位置修改元素值为element，返回值为被修改的元素值
 *      3. E get(int index);                 获得指定索引位置的元素值，返回值为获得的元素
 *      4. E remove(int index);              删除指定索引位置的元素  返回值为被删除的元素
 *
 *
 */
public class Demo01List {
    public static void main(String[] args) {

        //多态创建ArrayList集合
        List<String> al = new ArrayList<>();

        //初始化集合
        al.add("Hello");
        al.add("Java");
        al.add("Python");
        al.add("软件工程");
        al.add("Hello");        //允许添加重复的元素
        System.out.println(al);

        //1. void add(int index, E element);   在指定索引位置3[即元素 Python 后面]CCC
        al.add(3,"CCC");
        System.out.println("在Python元素后添加元素 CCC：\n" + al);

        //2. E set(int index, E element);      在指定索引位置修改元素值为element，返回值为被修改的元素值
        String setE = al.set(al.size()-1, "最后一个值");//修改最后一个值
        System.out.println("修改最后一个值：" + setE);

        //3. E get(int index);                 获得指定索引位置的元素值，返回值为获得的元素
        String getE = al.get(2);
        System.out.println("获取2号索引位置元素：" + getE);

        //4. E remove(int index);              删除指定索引位置的元素  返回值为被删除的元素
        //用于带有索引，所以可以用迭代器/for循环/增强for循环/while循环来遍历集合
        Iterator<String> it = al.iterator();        //获取迭代器对象
        while (it.hasNext()){
            String nextE = it.next();
            System.out.println(nextE + "");
        }

        //List集合特有的迭代器 listIterator
        ListIterator<String> stringListIterator1 = al.listIterator();
        stringListIterator1.add("ert");
        System.out.println(al);
    }
}
