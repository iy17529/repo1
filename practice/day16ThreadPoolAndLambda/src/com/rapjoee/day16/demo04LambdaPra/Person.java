package com.rapjoee.day16.demo04LambdaPra;

/**
 * ClassName:Person
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 20:36
 * Description:
 *
 * 自定义Person类，需求对年龄进行排序【升序】
 *          需要实现Comparable<T> 并覆盖重写里边的compareTo方法
 */
public class Person /*implements Comparable<Person>*/ {         //传递Person类型进去比较
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


   /* @Override
    public int compareTo(Person person) {
        return this.getAge() - person.getAge();
    }*/
}
