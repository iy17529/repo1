package com.rapjoee.day04.demo02;

/**
 * ClassName:Demo02Method
 *
 * @Author:baba
 * @Date:2020/1/9 13:04
 * Description:
 * <p>
 * 方法是若干功能语句的集合
 * 好比是一个工厂
 *      蒙牛工厂：
 *  原料：奶牛、饲料、水
 *  产物：牛奶制品
 *      钢铁工厂：
 *  原料：煤炭、铁矿石
 *  产物：钢铁建材
 *
 * 参数（原料）：进入方法的数据
 * 返回值（产物）：从方法中出来的数据
 *
 * 定义方法的完整格式：
 * 修饰符  返回值类型  方法名称(参数类型 参数名1,参数类型 参数名2,...){
 * 方法体
 * return 返回值}
 * return的两个作用：一是停止当前方法,二是将方法的返回值还给调用处
 *
 * 方法调用的三种方式：
 *      1、单独调用：
 *              方法名(参数);
 *      2、打印调用
 *              System.out.println(方法名(参数));
 *      3、赋值调用
 *              数据类型  变量名 = 方法名(参数);
 *
 *  注意！！：返回值类型为void的方法只能单独调用
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {

        //单独调用，无打印无赋值，仅让方法执行，产生的结果无法使用
        sum(20,45);

        //打印调用，产生的结果写到一个输出语句中，return的结果可以打印显示
                //这里的过程是，main入口看到sum方法，就在main外找到sum方法
                //把sum(20,45)的参数传递给sum方法
                //sum方法体执行
                //return 结束这个方法，带着返回值回到调用处
        System.out.println("===============");
        System.out.println(sum(14,100));

        //赋值调用，产生的结果赋值给其他变量
        System.out.println("===============");
        int v=sum(24,50);
        System.out.println("赋值结果为"+v);
    }

    public static int sum(int a,int b) {
        System.out.println("sum方法执行啦！");
        int result = a + b;
        return result;
    }
}
