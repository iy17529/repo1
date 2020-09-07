package com.rapjoee.day21.demo05consumer;

import java.util.function.Consumer;

/**
 * ClassName:Demo01Consumer
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 17:52
 * Description:
 *
 * java.util.function.Consumer<T>接口与supplier接口相反，消费一个数据，其数据类型由泛型决定
 *      Consumer<T>接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据
 *
 *      泛型执行什么接口，他就消费【使用】什么类型的数据，怎么消费由我们决定【计算、输出打印...】
 *
 */
public class Demo01Consumer {
    public static void main(String[] args) {
        use("Smith", (name) -> {
            //第一种消费方式，直接输出
            System.out.println(name);

            //第二种消费方式：字符串反转AAAAAAAAAAA
            String reverse = new StringBuffer(name).reverse().toString();
            System.out.println("字符串反转为：" + reverse);
        });
    }

    private static void use(String name, Consumer<String > con) {
        con.accept(name);
    }
}
