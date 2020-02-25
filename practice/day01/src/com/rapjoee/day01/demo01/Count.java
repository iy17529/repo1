package com.rapjoee.day01.demo01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName:Count
 *
 * @Author:baba
 * @Date:2020/1/18 13:07
 * Description:
 *
 * 根据输入单子的价钱，输出应得配送费
 *
 * 工资结算：
 * 1、普通1.5r/单(订单额度不超过40)
 * 2、单日配送超过20单的每单按1.8r
 * 3、超过40r的订单2.5r/单
 *
 * 需求：输入订单额度，输出对应应得工资
 *
 * 思路：
 * 1、俩集合  大集合存储输入的订单额度，小集合存储工资   ArrayList<E>
 * 2、大集合数据键盘输入   Scanner  add()
 * 3、判断大集合数据大小，输出对应的工资数据进入小集合   get for add
 *
 */
public class Count {
    public static void main(String[] args) {
        ArrayList<Integer> order = new ArrayList<>();  //存储输入的订单额度
        Scanner sc = new Scanner(System.in);
        //salary 今天总工资
        double salary = 0.0;
        //boolean qwe = true;

        System.out.println("请输入订单列表(回车分隔，以单独一个 0 结束):");
        while (true){
            int num = (int) sc.nextDouble();
            if(num < 0){
                System.out.println("数据有误！订单金额为正，请重新输入：");
                continue;
            }
            if(num == 0){          //当输入 “0” 时，输入结束
                //qwe = false;
                break;
            }
            order.add(num);
        }

        //赋值调用count方法，获得一天单个小工资集合
        ArrayList<Double> salaryOfDay = count(order);

        //提成的单数
        double bonusCount1 = salaryOfDay.get(salaryOfDay.size() - 1);
        int bonusCount2 = (int)bonusCount1;
        for (int i = 0; i < salaryOfDay.size(); i++) {   //循环遍历求元素总和
            //遍历集合取元素进行求和求今天总工资
            salary += salaryOfDay.get(i);
        }

        System.out.println("订单列表为：" + order);
        System.out.println("工资列表为：" + salaryOfDay);
        //System.out.println("         共"+(salaryOfDay.size() - 1)+"单   "+ bonusCount2 +"单提成。");
        System.out.println("         共"+(salaryOfDay.size() - 1)+"单   "+ bonusCount2 +"单提成。");
        System.out.println("工资为：" + (salary - salaryOfDay.get(salaryOfDay.size() - 1)) + "元");
    }

    public static ArrayList<Double> count(ArrayList<Integer> alParam){  //参数是大集合，返回小集合（工资）
        ArrayList<Double> temp = new ArrayList<>();

        //提成的订单数【超过40的订单，每单2.5元】
        double bonusCount = 0;
        for (int i = 0; i < alParam.size(); i++) {          //对大集合遍历
            if( alParam.get(i) > 0 && alParam.get(i) < 40.0){    //做判断，大于40的2.5r/单，小于40的1.5r/单
                temp.add(1.5);
            }else if(alParam.get(i) >= 40){
                temp.add(2.5);
                bonusCount++;                                //bonus作为大于40的订单的计数，放在集合末尾
            }else { }
        }
        temp.add(bonusCount);
        return temp;
    }
}