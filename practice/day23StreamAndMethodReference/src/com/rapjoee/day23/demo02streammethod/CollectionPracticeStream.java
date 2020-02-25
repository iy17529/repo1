package com.rapjoee.day23.demo02streammethod;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * ClassName:CollectionPracticeStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 13:33
 * Description:
 *
 * 使用Stream流的方式对集合进行同样的操作
 *      两个ArrayList集合存储队伍中多个成员的姓名，要求使用流的方式依次进行以下若干操作：
 *              1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
 *              2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
 *              3.第二个队伍只要姓张的成员姓名；存储到一个新集合中。
 *              4.第二个队伍筛选之后不要前2个人；存储到一个新集合中
 *              5.将两个队伍合并为一个队伍；存储到一个新集合中。
 *              6.根据姓名创建 Person对象；存储到一个新集合中。
 *              7.打印整个队伍的 Person对象信息。
 */
public class CollectionPracticeStream {
    public static void main(String[] args) {
        //创建两个集合并添加元素
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴"); one.add("宋远桥"); one.add("苏星河");
        one.add("石破天");one.add("石中玉"); one.add("老子");
        one.add("庄子"); one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");two.add("张无忌");two.add("赵丽颖");
        two.add("张三丰");two.add("尼古拉斯赵四");two.add("张天爱");
        two.add("张二狗");

        //1.第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
        //2.第一个队伍筛选之后只要前3个人；存储到一个新集合中。
                //使用流的方法filter进行过滤，方法参数为函数式接口，使用Lambda表达式
        Stream<String> oneResult = one.stream().filter(name -> name.length() == 3).limit(3);

        //3.第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        //4.第二个队伍筛选之后不要前2个人；存储到一个新集合中
        Stream<String> twoResult = two.stream().filter(name -> name.startsWith("张")).skip(2);

        //5.将两个队伍合并为一个队伍；存储到一个新集合中。
                //使用Stream接可静态方法concat()合并两个集合
/*        Stream<String> concat = Stream.concat(oneResult, twoResult);

        //6.根据姓名创建 Person对象；存储到一个新集合中。
                //使用流的方法map()对流进行映射，转换为Person类型
                        //匿名对象创建Person，name作为Person的姓名
        Stream<Person> personStream = concat.map((String name) -> {
            return new Person(name);
        });

        //7.打印整个队伍的 Person对象信息。
        personStream.forEach(per -> System.out.print(per + " "));
                //Person{name='宋远桥'} Person{name='苏星河'} Person{name='石破天'} Person{name='张天爱'} Person{name='张二狗'}*/

        //以上合并为一条
        Stream.concat(oneResult, twoResult).
                map(name -> new Person(name)).forEach(name -> System.out.print(name + " "));

    }
}
