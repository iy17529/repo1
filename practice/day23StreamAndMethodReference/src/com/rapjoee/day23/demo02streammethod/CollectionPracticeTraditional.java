package com.rapjoee.day23.demo02streammethod;

import java.util.ArrayList;

/**
 * ClassName:CollectionPracticeTraditional
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 13:00
 * Description:
 *
 * 练习：集合元素处理（传统方式）
 *      题目：
 *      两个ArrayList集合存储队伍中多个成员的姓名，要求使用传统的for循环（foreach循环）依次进行以下若干操作：
 *           1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
 *           2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
 *           3.第二个队伍只要姓张的成员姓名；存储到一个新集合中。
 *           4.第二个队伍筛选之后不要前2个人；存储到一个新集合中
 *           5.将两个队伍合并为一个队伍；存储到一个新集合中。
 *           6.根据姓名创建 Person对象；存储到一个新集合中。
 *           7.打印整个队伍的 Person对象信息。
 *                  两个队伍（集合）的代码如下：
 */
public class CollectionPracticeTraditional {
    public static void main(String[] args) {
        //创建两个集合，并添加元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("迪丽热巴"); list1.add("宋远桥"); list1.add("苏星河");
        list1.add("石破天");list1.add("石中玉"); list1.add("老子");
        list1.add("庄子"); list1.add("洪七公");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("古力娜扎");list2.add("张无忌");list2.add("赵丽颖");
        list2.add("张三丰");list2.add("尼古拉斯赵四");list2.add("张天爱");
        list2.add("张二狗");

        //1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
        ArrayList<String> total = new ArrayList<>();
        ArrayList<String> one = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            String name = list1.get(i);
            if (name.length() == 3) {
                one.add(name);
            }
        }

        //2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        for (int i = 0; i < 3; i++) {
            //5.将两个队伍合并为一个队伍；存储到一个新集合中。
            total.add(one.get(i));
        }

        //3.第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        ArrayList<String> two = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            String name1 = list2.get(i);
            if (name1.startsWith("张")) {
                two.add(name1);
            }
        }
        //4.第二个队伍筛选之后不要前2个人；存储到一个新集合中
        for (int i = 2; i < two.size(); i++) {
            //5.将两个队伍合并为一个队伍；存储到一个新集合中。
            total.add(two.get(i));
        }

        //6.根据姓名创建 Person对象；存储到一个新集合中。
        ArrayList<Person> person = new ArrayList<>();
        for (String s : total) {
            person.add(new Person(s));
        }

        //7.打印整个队伍的 Person对象信息。
        System.out.println("打印Person对象集合：" + person);//[Person{name='宋远桥'}, Person{name='苏星河'}, Person{name='张天爱'}, Person{name='张二狗'}]
    }
}
