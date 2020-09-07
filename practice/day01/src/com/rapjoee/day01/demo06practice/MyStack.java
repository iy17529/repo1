package com.rapjoee.day01.demo06practice;

/**
 * ClassName:Stack
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/17 16:06
 * Description:
 */
public class MyStack<E> {

    private int count;//栈元素个数
    private final int initLength = 10;//数组初始容量
    private Object[] array;//初始化一个数组
    private final double GROW_LEVEL = 1.5;//扩容倍数
    private int capacity;//容量

    public MyStack() {
        this.capacity = initLength;
        this.array = new Object[capacity];
        this.count = 0;
    }

    public MyStack(int initCapacity) {//带参构造传递容量值
        if (initCapacity < 2) {
            throw new IllegalArgumentException("集合长度至少为2！！");
        }
        this.capacity = initCapacity;
        this.array = new Object[capacity];
        this.count = 0;
    }

    protected E pop() {//从此列表所表示的堆栈处弹出一个元素

        if (isEmpty()) {
            //System.out.println("没有元素了！！");
            throw new ArrayIndexOutOfBoundsException("Stack is Empty!!");
        } else {
            E oldValue = (E) array[count - 1];

            array[count - 1] = null;//最后一个元素指向null【没有指向等待回收】
            count--;
            return oldValue;
        }
        //return null;
    }

    protected void push(E element) {//将元素推入此列表所表示的堆栈

        /*if((array[array.length - 1])!=null) {    //最后一个元素不是null，没有位置，扩容。给数组复制一份，添加元素

            Object[] newArray = new Object[array.length + (array.length/2)];
            newArray[array.length] = element;
            array = newArray;

        } else {            //否则，最后一个元素为null，还有位置，直接遍历数组，在第一个不为null的位置添加新元素
            array[count] = element;
        }*/
        if (count >= capacity ) {
            capacity = (int) (capacity * GROW_LEVEL);
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, this.array.length);
            newArray[count] = element;
            array = newArray;
        } else {
            array[count] = element;
        }

        count++;
    }

    protected E peek() {//返回栈顶元素不出栈（即获取元素）
        Object getElement = array[count - 1];
        return (E)getElement;
    }

    protected boolean isEmpty() {//判断列表是否为空
        return array[0] == null;
    }

    protected int size() {//获取列表的长度【元素个数】
        return count;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder("[");

        if(isEmpty()) {
            temp.append("]");
        } else {
            for (int i = 0; i < count - 1; i++) {
                temp.append(array[i]).append(", ");
            }
            temp.append(array[count - 1]).append("]");
        }
        return temp.toString();
    }
}
