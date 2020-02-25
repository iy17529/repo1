package com.rapjoee.day01.demo02;

/**
 * ClassName:Daffodils
 *
 * @Author:baba
 * @Date:2020/2/2 15:43
 * Description:
 * 求出所有的水仙花数
 * <p>
 * 水仙花数：
 * 1. 一定是三位数
 * 2. 每一位的立方，加起来恰好是这个数本身  如：153 = 1*1*1 + 5*5*5 + 3*3*3
 */
public class Daffodils {
    public static void main(String[] args) {

        for (int num = 100,count = 0; num < 1000; num++) {
            int a = num / 100;          //取第一位数字
            int t = num % 100;
            int b = t / 10;             //取第二位数字
            int c = num % 10;           //取第三位数字
            if(num == a*a*a + b*b*b + c*c*c){
                System.out.println();
                count++;
                System.out.println("第"+count+"位水仙花数为：" + num + "  ---->  " + num +" = ["+a+"^3="+a*a*a+"]+["+b+
                        "^3="+b*b*b+"]+["+c+"^3="+c*c*c+"]");
            }
        }
    }
}
