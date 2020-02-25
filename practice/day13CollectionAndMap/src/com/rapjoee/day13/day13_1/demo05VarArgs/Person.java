package com.rapjoee.day13.day13_1.demo05VarArgs;

/**
 * ClassName:Person
 *
 * @Author:baba
 * @Date:2020/2/8 16:06
 * Description:
 *
 * 这里自定义一个Person类，我们看看如果对集合中存储的自定义对象该怎么排序
 *
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //覆写Comparable<T>接口的排序方法
    @Override
    public int compareTo(Person o) {
        return (this.age - o.age);      //升序规则
    }
}
