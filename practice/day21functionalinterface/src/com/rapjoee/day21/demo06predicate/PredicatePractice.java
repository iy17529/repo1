package com.rapjoee.day21.demo06predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * ClassName:PredicatePractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 13:32
 * Description:
 *
 * 练习：集合的筛选
 *      数组中含有多条"姓名+性别"的信息，请通过Predicate接口的拼装将符合要求的字符串筛选到集合中，需要同时满足两个条件：
 *          1. 必须是女生
 *          2. 姓名包含4个字
 */
public class PredicatePractice {
    public static void main(String[] args) {
        String[] person = {"迪丽热巴, 女", "巴尔塔星人, 女", "喵星人, 女", "吐槽星人, 女","玛尔扎哈, 男"};

            ArrayList<String> result = select(person,
                    (String t) -> {
                        //test方法对参数字符串进行切割
                        String[] info = t.split(", ");
                        //对字符串进行判断，必须是 "女"
                        return "女".equals(info[1]);
                    },
                    (String t) -> {
                        String[] info = t.split(", ");
                        //对姓名的长度进行判断，必须为4
                        return info[0].length() == 4;
                    });

        System.out.println("满足条件的元素集合如下：");
        System.out.println(result);
    }

    /**
     * 方法参数传递一个人员信息数组与两个Predicate接口，进行条件判断，满足作为把那个字符串加入集合
     * @param str 传递源人员数组
     * @param pre 判断性别是否为女
     * @param pre1 判断长度是否为4
     * @return 把添加了满足条件元素的集合返回
     */
    private static ArrayList<String> select(String[] str, Predicate<String> pre, Predicate<String> pre1) {
        ArrayList<String> list = new ArrayList<>();

        //取出数组中每个字符串元素，传递给test方法
        for (String s : str) {
            //如果满足两个条件就往集合中加入这个字符串
            if (pre.and(pre1).test(s)) {
                list.add(s);
            }
        }
        return list;
    }
}
