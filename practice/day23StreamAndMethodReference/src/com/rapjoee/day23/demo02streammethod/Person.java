package com.rapjoee.day23.demo02streammethod;

/**
 * ClassName:Person
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 13:16
 * Description:
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
