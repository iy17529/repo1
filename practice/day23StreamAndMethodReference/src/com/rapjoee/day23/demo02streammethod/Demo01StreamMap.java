package com.rapjoee.day23.demo02streammethod;

import java.util.stream.Stream;

/**
 * ClassName:Demo01Stream_Map
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 20:44
 * Description:
 *
 * 学习流的方法 map()【映射】：把某种类型的数据转换为另一种类型
 *      <R> Stream<R> map(Function<? super T,? extends R> mapper) 返回由给定函数应用于此流的元素的结果组成的流。
 *          该方法需要一个Function函数式接口参数
 *              其中主要的抽象方法是apply 【R apply(T t)  将此函数应用于给定的参数】，可以把一种类型的数据转换为另一种类型
 *
 *
 */
public class Demo01StreamMap {
    public static void main(String[] args) {
        //Stream静态方法of() 获取一个初始流
        Stream<Integer> streamInit = Stream.of(123, 23, 1, 98, 56, 4, 34, 87);

        //使用流的map方法把int类型数据转换为字符串类型【映射】
            //使用Lambda表达式，覆盖重写里面的apply方法，进行数据类型的转换
        Stream<String> stream = streamInit.map(number -> number.toString());

        //遍历流的数据
        stream.forEach(number -> System.out.println(number));
    }
}
