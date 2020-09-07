package com.rapjoee.day13.day13_1.demo04Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:Demo01Set
 *
 * @Author:baba
 * @Date:2020/2/8 13:03
 * Description:
 * 学习Set接口
 *
 * java.util.Set接口实现了Collection接口
 * Set接口的特点：
 *      1. 不允许存储重复的元素
 *      2. 没有索引，所以没有带索引的方法
 *
 *      java.util.HashSet集合实现了 Set接口
 *  HashSet特点：
 *       1. 不允许存储重复的元素
 *       2. 没有索引，所以没有带索引的方法
 *       3. 是一个无序的集合，存储顺序与取出存储可能不一致
 *       4. 底层是一个哈希表【查询速度非常快】
 */
public class Demo01Set {
    public static void main(String[] args) {

        //多态创建一个Set集合
        Set<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("Java");
        hs.add("IDEA");
        hs.add("Hello");

        //没有索引，所以不能使用for循环遍历
        //1. 用迭代器遍历
        Iterator<String> it = hs.iterator();
        System.out.println("迭代器遍历并打印HashSet集合：");
        while (it.hasNext()){
            String n = it.next();
            System.out.print(n+" ");            //Java Hello IDEA  说明没有顺序且无法存储重复元素
        }

        //使用for each循环遍历
        System.out.println("\n使用for each循环遍历: ");
        for (String h : hs) {
            System.out.print(h + " ");
        }
    }
}
