package com.rapjoee.day21.demo04supplier;

import java.util.function.Supplier;

/**
 * ClassName:Demo01Supplier
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 17:17
 * Description:
 *
 * 常用的函数式接口1 Supplier
 *      java.util.function.Supplier<T>接口仅仅包哈一个无参方法： T get()。用来获取一个泛型参数指定类型的对象数据
 *
 *      Supplier<T>接口被称为生产型接口，指定接口泛型，则其get方法就会生产什么类型的数据
 *
 */
public class Demo01Supplier {
    public static void main(String[] args) {
        //调用方法，传递一个函数式接口参数，所以可以用Lambda表达式进行实现
        /*getSupplier(() -> {
           return "不省略格式";
        });*/
        //getSupplier()方法返回一个字符串，接收一下
        String result = getSupplier(() -> "测试字符串");
        System.out.println(result);
    }

    /**定义一个方法，方法参数传递接口，泛型执行String，get方法会返回一个String
     *
     * @return
     */
    private static String getSupplier(Supplier<String> sup) {
        //get方法返回泛型，所以对于字符串直接返回
        return sup.get();
    }
}
