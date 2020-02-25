package com.rapjoee.day10.demo03practice;

/**
 * ClassName:Demo01Computer
 *
 * @Author:baba
 * @Date:2020/1/29 18:40
 * Description:
 */
public class Demo01Computer {
    public static void main(String[] args) {

        //创建一个电脑
        Computer computer = new Computer();
        computer.turnOn();

        //the first method  先向上转型，再传参
        //准备一个鼠标，供使用
        USBInterface usb = new Mouse();     //向上转型
        computer.useDevice(usb);            //直接传入参数usb

        //the second method  先传参，自动向上转型为接口类型
        //准备一个键盘，供使用
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(keyBoard);           //这里需要理解一下，也是向上转型，类似于double参数的方法传入int数据也可以，数据自动类型转换

        //the third method  匿名对象传参
        computer.useDevice(new KeyBoard());
        computer.shutDown();

        method(12.6);       //正确double-->double
        method(34);         //正确，int-->double，int 向double自动类型转换

    }
    public static void  method(double num){}
}
