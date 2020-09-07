package com.rapjoee.day23.demo02streammethod;

import java.util.Random;
import java.util.stream.Stream;

/**
 * ClassName:Demo02Filter
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 20:12
 * Description:
 *  学习Stream接口中的filter()方法，可以对流里的数据进行过滤，返回流的一个子集流
 *
 *      Stream<T> filter(Predicate<? super T> predicate) 返回由与此给定谓词匹配的此流的元素组成的流。
 *      该方法接收一个Predicate接口作为筛选条件，里面的test抽象方法【boolean test(T t)】进行判断
 *              满足条件的流元素test方法会返回true，此元素进入子集流，否则过滤掉
 *
 *
 */
public class Demo02Filter {
    public static void main(String[] args) {
        Random ra = new Random();
        Stream<Integer> streamInt = Stream.of(ra.nextInt(90),
                ra.nextInt(90), ra.nextInt(90), ra.nextInt(90),
                ra.nextInt(90), ra.nextInt(90), ra.nextInt(90));

        //元素值范围在[20, 50]之间的保留，其他元素过滤掉
        //使用filter方法过滤元素【传递的是Consumer接口，使用Lambda表达式】
        Stream<Integer> newStream = streamInt.filter((number) -> number > 20 && number < 50);
        //遍历此类流
        newStream.forEach((number) -> System.out.print(number + " "));

        //Stream流属于管道流，只能使用一次【即只能消费一次】，第一个流调用完毕方法，流数据会流转到下一个Stream上
        //此时Stream流已经使用完毕，就关闭了，此流也就不能调用方法了

        //这里第一个初始的流已经关闭了，无法调用方法
                //IllegalStateException: stream has already been operated upon or closed
        //streamInt.forEach(num -> System.out.println(num));
    }
}
