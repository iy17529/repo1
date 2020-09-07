package com.rapjoee.day13.day13_2.demo02Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * ClassName:Demo01Hashtable
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 13:40
 * Description:
 * Hashtable<K, V>实现了Map接口
 *
 * Hashtable是一个线程安全的集合，单线程，速度慢，同步，已经被HashMap取代
 *      底层是一个哈希表
 *      特点：不可存储null值
 *
 *  其子类集合Properties是一个唯一和io流相结合的集合，仍然活跃在历史的舞台
 *
 */
public class Demo01Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        //HashMap可以存储null值，null键
        map.put(" ",null);
        map.put(null,null);
        System.out.println(map);        //{ =null, null=null}

        Hashtable<String,String> table = new Hashtable<>();
        table.put(null,"q");            //NullPointerException
        table.put("1",null);
        System.out.println(table);  //运行报错
    }
}
