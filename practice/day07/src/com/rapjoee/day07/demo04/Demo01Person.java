package com.rapjoee.day07.demo04;

/**
 * ClassName:Demo01Person
 *
 * @Author:baba
 * @Date:2020/1/17 15:54
 * Description:
 *      对象数组可以存储对象
 *      其一旦创建，长度无法改变
 *
 *      ArrayList集合是大小可变的数组，其中可以添加元素，大小也自动增长
 */
public class Demo01Person {
    public static void main(String[] args) {

        Person [] arrayPerson = new Person[3];

        Person person1 = new Person("迪丽热巴",17);
        Person person2 = new Person("古力娜扎",18);
        Person person3 = new Person("玛尔扎哈",19);

        arrayPerson[0] = person1;
        arrayPerson[1] = person2;
        arrayPerson[2] = person3;

        System.out.println(arrayPerson[1].getName()+arrayPerson[1].getAge());
        System.out.println(arrayPerson[2].getName()+arrayPerson[2].getAge());
        System.out.println(arrayPerson[0].getName()+arrayPerson[0].getAge());
    }
}
