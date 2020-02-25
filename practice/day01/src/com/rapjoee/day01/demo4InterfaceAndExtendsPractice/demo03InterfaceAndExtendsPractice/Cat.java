package com.rapjoee.day01.demo4InterfaceAndExtendsPractice.demo03InterfaceAndExtendsPractice;

/**
 * ClassName:Cat
 *
 * @Author:baba
 * @Date:2020/2/3 17:10
 * Description:
 * 1. 该类必须包含String属性来存宠物的名字。
 * 2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
 * 3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
 * 4. 实现Pet接口方法。
 * 5. 实现eat方法。
 */
public class Cat extends Animal implements Pet{

    private String name;                //猫的名字

    public Cat() {
        this("");
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int legs, String name) {
        super(4);               //调用父类的构造器，猫有四条腿
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("猫玩耍");
    }

    @Override
    public void walk(){
        System.out.println("猫用"+legs+"条腿走路");
    }
}
