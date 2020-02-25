package com.rapjoee.day06.demo03;

/**
 * ClassName:Person
 *
 * @Author:baba
 * @Date:2020/1/16 14:17
 * Description:
 * 学习private的封装
 *
 *      Age首字母大写，前面添加set与get，set方法
 *      setter方法有参数，无返回值，用于设置数据，参数类型与成员变量类型对应
 *      getter方法无参数，有返回值，用于获取数据，返回值类型与成员变量类型对应
 *    以上两种都属于间接访问
 *
 *    注意！！对于基本数据类型中的boolean类型，Getter方法一定要写成isXxx的形式，SetXxx规则不变
 */
public class Person {

    String name;
    private int age;         //private，本Person类中可以访问，本类外无法直接访问

    public int getAge() {          //这个成员方法，专门用于向age获取数据
        return age;
    }

    public void setAge(int ageParam) {         //这个成员方法，专门用于ageParam参数向age设置数据
        if (ageParam > 120 && ageParam < 0) {  //在setter方法中设置条件限制输入范围
            age = ageParam;
        } else {
            System.out.println("输入年龄数据有误，请重新输入！！");
        }
    }

    public void show() {
        /*要素：
        方法名：show()
        参数：无参数
        返回值：无返回值
        */
        System.out.println("我的名字是" + name + ",年龄是：" + age);
    }
}
