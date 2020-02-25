package com.rapjoee.day23.demo02streammethod;

import java.util.stream.Stream;

/**
 * ClassName:Demo05Sream_Limit
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 21:07
 * Description:
 *
 * 学习流中延迟方法 limit() :用于截取流中的元素
 *      limit方法可以对流进行截取，只取前n个
 *          Stream<T> limit(long maxSize)  返回由此流的元素组成的流，截短长度不能超过 maxSize。
 *
 *          long型参数。如果集合当前长度大于参数会进行截取，否则不操作
 *
 *       limit()方法是一个延迟方法，知识对流中元素进行截取，返回一个新的流，可以继续调用流中其他方法
 */
public class Demo05Stream_Limit {
    public static void main(String[] args) {
        //初始化一个数组，并获取其流
        Stream<Integer> streamInit = Stream.of(11, 22, 33, 44, 55, 66, 77, 88);

        //limit方法取前五个元素
        Stream<Integer> limit = streamInit.limit(5);

        //遍历新的截取得到的流
        System.out.println("截取正常的流：");
        limit.forEach(num -> System.out.println(num));
        //streamInit.forEach(number -> System.out.println(number));
            //lang.IllegalStateException: stream has already been operated upon or closed

        //如果要截取的长度大于流的元素个数，只则能截取到流所有的数据【而不一定可以达到要截取的个数】
/*        Stream<Integer> limit1 = streamInit.limit(100);
        System.out.println("截取不正常的流：");
        limit1.forEach(num -> System.out.println(num));*/
    }
}
