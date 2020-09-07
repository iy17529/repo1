package com.rapjoee.day10.demo01;

/**
 * ClassName:MyInterfaceDefault
 *
 * @Author:baba
 * @Date:2020/1/26 15:33
 * Description:
 * 从Java 8 开始，接口可以定义默认方法，以期解决接口升级的问题
 * 默认方法格式：public default 返回值类型 方法名(参数){
 *         //方法体
 *      }
 *  1.接口的默认方法，可以通过接口实现类对象直接调用
 *  2.接口的默认方法也可以被接口实现类进行覆盖重写
 */
public interface MyInterfaceDefault {

    public abstract void methodAbs();      //抽象方法


    //public abstract void methodAbs2 ();       这里如果升级接口再定义抽象类会迫使两个实现类都改变【覆盖重写所有抽象类】，所以从Java8开始。，可以定义默认方法  格式：
    // public default 返回值类型 方法名(参数){
        //方法体}
    //升级接口，定义一个默认方法
    public default  void methodDefault(){
        System.out.println("这是新定义的默认方法！！");
    }

}
