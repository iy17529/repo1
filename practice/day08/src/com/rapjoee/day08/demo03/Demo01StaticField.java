package com.rapjoee.day08.demo03;

/**
 * ClassName:Demo01StaticField
 *
 * @Author:baba
 * @Date:2020/1/19 15:20
 * Description:
 * 如果一个成员变量使用了static关键字，则此变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("古力娜扎",20);
        one.classRoom="软件1702班";            //这里只对one赋值了教室，可以共享给two
        System.out.println("姓名是："+one.getName()+
                "，年龄是："+one.getAge()+"，班级是："+one.classRoom+"，学号是："+one.getId());

        Student two = new Student("迪丽热巴",18);
        System.out.println("姓名是："+two.getName()+
                "，年龄是："+two.getAge()+"，班级是："+two.classRoom+"，学号是："+two.getId());
    }
}
