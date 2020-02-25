package com.rapjoee.day18.demo06properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName:Demo01Properties
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 17:34
 * Description:
 *
 *  java.util.Properties extends java.util.Hashtable<Object,Object>
 *
 *        Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
 *        Properties 集合是唯一一个与IO流相结合的集合
 *              可以是使用Properties集合的方法store，把集合中的临时数据【程序结束，集合清空并在合适的时候回收】，持久化写入到硬盘中存储
 *              可以是使用Properties集合的方法load，可以把硬盘中保存的文件【键值对】，读取到集合中使用
 *
 *        属性列表中每个键其对应值都是一个字符串
 *              Properties集合是一个双列集合，Key与Value默认都是字符串
 *
 *      Properties集合中有一些操作字符串的特有方法：
 *              Object setProperty(String key, String value)  调用 Hashtable 的方法 put。 添加元素
 *              String getProperty(String key)  用指定的键在此属性列表中搜索属性。相当于Map中的get(key)方法
 *              Set<String> stringPropertyNames()  返回此属性列表中的键集，其中该键及其对应值是字符串。相当于是Map中的keySet()方法
 *
 */
public class Demo01Properties {
    public static void main(String[] args) {

        //创建一个Properties集合【泛型不必写，默认为String】
        Properties pp = new Properties();

        //setProperty方法添加元素
        Object obj2 = pp.setProperty("张三", "111111");
        Object obj1 = pp.setProperty("王五", "222222");
        Object obj3 = pp.setProperty("周七", "333333");

        //getProperty()获取字符串元素
        String str1 = pp.getProperty("张三");
        System.out.println("getProperty():" + str1);

        //stringPropertyNames()方法遍历集合，取所有的键，存储到一个Set集合中
        Set<String> set1 = pp.stringPropertyNames();
        System.out.println("遍历集合得到的键为：" + set1);

        //遍历Set集合，取出所有的键，并根据键使用getProperty方法获取值
        System.out.println("键\t\t值");
        Iterator<String> it = set1.iterator();
        while (it.hasNext()) {
            String key = it.next();     //迭代器next()方法获取所有的键
            String value = pp.getProperty(key);        //根据键得到对应的值
            System.out.println(key + "\t\t" + value);
        }
    }
}
