package com.rapjoee.day05.demo02;

/**
 * ClassName:Demo04ArrayFanZhuan
 *
 * @Author:baba
 * @Date:2020/1/9 20:32
 * Description:
 * 数组反转
 *      数组可以作为方法的参数
 *      当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
 */
public class Demo01ArrayFanZhuan {
    public static void main(String[] args) {
        int[] a = new int[]{10, 15, 6, 100, 89};

        bianLi(a);

        System.out.println("==================");

        for (int min = 0, max = a.length - 1; min < max; max--, min++) {
            int temp = a[max];
            a[max] = a[min];
            a[min] = temp;
        }
        bianLi(a);
    }

    public static void bianLi(int[] a) {     //把循环封装为bianLi()方法
        /*
         * 三要素：
         * 返回值：无需返回值
         * 方法名：BianLi即可
         * 参数列表：给他数组a，才能打印
         * */
        for (int i = 0; i < a.length; i++) {
            System.out.println("反转后的元素为：" + a[i]);
        }
        //System.out.println(Arrays.toString(a));     //Array类的Arrays.toString()方法打印数组
    }
}
