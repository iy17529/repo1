package com.rapjoee.day21.demo06predicate;

import java.util.function.Predicate;

/**
 * ClassName:Demo02Predicate
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 12:45
 * Description:
 *
 * 学习predicate接口里的or默认方法
 *      default Predicate<T> or(Predicate<? super T> other)，方法内部两个判断条件，使用||运算符连接起来的
 *      两个条件满足一个即可
 */
public class Demo03PredicateOr {
    public static void main(String[] args) {
        //调用check方法，传递Lambda表达式
        boolean b = check("HelloWorld",
                (t) -> {
            //判断字符串长度是否大于5
            return (t.length() > 5) ? true : false ;
                },
                (t) -> {
            //判断字符串中是否包含 q
            return t.contains("q");
                });
        System.out.println(b);
    }

    /**
     * 定义一个方法，方法的参数传递一个字符串，传递练个功predicate接口
     *      俩个判断条件：
     *          1. 字符串长度是否大于5
     *          2. 字符串中是否包含字符  q    两个条件满足一个即可
     * @param s
     * @param pre1
     * @param pre2
     * @return
     */
    private static boolean check(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //满足一个才行
        //return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);      //  and方法连接两个条件，等价于上面一行代码，满足一个条件即可
    }
}
