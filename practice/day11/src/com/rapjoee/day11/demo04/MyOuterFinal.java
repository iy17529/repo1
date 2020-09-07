package com.rapjoee.day11.demo04;

/**
 * ClassName:MyOuter
 *
 * @Author:baba
 * @Date:2020/2/1 14:36
 * Description:
 */
public class MyOuterFinal {

    public void methodOuter() {

        int num = 29;       //成员方法内的局部变量
        class InnerFinal {
            public void methodInnerFinal(){
                System.out.println(num);        //局部内部类要想使用上面的局部变量，需要这个局部变量是【有效final的】意即只能赋值一次
            }
        }

        InnerFinal innerFinal = new InnerFinal();
        innerFinal.methodInnerFinal();
    }
}
