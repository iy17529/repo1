package com.rapjoee.day13.day13_2.demo02Map;

import java.util.*;

/**
 * ClassName:Demo04Practice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 13:48
 * Description:
 *
 * Map集合练习：
 *      计算一个字符串中每个字符出现的次数
 *
 *   需求分析：
 *          1. 键盘获取一个字符串 Scanner
 *          2. 字符个数不确定，用可变长集合来存储，创建一个Map集合【HashMap<Character, Integer>】，键代表单个字符，值代表其出现的次数
 *          3. 把字符串转换为字符数组 toCharArray()方法
 *          4. 遍历字符数组，并把字符存入键中，键每出现一次，值+1
 *          5. 遍历打印Map集合   entrySet
 */
public class Demo04MapPractice {
    public static void main(String[] args) {

        //字符串初始化
        String strInit = initString();

        //获取Map含有字符与次数的集合
        HashMap<Character, Integer> map = getMap(strInit);

        //遍历打印集合
        printMap(map);
    }

    private static void printMap(Map<Character,Integer> mapParam) {
        //获取其entry集合[Set]
        Set<Map.Entry<Character, Integer>> entrySet = mapParam.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
        System.out.println("    字符    出现次数     ");
        System.out.println("========================");
        while (it.hasNext()) {

            //迭代器获取Set集合的元素【Map集合的键值Entry对象】
            Map.Entry<Character, Integer> keyEntry = it.next();

            //Entry对象的get方法获得键对应的值
            Character key = keyEntry.getKey();
            Integer num = mapParam.get(key);
            System.out.println("     " + key + "        " + num);
        }
        System.out.println("========================");
    }

    private static HashMap<Character, Integer> getMap(String str) {

        HashMap<Character,Integer> map = new HashMap<>();

        //转换为字符数组,遍历数组获取字符存入Map集合键中
        char[] charStr = str.toCharArray();
        for (char c : charStr) {

            //判断是否有这个元素，有则+1，无则存进去
            boolean b = map.containsKey(c);                 //这里也可以用Map集合的get方法做判断，获得值
                                                            // 值为null则没有此键值，则存入【字符,1】,否则取值，值+1，存入值

            //如果没有，则初始化键值为1，并存进去
            if(!b){
                Integer value = 1;
                map.put(c,value);

                //如果有，就获取键对应的值。值+1 再存入此值【同键则替换掉原来的值】
            }else {
                Integer valueTemp = map.get(c);
                valueTemp++;
                map.put(c,valueTemp);
            }
        }

        return map;
    }

    private static String initString() {

        //匿名对象获取Scanner对象
        System.out.println("请输入一个字符串：" );

        //键盘输入字符串
        String strInit = new Scanner(System.in).next();
        System.out.println("您输入的字符串为：" + strInit);

        return strInit;
    }
}
