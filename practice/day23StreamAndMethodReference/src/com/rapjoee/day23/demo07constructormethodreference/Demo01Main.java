package com.rapjoee.day23.demo07constructormethodreference;

/**
 * ClassName:Demo01Main
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 18:07
 * Description:
 * 类的构造器引用
 *
 */
public class Demo01Main {
    //定义一个方法。参数传递姓名与PersonBuilder接口与字符串
    public void printName(PersonBuilder pb, String name) {
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    //定义一个方法
}
