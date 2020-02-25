package com.rapjoee.day13.day13_2.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Demo03KeySet
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 11:12
 * Description:
 *
 * 遍历Map集合的第一种方法（键找值）：
 *      1. 使用Map集合的KeySet()方法取出Map集合中所有的键，放在Set集合中
 *      2. 对Set集合进行遍历，取出每一个Key
 *      3. 使用Map集合的【V get(Object Key)】方法获得Key对应的Value
 *
 */
public class Demo03KeySet {
    public static void main(String[] args) {

        //多态创建Map集合并初始化
        Map<String,Integer> hm = new HashMap<>();
        hm.put("user123",123);hm.put("user234",234);
        hm.put("user345",345);hm.put("user456",456);
        hm.put("user567",567);hm.put("user678",678);
        System.out.println("打印Map集合为：" + hm);

        //KeySet()方法取出Map集合中所有的键，放在Set集合中
        Set<String> setHm = hm.keySet();

        //迭代器对Set集合进行遍历，取出所有键
        Iterator<String> it = setHm.iterator();
        System.out.println("所有的Map集合的键值对为 ：");
        while (it.hasNext()){
            String key = it.next();
            System.out.print(key);

            //使用Map集合的get方法得到键对应的值并打印
            Integer value = hm.get(key);
            System.out.println(", " + value + " ");
        }
        System.out.println("================================");

        //使用增强for循环遍历
        System.out.println("增强for循环遍历打印Map集合为：");
        for (String key : hm.keySet()) {                    //直接对keySet()的返回值作为集合
            Integer value = hm.get(key);
            System.out.println(key + ", " + value + " ");
        }
    }
}
