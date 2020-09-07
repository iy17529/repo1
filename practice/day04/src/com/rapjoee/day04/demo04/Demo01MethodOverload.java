package com.rapjoee.day04.demo04;

/**
 * ClassName:Demo01MethodOverload
 *
 * @Author:baba
 * @Date:2020/1/9 16:10
 * Description:
 * 学习重载
 */
public class Demo01MethodOverload {

    /*对于功能类似的方法，因为参数列表不一样，却需要记住太多的方法名（如sumTwo,sumThree,sumFour），太麻烦
     *
     * 方法的重载：多个方法的名称一样，但是参数列表不一样
     *
     * 方法重载与以下因素有关：
     * 1、参数个数不同
     * 2、参数类型不同
     * 3、多类型参数的顺序不同
     *
     * 与以下因素无关
     * 1、与参数的名称无关
     * 2、与方法的返回值类型无关
     * */

    public static void main(String[] args) {

/*     不使用重载：
        System.out.println(sumTwo(1,2));
        System.out.println(sumThree(1,2,3));
        System.out.println(sumFour(1,2,3,4));*/
        //使用重载：
        System.out.println("两个参数的方法执行："+sum(10,20));
        System.out.println("三个参数的方法执行："+sum(10,20,30));
        System.out.println("四个参数的方法执行："+sum(10,20,30,40));

    }

    /*    public static int sumTwo(int a,int b){
            return a+b;
        }

        public static int sumThree(int a,int b,int c){
            return a+b+c;
        }

        public static int sumFour(int a,int b,int c,int d){
            return a+b+c+d;
        }*/

    public static int sum(int a,double b){
        return (int) (a+b);
    }

    public  static int sum(double a,int b){//多类型参数顺序不同可以
        return (int) (a+b);
    }

   /* public  static  int sum(int x,int y){//参数名称不同不可以
        return x + y;
    }*/



    public static int sum(double a,double b){//参数类型不同可以
        return (int) (a+b);
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {//参数个数不同可以
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
