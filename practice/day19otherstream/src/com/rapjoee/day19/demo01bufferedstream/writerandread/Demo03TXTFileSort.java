package com.rapjoee.day19.demo01bufferedstream.writerandread;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Demo03TXTFileSort
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/21 16:29
 * Description:
 *  恢复文件的内容顺序
 *      D:\JavaSETestDirectory01\出师表乱序.txt  内容是乱序的【一行一段】
 *      把它的内容回复顺序，并且弄到 D:\JavaSETestDirectory01\出师表正序.txt 中
 *
 *  思路：    Map集合可以对存入其中的键值对按照键的顺序进行排序，我们把文本内容按照段首的数字为Key、其余内容为Value进行分隔
 *          1. 创建一个HashMap集合对象，Key：存储段首序号【1,2,3,...】 Value：存储每段的文本
 *          2. 创建字符缓冲流输入流对象，构造器中绑定字符输入流
 *          3. 创建字符缓冲流输出流对象，构造器中绑定字符输出流
 *          4. 使用字符缓冲输入流reaLine()方法进行逐行读取文本内容
 *          5. 对读取的文本进行切割，获取行中的序号与文本内容
 *          6. 把切割好的序号与文本的内容存储到Map集合中【Key有序，会自动排序】
 *          7. 遍历Map集合，获取内一个键值对
 *          8. 把每一个键值对拼接为一个文本行
 *          9. 把拼接好的文本，使用字符缓冲输出流的write方法，写入到文本中
 *          10. 释放资源
 *
 */
public class Demo03TXTFileSort {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hashMap = new HashMap<>();

        //创建一个字符缓冲流输出流对象，构造器绑定要读取的源文件
        BufferedReader br =
                new BufferedReader(new FileReader("D:\\JavaSETestDirectory01\\出师表乱序.txt"));
        //创建一个字符缓冲流输入流对象，构造器绑定要写入的目的文件
        BufferedWriter bw =
                new BufferedWriter(new FileWriter("D:\\JavaSETestDirectory01\\出师表正序.txt"));

        //取出所有的文本行，分隔后序号放在键中，序号后面的文本放在值中
        String s;
        while ((s = br.readLine()) != null) {
            String[] split = s.split("\\.");;//通过 . 进行分隔
            hashMap.put(split[0], split[1]);
        }

        //遍历Map集合取出所有键值对对象，存储在一个集合中，再遍历集合，取出所有的键与值
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        //获取Map集合键值对对象的集合的迭代器
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();

        System.out.println("段落如下：");
        while (it.hasNext()) {
            Map.Entry<String, String> keyAndValue = it.next();
            String key = keyAndValue.getKey();
            String value = keyAndValue.getValue();
            System.out.println(key + "." + value);
            //把键值对对象集合中的键与值拼接在一起成为一个字符串
            String txt = key + "." + value;

            //拼接好的字符串存入硬盘的文件中
            bw.write(txt);
            bw.newLine();//读取的时候readLine不是读取到换行符【因为换行符作为结束的标记】这里换行
        }

        //释放资源
        br.close();
        bw.close();
    }
}
