package com.rapjoee.day06.demo4;

/**
 * ClassName:Demo01Student
 *
 * @Author:baba
 * @Date:2020/1/16 15:16
 * Description:
 */
public class Demo01Student {
    public static void main(String[] args) {

        Student stu1 = new Student();
        System.out.println("无参构造执行啦!!");

        Student stu2 = new Student("Rapjoe", 19);
        System.out.println("有参构造方法执行啦！！");
        System.out.println(stu2.getName() + "现在" + stu2.getAge() + "岁啦！！");

        //虽然有参数构造可以赋值，但是更改对象中的成员变量数据时，还是需要调用Setter与Getter方法
        stu2.setAge(22);
        System.out.println(stu2.getName() + "长大到" + stu2.getAge() + "岁啦！！");

    }
}
