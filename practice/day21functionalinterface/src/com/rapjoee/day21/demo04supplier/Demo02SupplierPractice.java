package com.rapjoee.day21.demo04supplier;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * ClassName:Demo02SupplierPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 17:31
 * Description:
 *
 * 练习：
 *      使用Supplier接口作为方法参数类型 ，通过Lambda表达式求出int数组的最大值。
 *          接口的泛型使用java.lang.Integer类
 */
public class Demo02SupplierPractice {
    public static void main(String[] args) {
        //创建一个int数组并赋值
        int[] array = {12, 4, 78, 34, 999, 12, 18};

        Integer maxResult = getMax(() -> {
            //重写接口中的get方法，让他返回数组最大值
            Arrays.sort(array);
            return array[array.length - 1];
        });
        System.out.println("数组最大值为：" + maxResult);
    }

    private static Integer getMax(Supplier<Integer> su) {
        return su.get();
    }
}
