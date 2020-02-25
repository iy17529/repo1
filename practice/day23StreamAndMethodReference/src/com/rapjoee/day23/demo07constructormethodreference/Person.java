package com.rapjoee.day23.demo07constructormethodreference;

/**
 * ClassName:Person
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 18:03
 * Description:
 *
 * 自定义Person类
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
