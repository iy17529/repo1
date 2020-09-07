package com.rapjoee.day06.demo02;

/**
 * ClassName:Student
 *
 * @Author:baba
 * @Date:2020/1/10 20:19
 * Description:
 *      定义一个类，用来模拟“手机”
 *      属性：品牌、价格、颜色
 *      行为：打电话、发短信
 */
public class Phone {

    //成员变量：品牌--Brand,价格--Price,颜色--Color
    String brand;
    int price;
    String color;

    //成员行为：打电话--call,发短信--send
    public void call(){
        System.out.println("打了一个电话");
    }

    public void send(String who1){
        System.out.println("给"+who1+"发了一条短信");
    }

}
