package com.rapjoee.day13.day13_1.demo03List;

import java.util.LinkedList;

/**
 * ClassName:Demo02LinkedList
 *
 * @Author:baba
 * @Date:2020/2/8 12:08
 * Description:
 *
 * 学习LinkedList集合
 *
 *      ArrayList集合数据存储的是数组结构  ，元素增删慢，查找快
 *      LinkedList集合数据存储的是链表结构，方便严肃添加、删除  但是查询很慢
 *
 *      LinkedList提供了大量的首尾操作的方法
 *
 *      所有操作都是按照双重链接列表的需要执行的。在列表中编索引的操作将从开头或结尾遍历列表（从靠近指定索引的一端）。
 *      LinkedList是一个双向链表，所以找到头和尾非常方便
 *      方法如下：
 *      public E getFirst() {}          ：返回列表第一个元素
 *      public E getLast() {}           ：返回列表最后一个元素
 *      public void addFirst(E e) {}    :将指定元素插入到列表开头
 *      public void addLast(E e) {}     ：将指定元素插入到列表末尾
 *      public void push(E e) {}        ：此方法等效于 addFirst(E)。
 *
 *      public E removeFirst() {}       ：删除并返回列表的第一个元素
 *      public E removeLast() {}        ：删除并返回列表的最后一个元素
 *      public E pop(){}                ：此方法等效于 removeFirst()。
 *
 *
 */
public class Demo02LinkedList {
    public static void main(String[] args) {

        //不能使用多态，否则无法使用LinkedList特有的方法  创建并初始化链表
        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(123);
        linked.add(234);
        linked.add(456);
        linked.add(345);
        linked.add(789);
        System.out.println("遍历并打印链表："+ linked);         //[123, 234, 456, 345, 789]

        //public E getFirst() {}          ：返回列表第一个元素
        linked.addFirst(999);
        System.out.println("遍历并打印链表："+ linked);         //[999, 123, 234, 456, 345, 789]
        linked.push(111);                                   //链表头添加元素
        System.out.println("遍历并打印链表："+ linked);
        //linked.clear();                             //清空链表

        //public E pop(){}                ：此方法等效于 removeFirst()。
        //删除前先判断是否有元素
        boolean b1 = linked.isEmpty();
        if(!b1){
            Integer removedE = linked.pop();
            System.out.println("被删除的元素为：" + removedE);
            System.out.println("删除后：" + linked);
        }else {
            System.out.println("错误！！列表为空");
        }


    }
}
