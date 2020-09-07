package com.rapjoee.day07.demo05;

import java.util.ArrayList;

/**
 * ClassName:Demo02ArrayListStudent
 *
 * @Author:baba
 * @Date:2020/1/17 17:42
 * Description:
 * 需求:自定义4个学生对像，添加到集合，并遍历
 *
 * 思路：
 * 1、自定义学生类   四个部分
 * 2、实例化4个学生对象
 * 3、创建一个集合，类型为学生对象<Student>
 * 4、添加到集合，add()方法
 * 5、遍历：for     size    get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("迪丽热巴",18);
        Student stu2 = new Student("古力娜扎",23);
        Student stu3 = new Student("玛尔扎哈",28);
        Student stu4 = new Student("Rapjoe",19);

        ArrayList<Student> alStu = new ArrayList<>();
        //添加
        alStu.add(stu1);
        alStu.add(stu2);
        alStu.add(stu3);
        alStu.add(stu4);

        //遍历
        System.out.println("遍历集合为：");
        for (int i = 0; i < alStu.size(); i++) {
            System.out.println("姓名：" + alStu.get(i).getName()+",年龄："+alStu.get(i).getAge());
        }

    }
}
