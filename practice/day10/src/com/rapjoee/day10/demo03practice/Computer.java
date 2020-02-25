package com.rapjoee.day10.demo03practice;

/**
 * ClassName:Computer
 *
 * @Author:baba
 * @Date:2020/1/29 16:40
 * Description:
 */
public class Computer {

    public void turnOn(){
        System.out.println("电脑开机！！"+"\n");
    }

    public void shutDown(){
        System.out.println("电脑关机！！");
    }

    //使用usb接口的方法，接口作为参数
    public void useDevice(USBInterface usb){
        usb.openDevice();       //打开设备

        if(usb instanceof Mouse){           //先判断。看你是个啥，分门别类区别对待
            Mouse mouseDevice = (Mouse) usb;        //向下转型
            mouseDevice.click();
        }
        if(usb instanceof KeyBoard){
            KeyBoard keyBoardDevice = (KeyBoard) usb;
            keyBoardDevice.knock();
        }

        usb.closeDevice();       //关闭设备
    }
}
