package com.rapjoee.day13.day13_2.demo03MapPractice;

import java.util.*;

/**
 * ClassName:DouDiZhu
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 15:15
 * Description:
 *
 * 练习：上次做的斗地主发完牌没有顺序，此次学完Map集合，对摸完的牌进行排序
 *      具体规则：
 *          使用54张牌打乱顺序，三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张牌作底牌。牌到手有序
 *
 * 需求分析：
 *  1. 准备：定义一个大Map集合all存储所有54张牌，键为索引，从0~53，并创建索引集合list。值为组装后的牌从大到小，分别是大王，小王，黑桃K,黑桃Q...
 *  2. 准备：定义集合color存储四种花色【红桃♥、黑桃♠、方块♦、梅花♣】、number集合存储14中大小【2、A、K、J...4、3】，再加上大小王，组装放进大集合all的值中
 *  3. 准备：定义四个list集合personOne\personTwo\personThree\personFour\other分别存储三个玩家手牌位置与一个底牌位置【存键】
 *  4. 洗牌：使用工具类【java.util.Collections】中的静态方法 shuffle()  对Map集合的索引进行洗牌操作
 *               static void shuffle(List<?> list)  使用默认随机源对指定列表进行置换。所有置换发生的可能性都是大致相等的。
 *  5. 发牌：洗完牌后对索引集合中元素进行循环，交替分配给三个玩家手牌集合，每人17张，最后三张分配给底牌集合
 *  6. 排序，给牌进行排序
 *  6. 看牌：对玩家手牌与底牌，遍历打印三个玩家手牌集合与底牌集合
 */
public class DouDiZhu2 {
    public static void main(String[] args) {

        //创建Map集合牌盒，存储牌的索引和组装好的牌
        HashMap<Integer, String> all = new HashMap<>();
        //存储牌的索引,因为Map集合不能进行洗牌【shuffle方法只对list集合有效】操作，所以用索引集合代替牌盒的牌
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //玩家手牌集合与底牌集合
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> oth = new ArrayList<>();
        //索引
        int counter = 0;

        ArrayList<String> colors = new ArrayList<>();            //花色集合，存储四种花色
        ArrayList<String> numbers = new ArrayList<>();           //扑克牌大小集合，存储13种大小

        //四种花色
        Collections.addAll(colors, "♥", "♠", "♦", "♣");

        //13种牌面
        Collections.addAll(numbers, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");

        //1.1 组装牌 其他牌
        for (int numberI = 0; numberI < numbers.size(); numberI++) {
            for (int colorI = 0; colorI < colors.size(); colorI++) {

                //索引存入牌盒的键并同步索引集合index
                pokerIndex.add(counter);
                String valueInit = colors.get(colorI) + numbers.get(numberI);
                all.put(counter, valueInit);
                counter++;
            }
        }

        //1.2 组装牌 大小王
        if (counter == 52) {
            pokerIndex.add(counter);
            all.put(counter, "小王");
            counter++;
        }
        if (counter == 53) {
            pokerIndex.add(counter);
            all.put(counter, "大王");
        }
        System.out.println("扑克牌初始化完成，共" + pokerIndex.size() + "张");
        System.out.println("请输入三个玩家的名称：");
        String oneName = new Scanner(System.in).next();
        String twoName = new Scanner(System.in).next();
        String threeName = new Scanner(System.in).next();

        //2， 洗牌【对索引】
        //System.out.println("打乱前：" + pokerIndex);
        Collections.shuffle(pokerIndex);
        //System.out.println("打乱后：" + pokerIndex);
        System.out.println("洗牌完成！！");

        //3. 发牌【对索引】
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);

            //如果都满17张，则牌分配给底牌
            if ((one.size() == 17) & (two.size() == 17) & (three.size() == 17)) {
                oth.add(in);
                continue;}
            //获取集合index的i索引的值交替分配给玩家和底牌
            if (i % 3 == 0) {                               //给玩家一发牌
                one.add(in);
            }
            if (i % 3 == 1) {                               //给玩家二发牌
                two.add(in);
            }
            if (i % 3 == 2) {                               //给玩家三发牌
                three.add(in);
            }
        }

        /*//根据索引遍历Map集合【entrySet方法】
        Set<Map.Entry<Integer, String>> entries = all.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entries.iterator();       //获取键值对对象Entry集合的迭代器
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();                     //获取Entry对象
            String value = entry.getValue();                                //获取Entry对象的Value【即牌面】
        }*/


        //4. 给玩家牌和底牌排序
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(oth);
        System.out.println("发牌完成，查看手牌");

        System.out.print("玩家" + oneName + "手牌：" + "[ ");
        printPoker(one, all);
        System.out.print("玩家" + twoName + "手牌：" + "[ ");
        printPoker(two, all);
        System.out.print("玩家" + threeName + "手牌：" + "[ ");
        printPoker(three, all);
        System.out.print("底     牌：" + "[ ");
        printPoker(oth, all);
    }

    /*
    * 定义一个看牌的方法，提高代码的复用性
    * 参数:
    *       ArrayList<Integer> al:玩家手牌集合与底牌集合list
    *       HashMap<Integer, String> all：牌盒，全部已经组装好的牌
    * 返回值：无返回值
    **/

    private static void printPoker(ArrayList<Integer> al, HashMap<Integer, String> all) {
        for (int i = 0; i <= al.size() - 1; i++) {
            //遍历玩家和底牌的list集合，获得玩家手牌集合里关于牌面的索引【Map集合的键】
            Integer temp = al.get(i);
            if (i == (al.size() - 1)) {
                //根据牌面索引【键】获得牌面【值】
                System.out.println(all.get(temp) + " ]");
            } else {
                System.out.print(all.get(temp) + ", ");
            }
        }
    }
}
