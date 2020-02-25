package com.rapjoee.day13.day13_2.demo01Map;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Demo02HashMap
 *
 * @Author:baba
 * @Date:2020/2/8 17:22
 * Description:
 *
 * 学习Map集合中的一些主要的方法
 *1. V put(K Key, V value):把指定的键与值添加到Map集合中
 *2. V remove(Object Key):把指定的键对应的键值对元素从Map集合中删除，返回被删除的Value
 *3. V get(Object Key):根据指定的键，获取Map集合中对应的值
 *4. boolean containKey(Object Key):判断集合中是否包含指定的键
 *5. Set<K> keySet():获取Map集合中所有的键存储到Set集合中
 *6. Set<Map.Entry<K,V>> entrySet():获取Map集合中所有的键值对对象到Set集合中
 *
 */
public class Demo02HashMap {
    public static void main(String[] args) {

        methodContainKey();
    }

    private static void methodContainKey() {
        Map<String, Integer> hm = init();
        //4. boolean containKey(Object Key):判断集合中是否包含指定的键
        boolean b1 = hm.containsKey("tyu");
        System.out.println("是否包含tyu：" + b1);
    }

    private static void methodGet() {
        Map<String,Integer> hm = init();

        Integer getE = hm.get("aa");
        System.out.println("获取的元素是：" + getE);
        Integer get2E = hm.get("userName1");
        System.out.println("获取的元素是：" + get2E);

        //V get(Object Key):根据指定的键，获取Map集合中对应的值
                //键存在则返回键对应的值
                //键不存在则返回null
    }

    private static void methodRemove() {
        Map<String,Integer> hm = init();

        //2. V remove(Object Key):把指定的键对应的键值对元素从Map集合中删除，返回被删除的Value
        //键存在则返回对应的值
        //键不存在则返回null
        Integer removeE = hm.remove("userName1");
        System.out.println("被删除的值是：" + removeE);
        System.out.println("删除元素后Map集合：" + hm);

    }

    private static void methodPut() {
        //多态创建Map集合对象
        Map<String,Integer> hm = new HashMap<>();

        //1. V put(K Key, V value):把指定的键与值添加到Map集合中
                //键存在，则替换键对应的值，并返回被替换的值
                //键不存在，则添加键值对元素,并返回null
        Integer v1 = hm.put("userNme1", 123456);
        System.out.println("v1 :" + v1);
        Integer v2 = hm.put("userNme1", 100000);
        System.out.println("v1 :" + v2);
        System.out.println(hm);
    }

    private static Map<String,Integer> init() {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("userName1",111111);hm.put("userName2",222222);hm.put("userName8",888888);
        hm.put("userName6",999999);hm.put("userName4",222222);hm.put("userName10",1111111);
        hm.put("userName3",666666);
        System.out.println("打印Map集合：" + hm);

        return hm;
    }
}
