package com.rapjoee.day13.day13_1.demo05VarArgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ClassName:Demo03Sort
 *
 * @Author:baba
 * @Date:2020/2/8 16:28
 * Description:
 *
 * 4. public static <T> void sort(List<T> list, Comparator<? super T>)
 *                                  将集合中元素按照指定规则排序
 *
 *          探究这个方法与第三个方法的区别
 *          Comparable与Comparator的区别
 *              1. Comparable：自己（this）与参数比较，自己需要实现 Comparable接口，覆写规则方法
 *              2. Comparator：相当于找一个第三方的裁判，进行两者比较
 */
public class Demo03Sort {
    public static void main(String[] args) {

        //创建集合存储Student对象并批量添加匿名Student对象
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Collections.addAll(studentArrayList,
                new Student("迪丽热巴6",28),new Student("8吐槽星人",18),
                new Student("喵星人",22),new Student("4迪丽热巴",18));
        Collections.shuffle(studentArrayList);
        System.out.println("乱序后打印集合：" + studentArrayList);

        //进行排序
        //匿名内部类作为Comparator<T>接口的实现类
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {        //有两个参数
                return o1.getAge() - o2.getAge();               //o1.getAge() - o2.getAge()为升序规则
                //return o2.getAge() - o1.getAge();               //o2.getAge() - o1.getAge()为降序规则
            }
        });

        System.out.println("年龄升序后打印集合：" + studentArrayList);
    }
}
/*
扩展：年龄升序，年龄相同时，再按照名字字母升序排序【默认为年龄相同时，先存储的在前边】
Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //年龄升序
                int result = o1.getAge() - o2.getAge();
                if(result == 0){                //如果年龄相同，则按照名字第一个字升序
                     result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
*/
