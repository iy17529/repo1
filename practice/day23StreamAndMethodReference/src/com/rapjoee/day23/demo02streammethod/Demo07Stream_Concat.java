package com.rapjoee.day23.demo02streammethod;

import java.util.stream.Stream;

/**
 * ClassName:Demo07Stream_Concat
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 21:31
 * Description:
 *
 * 如果有两个流，希望合并为一个流，可以使用Stream接口的静态方法concat()方法：
 *      static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 *              创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
 *
 *
 *     注意！！这个静态方法，与String类的concat()方法不同
 */
public class Demo07Stream_Concat {
    public static void main(String[] args) {
        //获取两个流
        Stream<String> stream0 = Stream.of("张一", "张二", "张三", "张四", "张五", "张六");
        Stream<String> stream1 = Stream.of("李小", "李好", "李偶", "李想");

        //使用concat方法，拼接两个流
        Stream<String> concat = Stream.concat(stream0, stream1);
        //遍历拼接后的流
        concat.forEach(str -> System.out.println(str));

    }
}
