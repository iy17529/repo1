package com.rapjoee.day14.demo01;

/**
 * ClassName:Demo01Exception
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 19:53
 * Description:
 *
 * java.lang.Throwable类是Java语言中所有错误或者异常的超类
 *      Exception:编译期异常，进行编译（码代码时）程序出现的问题
 *                RuntimeException：运行期异常，Java程序运行过程中出现的问题【相当于是一个小感冒，处理掉，程序可以继续执行】
 *       Error：错误
 *                  相当于程序得了一个大毛病【绝症】，必须修改源代码才能继续执行
 *
 */
public class Demo01Exception {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 7};
        try {
            //在可能出现问题的地方try一下，这样后续的代码也可以执行
            System.out.println(arr[4]);         //java.lang.ArrayIndexOutOfBoundsException: 4
                                                //后续代码
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码");

        //OutOfMemoryError: Requested array size exceeds VM limit   错误，这种是虚拟机分配内存不够创建数组内存【内存泄漏】
        //int [] arr2 = new int[1024 * 1024 * 1024];                //必须修改代码，让创建数组的内存小一些
    }
}
