package com.rapjoee.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Demo02Interface
 *
 * @Author:baba
 * @Date:2020/2/1 19:22
 * Description:
 * 引用类型可以作为参数或者返回值
 * 在此以接口举例
 * List<E>是一个接口
 * ArraysList<E>是List<E>的一个实现类
 */
public class Demo02Interface {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();                //左父右子，为多态，设置一个方法为其添加数据

        List<String> result = add(al);
        System.out.println("打印集合为：");
        for(String n:result){
            System.out.println(n);
        }
    }
    public static List<String> add(List<String> list){           //接口List<E>作为参数与返回值
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("迪丽热巴");
        list.add("沙扬娜拉");

        return list;
    }
}
