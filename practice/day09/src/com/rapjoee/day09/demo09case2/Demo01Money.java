package com.rapjoee.day09.demo09case2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName:Demo01Money
 *
 * @Author:baba
 * @Date:2020/1/25 20:54
 * Description:
 */
public class Demo01Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Master ma = new Master("苦逼群主张三三",1000);

        Member mem1 = new Member("甲",35);
        Member mem2 = new Member("乙",135);
        Member mem3 = new Member("丙",33);
        Member mem4 = new Member("丁",0);
        Member mem5 = new Member("戊",89);
        Member mem6 = new Member("戌",0);
        Member mem7 = new Member("李四",23);
        Member mem8 = new Member("王五",5);
        Member mem9 = new Member("赵六",65);
        Member mem10 = new Member("钱二",77);
        Member mem11 = new Member("上官哈哈",15);
        Member mem12 = new Member("尚",0);
        Member mem13 = new Member("鱼叔",20);


        ma.show();
        mem1.show();
        mem2.show();
        mem3.show();
        mem4.show();
        mem5.show();
        mem6.show();
        mem7.show();
        mem8.show();
        mem9.show();
        mem10.show();
        mem11.show();
        mem12.show();
        mem13.show();

        System.out.println("========================================================");


        ArrayList<Integer> al = ma.outMoney(1000,13);

        mem1.inMoney(al);
        mem2.inMoney(al);
        mem3.inMoney(al);
        mem4.inMoney(al);
        mem5.inMoney(al);
        mem6.inMoney(al);
        mem7.inMoney(al);
        mem8.inMoney(al);
        mem9.inMoney(al);
        mem10.inMoney(al);
        mem11.inMoney(al);
        mem12.inMoney(al);
        mem13.inMoney(al);

        ma.show();
        mem1.show();
        mem2.show();
        mem3.show();
        mem4.show();
        mem5.show();
        mem6.show();
        mem7.show();
        mem8.show();
        mem9.show();
        mem10.show();
        mem11.show();
        mem12.show();
        mem13.show();

    }
}
