package com.rapjoee.day21.demo03lambdatest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName:Demo01Comparator
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 16:47
 * Description:
 *
 * Lambda表达式可以作为参数与返回值
 *      定义一个 getComparator()方法，获取字符串的排序规则【按照字符串的长度进行排序】
 *
 */
public class Demo01Comparator {
    public static void main(String[] args) {
        String[] array ={"qqq", "wieo", "zzzzzzzz", "a", "poiuu", "zzzz"};

        System.out.println("排序前：" + Arrays.toString(array));
        Arrays.sort(array, getComparator());
        System.out.println("字符串长度降序后：" + Arrays.toString(array));
    }

    /**定义一个方法对字符串进行排序，按照字符串长度排序
     *
     * @return 返回一个排序规则
     */
    private static Comparator<String> getComparator() {

        //匿名内部类实现
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串的长度降序排序
                return o2.length() - o1.length();
            }
        };*/

        //Lambda表达式实现
        return (o1, o2) -> o2.length() - o1.length();
    }
}
