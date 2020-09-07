package com.rapjoee.day18.demo06properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName:Demo02StoreAndLoad
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/20 18:04
 * Description:
 *
 * 学习store方法与load方法
 *
 *      把集合中临时数据，持久化把硬盘中
 *          void store(OutputStream out, String comments)
 *                  以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
 *          void store(Writer writer, String comments)
 *                  以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
 *
 *             参数：OutputStream out：字节输出流，不能包含中文
 *                  riter writer：    字符输出流，。可以包含中文
 *                  String comments： 注释，用来解释说明保存的文件，不可使用中文【默认Unicode】，一般使用""空字符串
 *
 *              使用步骤：
 *              1. 创建Properties集合，添加数据
 *              2. 创建OutputStream/Writer对象，，构造器绑定要输出的目的地
 *              3. 使用Properties集合的方法store，把集合中的临时数据，持久化到硬盘中存储
 *              4. 释放资源
 *
 */
public class Demo02Store {
    public static void main(String[] args) {
        //1. 创建Properties集合，添加数据
        Properties pp = new Properties();
        pp.setProperty("吐槽星人", "111111");
        pp.setProperty("汪星人", "999999");
        pp.setProperty("喵星人", "666666");
        pp.setProperty("巴尔塔星人", "222222");
        pp.setProperty("哈哈星人", "999999");

        try (
            //2. 创建OutputStream/Writer对象，，构造器绑定要输出的目的地【字符流可以写中文】
            FileWriter fw = new FileWriter("D:\\JavaSETestDirectory01\\FileWriterTest.txt", true);
        ) {
            //3. 使用Properties集合的方法store，把集合中的临时数据，持久化到硬盘中存储
            pp.store(fw, "Properties");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
