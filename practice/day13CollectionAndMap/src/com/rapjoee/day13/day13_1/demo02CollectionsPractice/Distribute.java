package com.rapjoee.day13.day13_1.demo02CollectionsPractice;

import java.util.ArrayList;

/**
 * ClassName:Distribute
 *
 * @Author:baba
 * @Date:2020/2/7 16:47
 * Description:
 *
 * 发牌的方法
 *
 */
public class Distribute {

    public static void distribute(ArrayList<String> all,ArrayList<String> personOne,
                                  ArrayList<String> personTwo,ArrayList<String> personThree,ArrayList<String> other){

        for (int counter = 0; counter < all.size(); counter++) {

            if(counter % 3 == 0 ){                          //给玩家一发牌 【数对3取模有三种结果，作为交替分配玩家手牌的依据】
                if(personOne.size()==17){                   //如果达到17张。则分配给底牌
                    String temp = all.get(counter);
                    other.add(temp);
                    continue;                               //分配给底牌，不给玩家
                }
                String card1 = all.get(counter);
                personOne.add(card1);                           //玩家一本轮获取一张牌
            }else if(counter % 3 == 1){
                if(personTwo.size()==17){
                    String temp = all.get(counter);
                    other.add(temp);
                    continue;
                }
                String card2 = all.get(counter);
                personTwo.add(card2);                           //玩家二本轮获得一张牌
            }else {
                if(personThree.size()==17){
                    String temp = all.get(counter);
                    other.add(temp);
                    continue;
                }
                String card3 = all.get(counter);                //大集合中取出牌
                personThree.add(card3);                         //玩家三本轮获得大集合中取出的一张牌
            }
        }
    }
}
