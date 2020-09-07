package com.rapjoee.day23.demo06thismethodreference;

/**
 * ClassName:Husband
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 17:54
 * Description:
 *
 * 学习使用this关键字引用本类的方法
 */
public class Husband {

    public void buyHouse() {
        //有钱，定义一个买房子的方法
        System.out.println("上海二环卖一套房");
    }
    //定义一个结婚的方法，参数传递Rich接口
    public void marry(Rich r) {
        r.buyEverything();
    }

    //定义一个开心的方法
    public void  VeryHappy() {
        //方法调用marry方法
                //函数式接口，使用Lambda表达式传递
        marry(() -> {
            //使用this关键字进行引用
            this.buyHouse();
        });

        System.out.println("============================");
        //以上代码可以使用方法引用进行优化
        marry(this::buyHouse);
    }


    public static void main(String[] args) {
        new Husband().VeryHappy();
    }
}
