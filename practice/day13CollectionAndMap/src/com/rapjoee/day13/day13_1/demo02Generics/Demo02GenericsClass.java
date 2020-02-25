package com.rapjoee.day13.day13_1.demo02Generics;

/**
 * ClassName:Demo02GenericsClass
 *
 * @Author:baba
 * @Date:2020/2/7 13:37
 * Description:
 */
public class Demo02GenericsClass {
    public static void main(String[] args) {

        //确定泛型为Integer
        //创建类的对象，此时已经指定了Integer类型
        GenericsClass<Integer> obj1 = new GenericsClass<>();

        //这里泛型的属性也是Integer类型，只能复制int类型数据
        obj1.setName(234);
        System.out.println("Integer类型赋值为： " + obj1.getName());

        //确定泛型为 String
        GenericsClass<String> stringGenericsClass1 = new GenericsClass<>();         //创建String类型类对象
        stringGenericsClass1.setName("Smith");
        System.out.println("String类型赋值为： " + stringGenericsClass1.getName());


    }
}
