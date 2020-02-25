package com.rapjoee.day10.demo03practice;

/**
 * ClassName:USBInterface
 *
 * @Author:baba
 * @Date:2020/1/29 16:37
 * Description:
 *
 * usb接口
 * 包含打开设备、关闭设备功能
 */
public interface USBInterface {

    public abstract void openDevice();
    public abstract void closeDevice();

}
