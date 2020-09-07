package com.rapjoee.day01.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * ClassName:CollectionRemove
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/14 16:42
 * Description:
 *
 *      比较普通for循环、增强for循环和迭代器的删除
 *
 *    结论：
 *      1. 使用普通的for循环进行删除，在删除完成后立即使索引--，不然会漏掉被删除元素的下一个元素
 *      2. 使用for each循环时，不可进行删除操作【底层是迭代器】
 *      3. 使用迭代器进行删除时，删除方法必须是迭代器的remove方法，不能是集合的remove方法，不然会发生并发修改异常
 */
public class CollectionRemove {
    public static void main(String[] args) {
        Random ra = new Random();
        //创建集合并随机赋值【0~78】之间的数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, ra.nextInt(78), ra.nextInt(78), ra.nextInt(78),
                ra.nextInt(78), ra.nextInt(78), ra.nextInt(78),
                ra.nextInt(78), ra.nextInt(78), ra.nextInt(78),
                ra.nextInt(78), ra.nextInt(78));
        System.out.println("集合初始化为：" + list);

        //useForRemove(list);                     //如果两个相邻的元素满足删除条件，只会有一个元素被删除
        //userForEachRemove(list);                //ConcurrentModificationException，并发修改异常
        useIteratorRemove(list);            //ConcurrentModificationException
    }

    /**
     *迭代器初始化出来的时候，已经获取到集合的长度为固定size，如果用集合的remove方法对元素进行删除，长度size-1，但是迭代器还在拿着原来的size进行遍历，所以这边迭代器进行遍历，你集合在进行删除，属于并发修改异常
     * @param coll
     */
    private static void useIteratorRemove(ArrayList<Integer> coll) {
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            //删除
            if (value < 25) {
                //coll.remove(value);             //这里不能用集合的remove删除方法
                iterator.remove();             //只能使用迭代器的remove删除方法
            }
        }
        System.out.println("删除后的集合为：" + coll);
    }

    /**
     *增强for循环底层依赖的是迭代器，所以也是并发修改一异常
     * @param coll
     */
    private static void userForEachRemove(ArrayList<Integer> coll) {
        for (Integer integer : coll) {
            if (integer <= 15) {
                coll.remove(integer);
            }
        }
        System.out.println("删除后的集合为：" + coll);
    }

    /**
     *for循环如果要删除元素，遇到满足条件的删除后需要索引--，【因为删除本元素后，后面的元素会向前一位一次会漏掉相邻的偏后的这个元素】
     * @param coll
     */
    private static void useForRemove(ArrayList<Integer> coll) {
        for (int i = 0; i < coll.size(); i++) {
            if (coll.get(i) <= 25) {
                coll.remove(i--);           //等同于coll.remove(i);i = i - 1;
            }
        }
        System.out.println("删除后的集合为：" + coll);
    }
}
