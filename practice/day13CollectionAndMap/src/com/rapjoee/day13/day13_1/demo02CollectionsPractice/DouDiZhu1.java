package com.rapjoee.day13.day13_1.demo02CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

import static com.rapjoee.day13.day13_1.demo02CollectionsPractice.Distribute.distribute;
import static com.rapjoee.day13.day13_1.demo02CollectionsPractice.Init.initCard;

/**
 * ClassName:CollectionsPractice1
 *
 * @Author:baba
 * @Date:2020/2/7 15:38
 * Description:
 * 集合综合案例
 *      按照斗地主的规则，完成洗牌发牌的动作。
 *   具体规则：
 *      使用54张牌打乱顺序，三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张牌作底牌。
 *
 * 需求分析：
 *  1. 准备：定义一个大集合all存储所有54张牌
 *  2. 准备：定义集合color存储四种花色【红桃♥、黑桃♠、方块♦、梅花♣】、集合number存储14中大小【2、A、K、J...4、3】，再加上大小王，组装放进大集合all中
 *  3. 准备：定义四个集合personOne\personTwo\personThree\personFour\other分别存储三个玩家手牌位置与一个底牌位置
 *  4. 洗牌：使用工具类【java.util.Collections】中的静态方法 shuffle()  进行洗牌操作
 *               static void shuffle(List<?> list)  使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
 *  5. 发牌：洗完牌后对大集合all中元素进行循环，交替分配给三个玩家手牌集合，每人17张，最后三张分配给底牌集合
 *  6. 看牌：遍历打印三个玩家手牌集合与底牌集合  
 */
public class DouDiZhu1 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList();                //牌盒，存储54张牌  使用泛型String
        ArrayList<String> personOne = new ArrayList<>();        //三个玩家手牌集合与底牌集合
        ArrayList<String> personTwo = new ArrayList<>();
        ArrayList<String> personThree = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();

        initCard(all);                                          //准备54个牌

        //洗牌
        Collections.shuffle(all);                               //Collections的静态shuffle进行洗牌

        //发牌
        distribute(all,personOne,personTwo,personThree,other);  //发牌方法，传参

        System.out.println("");
        System.out.println("发牌结束，查看手牌");
        System.out.println("玩家一手牌：" + personOne);
        System.out.println("玩家二手牌：" + personTwo);
        System.out.println("玩家三手牌：" + personThree);
        System.out.println("底牌：" + other);

    }
}
