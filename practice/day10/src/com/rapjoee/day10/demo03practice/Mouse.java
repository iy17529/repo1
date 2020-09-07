package com.rapjoee.day10.demo03practice;

/**
 * ClassName:Mouse
 *
 * @Author:baba
 * @Date:2020/1/29 18:28
 * Description:
 */
public class Mouse implements USBInterface{
    @Override
    public void openDevice() {
        System.out.println("鼠标已插入，可以工作");
    }

    @Override
    public void closeDevice() {
        System.out.println("鼠标已拔出，停止工作"+"\n");
    }

    public void click(){
        System.out.println("鼠标点击");
    }


}
