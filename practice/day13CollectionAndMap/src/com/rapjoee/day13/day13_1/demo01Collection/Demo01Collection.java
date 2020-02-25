package com.rapjoee.day13.day13_1.demo01Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * ClassName:Demo01Collection
 *
 * @Author:baba
 * @Date:2020/2/6 19:13
 * Description:
 * 学习 java.util.Collection接口
 *          它是所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法，任意的单列集合都可以使用它
 *
 *      子接口：
 *          1. List接口【特点：元素有序且可重复，有索引，可使用for循环遍历】
 *                  1.1 Vector集合    ---------------->元素有序且可重复
 *                  1.2 ArrayList集合 ---------------->元素有序且可重复
 *                  1.3 LinkedList集合---------------->元素有序且可重复
 *
 *          2. Set接口【特点：元素无序且不可重复无索引，无法使用普通的for循环】
 *                  2.1 TreeSet集合   ---------------->无序的集合
 *                  2.2 HashSet集合   ---------------->无序的集合
 *                      2.2.1 LinkedHashSet集合 ------>【有序集合】
 *
 *      共性的方法：
 *              public boolean add(E e)：把给定的对象添加到当前集合中
 *              public void clear()：清空集合中所有的元素
 *              public boolean remove(E e)：把给定的对象在当前集合中删除
 *              public boolean contains(E e)：判断当前集合中是否包含给定的对象
 *              public booLean isEmpty()：判断当前集合是否为空
 *              public int size()：返回集合中元素的个数
 *              pubLic Object[] toArray()：把集合中的元素，存储到数组中
 *
 *     由于学习的是顶层接口，则换成任意一个集合类型，方法都通用
 */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();                //父类接口指向实现类对象 多态

        //  add()方法    返回值为boolean  不需要接收
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("玛尔扎哈");
        coll.add("沙扬娜拉");
        coll.add("马天宇");
        System.out.println(coll);                               //直接打印集合  说明此处toString()方法被重写了

        //remove()
        boolean m1 = coll.remove("马天宇");
        System.out.println("删除操作？" + m1);
        System.out.println(coll);

        //contains()
        boolean m2 = coll.contains("赵丽颖");//判断对象  赵丽颖 是否存在
        System.out.println("对象赵丽颖是否存在？" + m2);
        boolean m3 = coll.contains("陈坤");//判断对象  陈坤 是否存在
        System.out.println("对象陈坤是否存在？" + m3);

        //size()
        int size = coll.size();                                     //获取集合的长度
        System.out.println("集合的长度为： " + size);

        for (String s : coll) {                                     //for each循环打印集合
            System.out.println(s);
        }

        //toArray()   集合转数组
        Object[] objects1 = coll.toArray();
        System.out.println("集合转数组后集合为： " + coll);
        System.out.println("转换后的数组为： " + Arrays.toString(objects1));            //遍历打印数组

        //clear()   清空集合
        coll.clear();
        System.out.println("集合清空后为： " + coll);
    }
}
