package com.rapjoee.day23.demo05supermethodreference;

/**
 * ClassName:Man
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 17:44
 * Description:
 *
 * 定义子类
 */
public class Man extends Human{

    //覆盖重写父类方法
    @Override
    public void sayHello() {
        System.out.println("Hello我是Man");
    }

    //定义一个方法传递Greetable接口
    public void method (Greetable g) {
        g.greet();//调用接口的抽象方法打招呼
    }
    //定义show方法，调用method方法
    public void show() {
        //调用方法的参数是一个函数式接，可以传递Lambda表达式
        this.method(() -> {
            //创建父类对象，调用父类方法
            Human human = new Human();
            human.sayHello();
        });
        //上面的代买存在父子关系，使用super关键字代表父类，直接使用super调用父类方法，并使用方法引用
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
