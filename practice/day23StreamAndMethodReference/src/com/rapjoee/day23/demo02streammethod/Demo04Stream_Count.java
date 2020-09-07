package com.rapjoee.day23.demo02streammethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * ClassName:Demo04Stream_Count
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 20:56
 * Description:
 *
 * 学习流中的第二个终结方法count(): 如集合中的size()方法一样，count方法可以数一数流中元素的个数
 *      long count()  返回此流中的元素数。
 *
 *    注意！该方法返回的是一个long型的数据，而不是像集合中的int型
 *          使用该方法后，无法再使用流的其他的方法
 */
public class Demo04Stream_Count {
    public static void main(String[] args) {
        //创建一个集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李六", "王七", "赵赵", "张二", "张小", "张舒", "六六", "张小明");

        //获取集合的流
        Stream<String> listStream = list.stream();

        //对流元素进行筛选，只保留第一个字为 张 的字符串
        Stream<String> streamFilter = listStream.filter(str -> str.startsWith("张"));
        //对流数据进行计数
        long count = streamFilter.count();
        System.out.println("过滤后的流的数据个数为：" + count);
    }
}
