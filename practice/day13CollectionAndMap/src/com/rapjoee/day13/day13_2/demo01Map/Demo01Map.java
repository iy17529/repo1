package com.rapjoee.day13.day13_2.demo01Map;

/**
 * ClassName:Demo01Map
 *
 * @Author:baba
 * @Date:2020/2/8 16:58
 * Description:
 *学习Map【java.util.Map<K,V>接口】集合
 *
 * Map集合的特点：
 *          1. Map集合是一个双列集合，一个元素包含两个值【一个键Key，一个值Value】
 *          2. Map集合中的元素是成对存在的，且Key与Value一一对应
 *          3. Map集合中的元素Key和Value的数据类型可以相同，也可以不同
 *          4. Map集合中的元素，Key之间不允许重复，而Value之间可以重复
 *
 *     java.util.HashMap<K,V>集合  implements Map接口
 *          HashMap<K,V>的特点：
 *              1. HashMap<K,V>集合底层是哈希表【数组+单向链表/红黑树（JDK1.8之后）】：查询速度很快、、、、哈希结构
 *              2. HashMap<K,V>的元素无序，存储顺序与拿取顺序不一致
 *              3. 哈希结构保证了键的唯一【package com.rapjoee.day13.day02.demo04Set】
 *     java.util.LinkedHashMap<K,V> 继承  HashMap<K,V>集合
 *          LinkedHashMap<K,V>的特点：
 *              1. LinkedHashMap<K,V>集合底层是哈希表+链表（记录元素的顺序）
 *              2. LinkedHashMap<K,V>是一个有序的集合，链表保证了迭代的顺序
 *              3. 哈希结构保证了键的唯一、链表结构保证了存取顺序一致
 *
 *      注意：由于要保证键的唯一、不重复，所以要重写键的hashCode()方法equals()方法
 *
 *
 */
public class Demo01Map {
}
