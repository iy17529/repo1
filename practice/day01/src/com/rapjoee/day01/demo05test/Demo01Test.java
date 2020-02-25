package com.rapjoee.day01.demo05test;

/**
 * ClassName:Demo01Test
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/16 10:24
 * Description:
 *
 * 理解面向对象的封装、继承与多态
 */
public class Demo01Test {
    public static void main(String[] args) {
        //多态创建一个人类对象
        Animal person1 = new Person("张三", 15, "女");
        person1.eat();//人类张三在吃饭饭！！
        //创建一个人类对象
        Person person2 = new Person("王梅", 18, "女");
        person2.eat();
        person2.move();
        person2.printAge();
        Animal monkey1 = new Monkey("猴子1");
        monkey1.eat();
        /*if (person1 instanceof Person) {
            Person p1 = (Person) person1;
            p1.printAge();
        }*/

    }
}
