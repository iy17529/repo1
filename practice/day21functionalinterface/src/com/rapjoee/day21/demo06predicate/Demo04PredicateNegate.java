package com.rapjoee.day21.demo06predicate;

import java.util.function.Predicate;

/**
 * ClassName:Demo04PredicateNegate
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 13:19
 * Description:
 *
 * 默认方法
 *          default Predicate<T> negate()  取反操作
 *              对test方法的返回值进行取反ing返回
 *
 *        案例：判断字符串的长度是否大于5，大于5则返回false
 */
public class Demo04PredicateNegate {
    public static void main(String[] args) {
        boolean b = check("smithh", (t) -> {
            System.out.println(t + "的长度大于5吗的取反值是：");
           //如果字符串的长度大于5，则test方法返回false
           return t.length() > 5;
        });
        System.out.println(b);
    }
    private static boolean check(String s, Predicate<String> pre) {
        //返回test方法的取反值
        return pre.negate().test(s);
    }
}
