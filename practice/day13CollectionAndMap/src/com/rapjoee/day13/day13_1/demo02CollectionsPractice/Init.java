package com.rapjoee.day13.day13_1.demo02CollectionsPractice;

import java.util.ArrayList;

/**
 * ClassName:Init
 *
 * @Author:baba
 * @Date:2020/2/7 16:18
 * Description:
 *
 * 初始化54张牌
 */
public class Init {
    public static ArrayList<String> initCard(ArrayList<String> arrayList) {
        ArrayList<String> color = new ArrayList<>();            //花色集合，存储四种花色
        ArrayList<String> number = new ArrayList<>();           //扑克牌大小集合，存储13种大小
        color.add("♥");                                       //四种花色
        color.add("♠");
        color.add("♦");
        color.add("♣");

        number.add("3");                                         //13种牌面
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");
        number.add("10");
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        number.add("2");

        for (int iColor = 0; iColor < color.size(); iColor++) {         //循环组装52张牌四种花色
            for (int iNumber = 0; iNumber < number.size(); iNumber++) {
                String card = color.get(iColor) + number.get(iNumber);      //花色+数字 组装一张牌
                arrayList.add(card);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");
        //System.out.println("==================");
        //System.out.println("扑克牌初始化：\n" + arrayList);
        //System.out.println("==================");
        System.out.println("扑克牌初始化完成！");
        System.out.println("共 " + arrayList.size() + " 张");                         //54张牌准备好了


        return arrayList;
    }
}
