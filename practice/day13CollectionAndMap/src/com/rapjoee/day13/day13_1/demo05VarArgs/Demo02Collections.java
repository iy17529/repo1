package com.rapjoee.day13.day13_1.demo05VarArgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * ClassName:Demo02Collections
 *
 * @Author:baba
 * @Date:2020/2/8 15:43
 * Description:
 *
 * java.utils.Collections是集合工具类
 * 集合工具类中有很多方法，用来对集合进行操作
 * 几个主要的方法：
 *      1. public static <T> boolean addAll((Collection<T> c,T...elements))     可变参数,给集合中添加元素
 *      2. public void shuffle(List<?> list)                                    打乱集合顺序
 *      3. public static <T> void sort(List<T> list)                            将List集合中元素按照默认规则【升序】排序
 *      4. public static <T> void sort(List<T> list, Comparator<? super T>)
 *                                  将集合中元素按照指定规则排序
 *
 *          注意：static <T> void sort(List<T> list)使用前提
 *                          被排序的集合里的元素，必须实现Comparable<T> 接口，覆写接口中的【public int compareTo(T o)】方法定义排序规则
 *               Comparable<T> 接口的排序规则：
 *                      自己this - 参数  ：为升序
 */
public class Demo02Collections {
    public static void main(String[] args) {

        //创建一个集合
        ArrayList<Integer> al = new ArrayList<>();

        //使用Collections工具类进行元素添加
        Collections.addAll(al,123,234,345,456,567,678);
        System.out.println("批量添加元素后为：" + al);               //[123, 234, 345, 456, 567, 678]

        //打乱顺序
        Collections.shuffle(al);
        System.out.println("打乱顺序后集合为：" + al);               //[234, 345, 678, 123, 567, 456]

        //3. public static <T> void sort(List<T> list)        将List集合中元素按照默认规则【升序】排序
        //注意只能是List 集合
        Collections.sort(al);
        System.out.println("工具类排序后为：" + al);

        //下面看看字符串排序
        System.out.println("=============================================");
        LinkedList<String> linked = new LinkedList<>();
        //工具类添加元素
        Collections.addAll(linked,"abc","bcd","def","fgh","ghi");
        Collections.shuffle(linked);
        System.out.println("字符串集合乱序：" + linked);

        //默认升序排序
        Collections.sort(linked);
        System.out.println("字符串集合升序排序后：" + linked);

        //创建集合存储Person对象
        ArrayList<Person> personArrayList = new ArrayList<>();

        //批量存储匿名对象
        Collections.addAll(personArrayList,new Person("迪丽热巴",16),new Person("玛尔扎哈",18),new Person("沙扬娜拉",22));

        //乱序
        Collections.shuffle(personArrayList);
        System.out.println("打印乱序Person集合： " + personArrayList);
        Collections.sort(personArrayList);                  //如果不对自定义类进行排序会报错，没有覆写排序规则
        System.out.println("年龄升序后：" + personArrayList);
    }
}
