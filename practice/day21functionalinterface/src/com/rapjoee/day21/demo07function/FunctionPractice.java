package com.rapjoee.day21.demo07function;

import java.util.function.Function;

/**
 * ClassName:FUnctionPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 14:37
 * Description:
 *
 * 练习：
 *          使用Function接口进行函数模型拼接，按照顺序需要执行的多个函数操作为：
 *              String str= "吐槽星人,20";
 *            1.将字符串截取数字部分，得到字符串数
 *            2.上一步得到的字符串转换为int类型数
 *            3.上一步得到的int数累加100，得到int数
 *
 *   思路：
 *      1.自定义方法，参数传递一个字符串与2个Function接口
 *      2. 第一个Function接口覆盖重写方法截取字符串并将得到的字符串数转换为int型
 *      3. 第二个Function接口将数累加100
 */
public class FunctionPractice {
    public static void main(String[] args) {
        String str = "吐槽星人,20";

        int re = method(str,
                (t) -> {
            //参数是字符串，截取字符串并转换为int数
                    String ageString = t.split(",")[1];
                    int ageInt = Integer.parseInt(ageString);
                    return ageInt;
                },
                (t) -> {
            //参数是一个int数【上一个接口转换并使用了and方法得到的】，int数累加100
                    for (int i = 0; i < 100; i++) {
                        t += i;
                    }
                    return t;
                });
        System.out.println("转换得到的数为：" + re);

    }

    private static int method(String str, Function<String, Integer> fun0, Function<Integer, Integer> fun1) {

        //使用and方法连接两个接口的方法
        return fun0.andThen(fun1).apply(str);
    }
}
