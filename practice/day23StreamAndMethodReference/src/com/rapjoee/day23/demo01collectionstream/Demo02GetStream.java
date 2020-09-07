package com.rapjoee.day23.demo01collectionstream;

import java.util.*;
import java.util.stream.Stream;

/**
 * ClassName:Demo02GetStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 17:50
 * Description:
 *
 *    java.util.stream.Stream<T>接口是JDK8新加入的最常用的流接口【非函数式接口】
 *
 *    获取流的方式：
 *      1. 所有的Collection集合都可以通过stream默认方法直接获取流
 *          default Stream<E> stream()
 *      2. Stream接口的静态方法 of 可以获取数组对应的流
 *          static <T> Stream<T> of(T... values)  返回其元素是指定值的顺序排序流。
 */
public class Demo02GetStream {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream0 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        //Map集合可以间接获取流
        Map<String, String> map = new HashMap();
        //获取Map集合的键的集合，再获取其流
        Set<String> mapSet = map.keySet();
        Stream<String> mapStream = mapSet.stream();
        //获取Map集合的值的集合，再获取其流
        Collection<String> valuesSet = map.values();
        Stream<String> streamValue = valuesSet.stream();
        //获取Map集合键值对映射关系
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> entryStream = entrySet.stream();

        //数组转换为Stream流，使用Stream的静态方法of【其参数为可变参数】
        Stream<? extends Number> arrayStream = Stream.of(12.4, 34.7, 11.0, 23, 98.3);
        //由于是可变参数，所以也可以直接传递数组
        Stream<int[]> arrayStream2 = Stream.of(new int[]{12, 23, 34, 45});
    }
}
