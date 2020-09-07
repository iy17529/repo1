
package com.rapjoee.day01.demo01;


import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author Rapjoe
 */

public class HelloWorld {
    public static void main(String[] args){
        Scanner imput= new Scanner(System.in);
        //  Qian one = new Qian();
        Xingxi(imput);
    }
    //新建身份信息方法
    public static void Xingxi(Scanner a){

        String[] arr =  {"", "", ""};
        var arr1 = Stream.of(arr);


        System.out.println("认证身份信息");
        System.out.println("请输入名字：");
        String b = a.next();
        System.out.println("请输入身份证号：");
        String c = a.next();
        String ccc=a.next();
        System.out.println(ccc);
        boolean sex;
        while (true){
            System.out.println("请输入性别：(男or女)");
            String d =a.next();
            System.out.println(d);
            if(d.equals("男")){
                System.out.println("男");
                sex=false ;
                break;
            }else if(d.equals("女")){
                System.out.println("女");
                sex=true;
                break;
            }else{
                System.out.println("你输入的性别是肿么肥事啊？");
            }
        }
    }
}

