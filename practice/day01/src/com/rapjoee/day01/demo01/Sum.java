package com.rapjoee.day01.demo01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName:Sun
 *
 * @Author:baba
 * @Date:2020/1/18 16:03
 * Description:
 * 需求：对本周的工资进行求和打印
 */
public class Sum {
    public static void main(String[] args) {
        ArrayList<Double> totalSalaryList = new ArrayList<>();              //存储本周总工资
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入周一工资：");
        totalSalaryList.add(sc.nextDouble());
        System.out.print("请输入周二工资：");
        totalSalaryList.add(sc.nextDouble());
        System.out.print("请输入周三工资：");
        totalSalaryList.add(sc.nextDouble());
        System.out.print("请输入周四工资：");
        totalSalaryList.add(sc.nextDouble());
        System.out.print("请输入周五工资：");
        totalSalaryList.add(sc.nextDouble());
        System.out.print("请输入周六工资：");
        totalSalaryList.add(sc.nextDouble());
        System.out.print("请输入周日工资：");
        totalSalaryList.add(sc.nextDouble());

        //本周工资汇总
        double totalSalary = sum(totalSalaryList);
        System.out.println("    本周工资为：" + totalSalary + "元");
    }

    public static double sum(ArrayList<Double> alParam){                //遍历集合元素，求工资总和
        double sum = 0;
        System.out.println();
        System.out.println("本周工资列表为：" + alParam);
        for (int i = 0; i < alParam.size(); i++) {
            sum+=alParam.get(i);
        }
        return sum;
    }
}
