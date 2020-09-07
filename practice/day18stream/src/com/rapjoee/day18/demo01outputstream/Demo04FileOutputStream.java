package com.rapjoee.day18.demo01outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName:Demo04FileOutputStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 16:50
 * Description:
 *
 * 之前的都是创建了新文件覆盖了源文件，这里如果我们要追加写入/续写，需要下面的构造方法
 *      FileOutputStream(File file, boolean append)  创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *      FileOutputStream(String name, boolean append)  创建一个向具有指定 name 的文件中写入数据的输出文件流。
 *
 *      参数：
 *          File file/String name，还是目标文件
 *          boolean append：这个是续写开关，true则不会创建新文件覆盖源文件，直接在文件数据后面追加数据
 *                                        false则会覆盖源文件
 *
 *    回车换行怎么写？
 *    windows：\r\n
 *    Linux：\n
 *    mac：\r
 *
 */
public class Demo04FileOutputStream {
    public static void main(String[] args) throws IOException {

        //创建
        FileOutputStream fos = new FileOutputStream("a.txt", true);

        //write()方法
        byte[] bytes = "你好".getBytes();
        for (int i = 0; i < 10; i++) {
            fos.write(bytes);
            fos.write("\r\n".getBytes());
        }

        //释放资源
        fos.close();
    }
}
