package com.rapjoee.day13.day13_2.demo02Map;

import java.util.Objects;

/**
 * ClassName:Person
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 12:33
 * Description:
 *
 * 自定义Person类型
 *
 */
public class Person {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //传递进来的是Object对象，不能访问到Person的属性和方法，所以进行判断，是不是Person对象，是则向下转型，不是返回false
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
