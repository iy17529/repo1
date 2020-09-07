package com.rapjoee.day01.demo02;

/**
 * ClassName:ArithmeticProblem
 *
 * @Author:baba
 * @Date:2020/2/2 16:05
 * Description:
 */
public class ArithmeticProblem {

    public static void main(String[] args) {
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 6; b++) {
                for (int c = 0; c < 14; c++) {
                    for (int d = 0; d < 10; d++) {
                        if((a+b==8&(6==c-d)&(a+c==14)&(b+d==10))){
                            System.out.println("[a, b, c, d]为："+"["+a+", "+b+", "+c+", "+d+"]");
                        }
                    }
                }
            }
        }
    }
}
