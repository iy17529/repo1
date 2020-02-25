package com.rapjoee.day13.day13_2.demo02Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ClassName:Demo02LinkedHashMap
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 13:03
 * Description:
 *
 *
 */
public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(123,001);
        hm.put(222,911);
        hm.put(456,322);
        hm.put(123,677);
        System.out.println(hm);         //不可重复且无序  {456=322, 123=677, 222=911}

        System.out.println("==============================");
        //创建LinkedHashMap集合
        LinkedHashMap<Integer ,Integer> linked = new LinkedHashMap<>();
        linked.put(123,001);
        linked.put(456,322);
        linked.put(222,911);
        linked.put(123,677);
        System.out.println(linked);     //  有序且不可重复  {123=677, 456=322, 222=911}
    }
}
