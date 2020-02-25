/*
package com.rapjoee.day01.demo06practice;

import java.util.ArrayList;
import java.util.Collection;

*/
/**
 * ClassName:MethodMin
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/17 15:01
 * Description:
 *
 * 泛型的实际应用：
 *      自己设计一个泛型的获取数组最小值的函数，并且这个方法只能接收Number的子类并且实现了Comparable接口
 *
 *//*

public class MethodMin {
    public static void main(String[] args) {

        Integer[] integerArr = {12, 5, 23, 90, 45, 13};

        min();

    }

    */
/**
     *
     * @param a     参数数组，只能是Number的子类
     * @return
     *//*

    private static <T extends Number & Comparable<? super T>> min(T[] values) {

        if (values == null || values.length == 0) return null;
        T min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min.compareTo(values[i]) > 0) min = values[i];
        }
        return min;
    }


}
*/
