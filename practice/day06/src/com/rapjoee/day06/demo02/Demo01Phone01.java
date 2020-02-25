package com.rapjoee.day06.demo02;

/**
 * ClassName:Demo01Phone01
 *
 * @Author:baba
 * @Date:2020/1/10 20:31
 * Description:
 */
public class Demo01Phone01 {
    public static void main(String[] args) {

        Phone ph1 = new Phone();
        ph1.brand = "小米9";
        ph1.color = "深空灰";
        ph1.price = 3399;
        System.out.println("颜色为" + ph1.color + "的" + ph1.brand);
        ph1.call();
        ph1.send("张子枫");
        System.out.println("============================");


        Phone ph2 = new Phone();
        ph2.price = 2799;
        ph2.color = "远山白";
        ph2.brand = "魅族16s";
        System.out.println("颜色为" + ph2.color + "的" + ph2.brand);
        ph2.call();
        ph2.send("小黄");
    }
}
