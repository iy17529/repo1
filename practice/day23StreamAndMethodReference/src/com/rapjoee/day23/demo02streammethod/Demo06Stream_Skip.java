package com.rapjoee.day23.demo02streammethod;

import java.util.stream.Stream;

/**
 * ClassName:Demo06Stream_Skip
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 21:21
 * Description:
 *
 * 学习流中的延迟方法skip:  用于跳过【删除
 * 】前面的n个元素，返回一个截断后的新流
 *      Stream<T> skip(long n)  在丢弃流的第一个 n元素后，返回由该流的 n元素组成的流。
 */
public class Demo06Stream_Skip {
    public static void main(String[] args) {
        Stream<? extends Number> init = Stream.of(12.0, 34.0, 45.9, 89.7, 45, 49.6, 98.3);

        //使用skip方法，舍弃前5个元素，其余元素组成新流并返回
        Stream<? extends Number> skip = init.skip(5);
        System.out.println("正常截断后得到的新流遍历：");
        //遍历流
        skip.forEach(number -> System.out.println(number));

        //如果要截断的个数大于流元素个数  则得到一个长度为0的流
/*        Stream<? extends Number> skip2 = init.skip(100);
        System.out.println("不正常截断后：");
        skip2.forEach(num -> System.out.println(num));*/
    }
}
