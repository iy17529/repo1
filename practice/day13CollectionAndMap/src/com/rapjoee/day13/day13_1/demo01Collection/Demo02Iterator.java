package com.rapjoee.day13.day13_1.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName:Demo02Iterator
 *
 * @Author:baba
 * @Date:2020/2/6 19:40
 * Description:
 *
 * Collection接口通用的遍历的接口Iterator
 * java.util.Iterator接口:也称作迭代器       专门对集合进行遍历
 *
 *   此为一个接口，我们无法直接使用需要使用Iterator接口的实现类对象
 *          获取其实现类对象：Iterator<E> iterator()  Collection接口中的iterator()方法，返回值就是迭代器的对象
 *
 *    使用步骤：
 *          1. 使用Collection接口中的iterator()方法获取迭代器的实现类对象并用Iterator接口接收【多态】
 *          2. 使用Iterator接口中的方法 boolean hasNext() 判断有没有下一个元素
 *          3. Iterator接口中的方法 E next()取出集合的下一个元素
 */
public class Demo02Iterator {
    public static void main(String[] args) {

        Collection<Integer> collection1 = new ArrayList<>();            //多态创建Collection对象
        collection1.add(12);
        collection1.add(23);
        collection1.add(34);
        collection1.add(56);
        collection1.add(45);

        Iterator<Integer> iterator1 = collection1.iterator();           //多态接收Iterator对象
        //boolean b1 = iterator1.hasNext();

        //for循环迭代
        for (Iterator<Integer> iterator2 = collection1.iterator(); iterator2.hasNext(); ) {
            Integer temp = iterator2.next();
            System.out.println(temp);
        }

        //不用设置步进表达时，迭代器next()方法自己取元素时指针后移

        //while循环迭代
        System.out.print("[");
        while (iterator1.hasNext()){
            Integer next2 = iterator1.next();
            if(iterator1.hasNext()) {
                System.out.print(next2 + ", ");
            }else {
                System.out.println(next2 + "]");
            }
        }

        /*
        迭代器的底层原理：
             Iterator<Integer> iterator1 = collection1.iterator();
                    多态获取并接收Iterator的实现类对象，并把指针（索引）指向集合的 -1 索引
               while循环中   hasNext()判断有没有下一个元素，有则进入循环体，执行next方法
                      next()方法两个作用：
                      1. 取出下一个元素   如  12    23   34等
                      2. 指针后移一位
                  继续判断hasNext()   直到指针在最后一位取完元素后  hasNext()返回false，则循环结束
        */
    }
}