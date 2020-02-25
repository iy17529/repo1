package com.rapjoee.day13.day13_1.demo02Generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName:Demo01Generics
 *
 * @Author:baba
 * @Date:2020/2/7 13:04
 * Description:
 * 学习泛型
 *      泛型：未知的数据类型
 *
 *    1.创建集合不使用泛型：
 *              好处：可以储存任意对象
 *              弊端：不安全，当使用特定类型类的方法时，可能会抛出异常【ClassCastException】
 *
 *    2. 创建集合使用泛型
 *              好处：1. 把运行期异常提升到了编译期异常  2. 避免了类型转换的麻烦，存什么类型 取什么类型
 *              弊端：泛型什么类型 只能存什么类型数据
 */
public class Demo01Generics {
    public static void main(String[] args) {
        genericsNotUse();                           //不使用泛型的方法
        genericsUse();                              //使用泛型的方法
    }

    private static void genericsUse() {
        ArrayList<Integer> al2 = new ArrayList<>();         //使用泛型  这里只能存int型整数
        al2.add(123);
        al2.add(456);
        al2.add(789);
        Iterator<Integer> iterator1 = al2.iterator();       //同时它的迭代器也是Integer类型的
        while (iterator1.hasNext()){
            Integer next = iterator1.next();
            System.out.println(next + " " );
        }
    }

    private static void genericsNotUse() {                  //创建集合对象，不使用泛型
        ArrayList al1 = new ArrayList();                //未指定类型，可以存储任意类型的对象
        al1.add("Hello");
        al1.add(true);
        al1.add(462);
        al1.add('和');
        al1.add("How");
        al1.add("do");
        al1.add("you");
        al1.add("do");
        Iterator iterator1 = al1.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();                  //迭代器遍历集合的元素，用Object类型接收
            System.out.print(obj + " ");
            if(obj instanceof String){                      //instanceof进行判断，是String类型，可以获取其长度
                int length = ((String) obj).length();       //如果不判断，直接向下转型可能会出现ClassCastException
                System.out.println("  --为字符串类型，其长度为： " + length);
            }else {
                continue;
            }
        }
    }
}
