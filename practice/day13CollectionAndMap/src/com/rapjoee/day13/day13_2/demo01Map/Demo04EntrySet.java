package com.rapjoee.day13.day13_2.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Demo04EntrySet
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 11:43
 * Description:
 * 学习遍历Map集合的第二种方式(使用Entry对象遍历)：
 *      Map<K, v> 接口中有一个内接口Entry<K,V>【内部类】，是Map集合中的反映键值映射关系的键值对对象
 *      Map集合一旦创建，就会在集合中创建一个Entry对象来记录键与值之间的映射关系
 *
 *    遍历Map集合的方法：
 *          1. 使用Map集合中的【Set<Map.Entry<K, V>> entrySet()】方法获得集合中的每一个键值对对象，存储在一个Set集合中
 *          2. 使用Set集合的get方法遍历并获取Set集合的元素【即键值对对象】
 *          3. Entry对象中有两个方法【 K getKey()==== V getValue()】用来获取对象的键与值
 */
public class Demo04EntrySet {

    public static void main(String[] args) {

        //多态创建Map集合并初始化
        Map<String, Character> map = new HashMap<>();
        map.put("吐槽星人", 'T');
        map.put("汪星人", 'W');
        map.put("喵星人", 'M');
        map.put("地星人", 'D');
        map.put("巴尔塔星人", 'B');
        System.out.println("打印Map集合为：" + map);

        //获取Map集合的Entry对象存储在Set集合中
        Set<Map.Entry<String, Character>> entriesSet = map.entrySet();

        //while循环遍历Set集合
        System.out.println("键值对为：");
        Iterator<Map.Entry<String, Character>> it = entriesSet.iterator();
        while (it.hasNext()) {
            //获取Entry对象
            Map.Entry<String, Character> entryObj = it.next();
            String key = entryObj.getKey();
            Character value = entryObj.getValue();
            System.out.println("[ " + key + ", " + value + " ]");
        }
    }
}
