package com.rapjoee.day18.demo05streamexception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName:Demo02JDk7
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 17:19
 * Description:
 * 对于流对象异常处理，JDK7新增加一个特性：
 *      在try后添加一个()，在()中可以定义流对象，对象的作用域是整个try{}大括号中
 *      且会在大括号结束自动释放资源，无需我们close自己释放，不必写finally
 *
 *      格式：try (定义流对象...) {
 *          //可能出现问题的代码
 *      } catch () {
 *          //异常处理逻辑
 *      }
 *
 */
public class Demo02JDk7 {
    public static void main(String[] args) {//做文件的复制

        try (
                //创建源文件对象
                FileInputStream fis = new FileInputStream("D:\\JavaSETestDirectory01\\a\\test.jpg");
                //创建目标文件对象
                FileOutputStream fos = new FileOutputStream("D:\\JavaSETestDirectory01\\a\\copy1.jpg");) {

            //可能出现问题的代码
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
