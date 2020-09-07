package com.rapjoee.day23.demo02streammethod;

import java.util.stream.Stream;

/**
 * ClassName:Demo3StreamAndMethod
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 19:53
 * Description:
 *
 * 流的方法有两种，一种延迟方法，调用完返回的还是流，可以继续调用流的方法【链式调用】
 *              一种是终结方法，调用完返回值不支持流接口自身的方法【本节中主要两个，一个count()，另一个是forEach()，其他的都是延迟发放】
 *
 *       1. void forEach(Consumer<? super T> action) 对此流的每个元素执行操作。   Consumer函数式接口，里面的accept方法可以消费数据
 *          简单记：forEach方法用来遍历流中的数据
 *          是1个终结方法，遍历之后就不能继续调用流中的其他的方法了
 */
public class Demo3Stream_ForEach {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> initStream = Stream.of("地星人", "巴尔塔星人", "喵星人", "汪星人", "吐槽星人");

        //forEach方法的参数是一个Consumer接口，覆盖重写其accept方法，对数据进行消费，这里我们打印处理【并且使用Lambda表达式的方式】
        initStream.forEach((str -> System.out.print(str + " ")));
    }
}
