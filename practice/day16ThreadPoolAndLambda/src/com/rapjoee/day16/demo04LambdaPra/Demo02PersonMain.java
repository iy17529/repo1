package com.rapjoee.day16.demo04LambdaPra;

import java.util.Arrays;

/**
 * ClassName:Demo04LambdaPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 20:11
 * Description:
 *
 * Lambda练习：使用数组存储多个Person对象，对数组中的Person对象使用Arrays.sort()方法通过年龄进行升序排序
 */
public class Demo02PersonMain {
    public static void main(String[] args) {
        //创建Person类型的数组存储Person对象
        Person [] person = {
         new Person("吐槽星人",25),
         new Person("巴尔塔星人",18),
         new Person("喵星人",19),
         new Person("汪星人",22)
         };
        //遍历打印初始化数组
        System.out.println("数组初始化为：");
        for (Person p : person) {
            System.out.println(p);
        }

        /*Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();           //前边-后边为升序
            }
        });*/
        //Lambda标准格式：() -> {}
        //原来的compare方法是有参数有返回值的，所以参数与返回值添上
        Arrays.sort(person,(Person p1,Person p2) -> {
            return p1.getAge() - p2.getAge();
        });
        System.out.println("Lambda标准式年龄升序排序为：");
        for (Person p : person) {
            System.out.println(p);
        }

        //Lambda省略式:
        Arrays.sort(person,(p1, p2)->p2.getAge() - p1.getAge());
        System.out.println("Lambda省略式年龄降序排序为：");
        for (Person p : person) {
            System.out.println(p);
        }
    }
}
