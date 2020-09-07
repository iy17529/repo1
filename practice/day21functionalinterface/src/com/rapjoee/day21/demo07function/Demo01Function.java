package com.rapjoee.day21.demo07function;

import java.util.function.Function;

/**
 * ClassName:Demo01Function
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 14:17
 * Description:
 *
 *    java.util.function.Function<T,R>接口用于根据一个类型的数据得到另一个类型的数据，前者为前置条件，后者后置条件
 *
 *    最主要的抽象方法为 apply，根据类型T的参数获取类型R的结果
 *      apply(T t)  将此函数应用于给定的参数。
 *              使用场景：把String类型数据转换为Integer类型
 */
public class Demo01Function {
    public static void main(String[] args) {
    convert("345", (String str) -> {
        //把字符串整数转换为Integer整数
        return Integer.parseInt(str);
    });
    }

    /**
     * 定义一个方法，参数传递一个字符串类型的整数，与一个Function接口，调用apply方法 把String整数转换为Integer整数
     * @param s
     * @param fun
     * @return
     */
    private static void convert(String s, Function<String, Integer> fun) {
        Integer re = fun.apply(s);

        System.out.println(re);
    }
}
