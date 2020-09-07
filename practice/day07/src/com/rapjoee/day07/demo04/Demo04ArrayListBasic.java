package com.rapjoee.day07.demo04;

import java.util.ArrayList;

/**
 * ClassName:Demo04ArrayListBasic
 *
 * @Author:baba
 * @Date:2020/1/17 17:18
 * Description:
 * ArrayList的泛型只能是引用类型
 * 如果想向集合中存储基本类型的数据，必须使用基本类型对应的“包装类”
 * 基本类型     包装类（为引用类型，位于java.lang包下）
 * byte         Byte
 * short        Short
 * int          Integer             [特殊]
 * long         Long
 * float        Float
 * double       Double
 * char         Character           [特殊]
 * boolean      Boolean
 */
public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(123);
        al.add(234);
        al.add(134);
        al.add(24);

        int num1 = al.get(1);   //用int类型数据接收即可
        System.out.println(num1);
    }
}
