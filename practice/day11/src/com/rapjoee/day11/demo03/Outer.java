package com.rapjoee.day11.demo03;

/**
 * ClassName:Outer
 *
 * @Author:baba
 * @Date:2020/2/1 13:44
 * Description:
 */
public class Outer {

    public String str1 = "外部类重名成员变量";     //外部类成员变量

    public class Inner{

        String str1 = "内部类重名成员变量";        //内部成员变量
        public void methodInner(){
            String str1 = "内部类重名局部变量";        //内部局部变量
            System.out.println(str1);           //访问内部类成员变量
            System.out.println(this.str1);      //访问内部类成员
            System.out.println(Outer.this.str1);           //外部类成员变量str1作用于整个大括号，可以访问
        }
    }
}
