package com.rapjoee.day06.demo4;

/**
 * ClassName:Student
 *
 * @Author:baba
 * @Date:2020/1/16 15:08
 * Description:
 *学习构造方法
 *      构造方法是用来创建对象的方法，new关键字创建对象时，就调用了构造方法
 *格式：
 * public 类名(参数列表){
 *     方法体
 * }
 * 注意：
 * 1、构造方法名与类名一致。包括大小写
 * 2、构造方法不能产生返回值，不用写返回值类型不需要写void
 * 3、不写构造方法，则编译器赠送一个默认构造方法，无参   public Student(){}
 * 4、一旦写了构造方法，则不赠送
 * 5、构造方法也是可以重载的
 */
public class Student {

    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Student() {
        System.out.println("无参构造方法执行啦！！");
    }

    //全参构造方法
    public Student(String name, int age) {        //可以通过全参构造直接赋值
        this.age = age;
        this.name = name;
    }

    public void setName(String nameParam) {
        this.name = nameParam;
    }

    public String getName() {
        return name;
    }

    public void setAge(int ageParam) {
        if (ageParam >= 0 && ageParam < 120) {
            this.age = ageParam;
        } else {
        }
    }

    public int getAge() {
        return age;
    }
}
