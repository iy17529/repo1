package com.rapjoee.day13.day13_1.demo04Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * ClassName:Demo04LinkedHashSet
 *
 * @Author:baba
 * @Date:2020/2/8 15:09
 * Description:
 *
 * 学习LinkedHashSet集合 继承了 HashSet<E>类
 *      特点：
 *      1. 元素不允许重复
 *      2. 元素有序
 *
 *   底层是一个哈希表【数组 + 链表/红黑树】 + 链表的结构  加的链表用来记录元素存储的顺序，保证元素有序
 *
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {

        //创建一个HashSet集合并初始化
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(23);
        hs.add(34);
        hs.add(45);
        hs.add(56);
        hs.add(67);
        hs.add(12);     //有一重复元素
        System.out.println("打印HashSet集合：" + hs);        //[34, 67, 23, 56, 12, 45]  不可重复且无序

        //创建一个LinkedHashSet集合并初始化
        LinkedHashSet<Integer> linked = new LinkedHashSet<>();
        linked.add(123);
        linked.add(234);
        linked.add(345);
        linked.add(456);
        linked.add(567);
        linked.add(123);        //有一重复元素
        System.out.println("打印LinkedHashSet集合为： " + linked);    //[123, 234, 345, 456, 567]  不可重复但有序
    }
}
