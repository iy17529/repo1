package com.rapjoee.day17.demo01FileMethod;

import java.io.File;

/**
 * ClassName:Demo01File
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 10:30
 * Description:
 *
 * java.io.File类是文件和目录【文件夹】路径名的抽象表示形式
 *      我们可以使用File类中的方法对PC内的文件/文件夹进行操作：
 *      创建文件/文件夹
 *      获取文件/文件夹
 *      判断文件/文件夹是否存在
 *      对文件夹进行遍历
 *      获取文件的大小
 *   file：文件
 *   directory:目录/文件夹
 *   path：路径
 */
public class Demo01File {
    public static void main(String[] args) {
/*
File类中的四个静态方法：
            static String pathSeparator
                      与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char pathSeparatorChar
                      与系统有关的路径分隔符。
            static String separator
                      与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char separatorChar
                       与系统有关的默认名称分隔符。

 */
        //  ; 路径分隔符，如windows环境变量配置中的路径之间分隔用  ;
        System.out.println("pathSeparator:  " + File.pathSeparator);
        System.out.println("pathSeparatorChar:  " + File.pathSeparatorChar);    //  ;  同上

        //  \ 文件分隔符，如  C:\Users\Rapjoe\Desktop\jdk6API
        System.out.println("separator:  " + File.separator);
        System.out.println("separatorChar:  " + File.separatorChar);            //  \

                /*路径分隔符：
                        windows： 是分号 ;
                        Linux:  是冒号 :
                 */
                /*文件分隔符：
                        windows：是反斜杠 \
                        Linux:  是正斜杠 /
                 */
        //Windows下的路径分隔符与文件分隔符不一样，所以写文件路径时不能写死了
            //    windows:      "C:\Users\Rapjoe"
            //    Linux:      "C:/Users/Rapjoe"
            //    不能写死:      "C:"+File.separator+"Users"+File.separator+"Rapjoe"

    }
}
