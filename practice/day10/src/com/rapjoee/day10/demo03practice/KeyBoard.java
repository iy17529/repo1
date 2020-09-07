package com.rapjoee.day10.demo03practice;

/**
 * ClassName:KeyBoard
 *
 * @Author:baba
 * @Date:2020/1/29 18:28
 * Description:
 */
public class KeyBoard  implements USBInterface{


    @Override
    public void openDevice() {
        System.out.println("键盘已插入，可以工作");
    }

    @Override
    public void closeDevice() {
        System.out.println("键盘已拔出，停止工作"+"\n");
    }

    public void knock(){
        System.out.println("键盘敲击");
    }
}
