package com.rapjoee.day06.demo02;

/**
 * ClassName:Demo02PhoneParamAndReturn
 *
 * @Author:baba
 * @Date:2020/1/11 9:50
 * Description:
 * 使用自定义的类Phone分别作为参数类型和返回值类型
 * 传递的都是对象的地址值
 */
public class Demo02PhoneParamAndReturn {

    public static void main(String[] args) {

        //在main方法中创建对象ph1
        Phone ph1 = new Phone();
        ph1.color = "玫瑰金";
        ph1.brand = "iphone6";
        ph1.price = 6399;
        phoneParam(ph1);//Phone类型的对象ph1作为参数传递给方法phoneParam，传递的是对象ph1的地址值，传递给方法中的phoneParam


        //在main方法中接收返回值（对象）
        Phone resultPh2 = phoneReturn();     //Phone类型接收打印
        System.out.println("品牌为" + resultPh2.brand + "的手机的价格为：" + resultPh2.price + ",颜色为：" + resultPh2.color + "。");
    }

    //使用类Phone作为参数
    /*三要素：
     *方法名：phoneParam
     * 返回值：无返回值
     * 参数：类型为Phone，参数名自定义为phoneParam
     * */
    public static void phoneParam(Phone phoneParam) {
        System.out.println("品牌为" + phoneParam.brand + "的手机的价格为：" + phoneParam.price + ",颜色为：" + phoneParam.color + "。");
    }

    public static Phone phoneReturn() {
        //使用Phone类作为返回值类型
        /*
         * 三要素：
         *   方法名：phoneReturn
         *   参数：无需参数
         *   返回值：类型为Phone，值为对象
         * */

        //在此方法中创建一个对象，作为返回值
        Phone ph2 = new Phone();
        ph2.color = "全息幻彩蓝";
        ph2.price = 3499;
        ph2.brand = "小米9";

        return ph2;     //谁调用ph2，就把ph2的地址值给谁
    }

}
