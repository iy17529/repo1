package com.rapjoee.day18.demo05streamexception;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:Demo01TryCatch
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 17:04
 * Description:
 *
 * 流的异常处理try catch方式：
 *      try {
 *          //可能出问题的代码
 *      } catch (异常类型 变量名) {
 *          //异常处理逻辑
 *      } finally {
 *          //资源释放
 *      }
 */
public class Demo01TryCatch {
    public static void main(String[] args) {

        //fw定义在try中，finally中的资源释放不在作用域内，所以这里提高其作用域
        FileWriter fw = null;
        try {
            //可能产生问题的代码
            fw = new FileWriter("D:\\JavaSETestDirectory01\\FileWriterTest1.txt");
            fw.write(78);
        } catch (IOException e) {
            //打印异常信息
            System.out.println(e);
        }finally {
            try {

                //NullPointerException，当上面的try中路径不正确时，fw为null，而null是不能调用方法的
                //这里做一个优化
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
