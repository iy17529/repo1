package com.rapjoee.day10.demo02;

/**
 * ClassName:Demo01Main
 *
 * @Author:baba
 * @Date:2020/1/29 16:22
 * Description:
 * <p>
 * 多态：父引用指向子对象
 */
public class Demo01Main {
    public static void main(String[] args) {

        Animal animal = new Cat();          //多态，向上转型，一定是安全的
        animal.eat();           //调用了覆盖重写的方法，但是不能调用自己特有的方法
        Cat cat1 = (Cat) animal;//解决方法，向下转型
        cat1.catchMouse();           //可以调用子类特有的方法
        System.out.println("======================");

        //Dog dog1 = (Dog) animal;    //不是原本的对象，转型错误   ClassCastException
        //dog1.eat();
        getAPet(new Cat());
    }

    //多态的用处：方法的参数并不知道传递进来的是啥，管他进来的是啥  物尽其用,
    // 这里也可以理解为，我需要一个使用动物这个方法，有猫和狗两种，有多态的存在就不必要写两个使用动物的方法【即使用猫和使用狗】，只需要写一个使用方法即可，并且传入参数父类类型，指向子类对象
    public static void getAPet(Animal animal) {

        //做判断   用instanceof  其返回值为一个boolean类型数值
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
            dog2.eat();
            dog2.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat2 = (Cat) animal;
            cat2.eat();
            cat2.catchMouse();
        }
    }
}
