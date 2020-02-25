package com.rapjoee.day05.demo01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName:Demo03ArrAY
 *
 * @Author:baba
 * @Date:2020/1/9 19:15
 * Description:
 * 数组的使用
 */
public class Demo03Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 23;
        a[1] = 45;
        a[2] = 78;
        a[3] = 90;
        a[4] = 16;
        Arrays.sort(a);     //数组排序升序
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("===================");

        //遍历数组另一种方式：for each
        for (int n : a) {
            System.out.println(n);
        }
        System.out.println("===================");

        ArrayList<Integer> al = new ArrayList<>();
        al.add(34);
        al.add(364);
        al.add(4);
        for (int n : al) {
            System.out.println(n);
        }
        System.out.println("===================");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}

