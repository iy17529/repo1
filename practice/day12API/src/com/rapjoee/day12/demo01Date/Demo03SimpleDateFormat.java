package com.rapjoee.day12.demo01Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:Demo03SimpleDateFormat
 *
 * @Author:baba
 * @Date:2020/2/5 12:57
 * Description:
 * 对于能够把标准时间格式化为想要的模式的类是DateFormat类【此为抽象类】
 * 我们用到的是它的子类SimpleDateFormat，允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）
 *
 *      SimpleDateFormat的构造方法
 *          SimpleDateFormat(String pattern)     用给定的模式与默认语言环境的日期格式化  参数为传递指定的模式
 *                  模式:区分大小学
 *                  y   年
 *                  M   月
 *                  d   日/天
 *                  H   时
 *                  m   分
 *                  s   秒
 *
 *      格式化：SimpleDateFormat的format(Date date)方法  [日期 -> 文本]
 *              步骤：  1. 创建SimpleDateFormat对象，构造方法的参数为指定的模式，如"yyyy-MM-dd HH:mm:ss"
 *                     2. 使用对象的format(Date date)方法，把传递进来的date对象按照模式格式化为符合模式的文本【字符串】
 *      解析：SimpleDateFormat的parse()方法  [文本 -> 日期]
 *              步骤：  1. 创建SimpleDateFormat对象，构造方法的参数为指定的模式，如"yyyy-MM-dd HH:mm:ss"
 *                     2. 使用对象的parse(String source)方法，把传递进来的字符串按照指定的模式解析为标准化时间【日期】
 *                     注意：此处如果传入的字符串参数与模式不符会有异常抛出，调用一个抛出异常的方法，就必须处理这里异常
 *                     要么throws继续抛出，要么try catch自己处理
 */
public class Demo03SimpleDateFormat {
    public static void main(String[] args) throws ParseException {      //声明这个异常，交给虚拟机处理
        demo01Format();
        demo02Parse();
    }

    private static void demo02Parse() throws ParseException {             //解析方法  [文本 -> 日期]
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");      //带参构造传递模式
        String today = "2020年02月04日 13时28分54秒";             //模式正确
        String today2 = "2020-02-04 13:28:54";                  //模式不符，会抛出异常

        System.out.println("时间为：" + today);
        //调用parse()方法，参数为字符串 返回一个Date 【注意！！】此处如果传入的参数与模式不符会有异常抛出
        Date dateToday = sdf2.parse(today);
        System.out.println("解析后的日期为：" + dateToday);
    }

    private static void demo01Format() {            //格式化方法
        //创建sdf对象，模式为"yyyy-MM-dd HH-mm-ss"
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //Date类空参构造，获取系统当前时间
        Date date1 = new Date();
        System.out.println("系统当前标准化时间为：" + date1);
        String format1 = sdf1.format(date1);//格式化为yyyy-MM-dd HH-mm-ss形式
        System.out.println("格式化为为：" + format1);
    }
}
