package com.rapjoee.day21.demo05consumer;

import java.util.function.Consumer;

/**
 * ClassName:Demo02ConsumerAndThen
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 18:39
 * Description:
 *
 * 加入传递了两个Consumer接口，那么可以对象同一个数据先后进行两次消费
 *      String str = "Hello";
 *      Consumer<String> con1;
 *      Consumer<String> con2;
 *      con1.accept(str);
 *      con2.accept(str);
 *
 *    也可以使用andThen方法把两个con对象连接在一起进行消费
 *    con1.andThen(con2).accept(str);       谁写前边先执行谁的消费方法
 */
public class Demo02ConsumerAndThen {
    public static void main(String[] args) {

        //函数式接口作为参数，可以使用Lambda表达式
        use("上上下下左右左右BABA",
                (t) -> {
            //消费方式，小写打印
                    System.out.println("小写打印：" + t.toLowerCase());
                },
                (t) -> {
            //消费方式，大写打印
                    System.out.println("大写打印：" +t.toUpperCase());
                });
    }

    private static void use(String s, Consumer<String> con1, Consumer<String> con2) {
        //1. 分别进行accept方法
        //con1.accept(s);
        //con2.accept(s);

        //2. 使用andThen方法连接连个con再accept方法
        con1.andThen(con2).accept(s);       //谁写前边谁优先执行
        con1.andThen(con1).andThen(con1).andThen(con2).accept(s);
    }
}
