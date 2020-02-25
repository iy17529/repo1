package com.rapjoee.day13.day13_2.demo02Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Demo01HashMapSavePerson
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 12:35
 * Description:
 * 使用自定义类型作为Map集合的元素   【Person】
 * 两种方案：
 *      1. String类型作为Key，Person类型作为value
 *              这种情况下，Key值不能重复，但String类型已经覆盖重写了toString()方法，所以不用多做其他的
 *      2. Person类型作为Key，String类型作为value
 *              这种情况下，Key值不能重复，【对于同名同年龄的人视为同一人】所以Person类必须覆盖重写名字与年龄的hashCode()与equals()方法
 *
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*第二种方案：
    * Person类型作为Key【同名同年龄的人视为同一人】
    *       不可重复，则需要覆盖重写年龄与姓名字段的hashCode()与equals()方法
    * String类型作为Value
    *       可重复*/
    private static void show02() {

        //创建HashMap并初始化
        HashMap<Person,String> hm2 = new HashMap<>();
        hm2.put(new Person("AAA",15),"A");hm2.put(new Person("BBB",22),"A");
        hm2.put(new Person("CCC",45),"C");hm2.put(new Person("AAA",18),"U");
        hm2.put(new Person("HHH",99),"H");hm2.put(new Person("HHH",99),"D");

        //Enter对象遍历打印集合
        Set<Map.Entry<Person, String>> hm2Entry = hm2.entrySet();
        System.out.println("Entry对象遍历打印集合:" );
        for (Map.Entry<Person, String> entry : hm2Entry) {
            //get方法获取键与值
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "~~~ " + value );
        }
    }

    /*
    第一种方案：
    String类型作为Key，Person类型作为Value【Value可以重复】
    * */
    private static void show01() {

        //创建HashMap并初始化
        HashMap<String,Person> hm1 = new HashMap<>();
        hm1.put("吐槽星",new Person("吐槽星人",78));
        hm1.put("喵星",new Person("喵星人",34));
        hm1.put("汪星",new Person("汪星人",61));
        hm1.put("吐槽星",new Person("巴拉巴拉星人",78));     //本条数据与前边键相同，会替换掉前面的数据

        //遍历并打印集合
        Set<String> hm1Set = hm1.keySet();
        Iterator<String> it1 = hm1Set.iterator();
        System.out.println("KeySet方法遍历打印集合：");
        while (it1.hasNext()) {
            String key = it1.next();
            Person value = hm1.get(key);
            System.out.println(key + ", " + value);
        }
    }
}
