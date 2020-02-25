package com.rapjoee.day21.demo06predicate;

import java.util.function.Predicate;

/**
 * ClassName:Demo01Predicate
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 20:18
 * Description:
 *
 *      java.util.functional.Predicate<接口>
 *          作用：对某种数据类型的数据进行判断，，结果返回boolean值
 *
 *          包含一个抽象方法：
 *              boolean test(T t)在给定的参数上评估这个谓词。
 *               参数
 *               t - 输入参数
 *               结果
 *               true如果输入参数匹配谓词，否则为 false
 */
public class Demo01Predicate {
    public static void main(String[] args) {
        //用Lambda表达式作为参数
        boolean b = getBoo("Helly",
                (t) -> {
            //如果字符串中包含字符 y 则返回true
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if ('y' == c) {
                return true;
            }
        }
        return false;
        });
        System.out.println("字符串中包含y吗？" + b);
    }

    /**
     * 定义一个方法
     * @param s 参数1传递一个String类型的字符串
     * @param per 参数2传递一个predicate接口，泛型为String
     * @return 使用predicate的Test方法对字符串进行判断，并返回判断结果
     */
    private static boolean getBoo(String s, Predicate<String> per) {

        return per.test(s);
    }
}
