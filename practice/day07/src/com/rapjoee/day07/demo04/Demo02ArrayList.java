package com.rapjoee.day07.demo04;

import java.util.ArrayList;

/**
 * ClassName:Demo02ArrayList
 *
 * @Author:baba
 * @Date:2020/1/17 16:11
 * Description:
 *      数组的长度不可改变，但是ArrayList集合的长度可以
 *
 *      对于ArrayList来说，<E>代表泛型
 *      泛型：也就是装在集合中的所有元素，全都是统一的类型
 *   注意：泛型只能是引用类型，不可以是基本类型
 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        //创建一个ArrayList集合，类型为String,名称为al
        ArrayList<String> al = new ArrayList<>();   //这里只能放string类型
        System.out.println(al);         //对于ArrayList，直接打印的是内容，而非地址值

        al.add("迪丽热巴");     //add方法
        al.add("古力娜扎");
        al.add("玛尔扎哈");
        System.out.println(al);//[迪丽热巴, 古力娜扎, 玛尔扎哈]
    }
}
