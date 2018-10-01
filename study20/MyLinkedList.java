package org.gaozou.book.javaabc.examples.ch20;


/**
 * @author TuringEmmy
 *
 */
public class MyLinkedList {
    public static void main(String[] args) {
        ImpQueue myQueue = new LinkedList(); // 实例化队列Queue对象
        myQueue.inQueue("\tThankyou");         // 添加元素入队
        myQueue.inQueue("\tThanks");         // 添加元素入队
        System.out.println("Queue队列中元素出队情况：");
        while (!myQueue.isEmpty()) {         // 循环判断队列是否为空
            System.out.println(myQueue.outQueue());    // 不为空则输出队列中的元素
        }
        ImpStack myStack = new LinkedList();// 实例化Stack栈对象
        System.out.println("\nStack栈中元素出栈情况：");
        myStack.push("\tabcdefg");             // 添加元素入栈
        myStack.push("\tgfedcba");             // 添加元素入栈
        while (!myStack.isEmpty()) {         // 循环判断栈是否为空
            System.out.println(myStack.pop());// 不为空则输出出栈元素
        }
    }
}

abstract class AbsMyList {
    protected int len = 0;         // 长度

    protected AbsMyList() {     // 默认构造方法
    }

    abstract public boolean add(Object o);         // 抽象向链表末尾添加一个元素

    abstract public Object getElement(int index);     // 获得指定元素

    abstract public boolean isElement(Object o);     // 判断是否包含元素

    abstract int indexOf(Object o);             // 判断元素的位置

    abstract public boolean deleteElement(Object o);// 移除元素

    abstract public void clear();                 // 清空

    public int len() {                         // 获得长度大小
        return this.len;
    }

    public boolean isEmpty() {     // 判断是否为空
        return this.len == 0;
    }
}

interface ImpQueue {             // 队列接口

    void inQueue(String o);     // 入队

    Object outQueue();         // 出队

    boolean isEmpty();        // 判断是否为空
}

interface ImpStack {             // 栈接口

    void push(Object o);         // 元素入栈

    Object pop();             // 元素出栈

    boolean isEmpty();         // 是否为空
}

class LinkedList extends AbsMyList implements ImpQueue, ImpStack {
    private static class InnerMyEntry {     // 静态内部类
        Object object;             // 对象
        InnerMyEntry next;         // 下一个对象
        InnerMyEntry previous;     // 上一个对象
        // 带参数的构造方法进行初始化

        InnerMyEntry(Object object, InnerMyEntry next, InnerMyEntry previous) {
            this.object = object;
            this.next = next;
            this.previous = previous;
        }
    }

    private InnerMyEntry header = new InnerMyEntry(null, null, null);// 创建实体对象

    public LinkedList() {                     // 默认构造方法进行初始化
        this.header.next = this.header.previous = this.header;
    }

    private InnerMyEntry addBefore(Object o, InnerMyEntry e) {     // 添加对象之前的操作方法
        InnerMyEntry newEntry = new InnerMyEntry(o, e, e.previous);    // 创建实体对象
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        this.len++;
        return newEntry;
    }

    public boolean add(Object o) {             // 添加对象
        this.addBefore(o, header);
        return true;
    }

    public void clear() {                     // 清空对象
        InnerMyEntry e = this.header.next;
        while (e != this.header) {             // 判断进行循环
            InnerMyEntry next = e.next;
            e.next = e.previous = null;     // 清空对象
            e.object = null;                 // 清空对象
            e = next;
        }
        this.header.next = this.header.previous = this.header;
        this.len = 0;
    }

    public boolean isElement(Object o) {     // 是否包含对象
        return this.indexOf(o) != -1;
    }

    public Object getElement(int index) {     // 获得指定的对象
        InnerMyEntry myEntry = this.entry(index);
        if (myEntry == null)
            return null;
        return myEntry.object;
    }

    public int indexOf(Object o) {             // 获得对象在栈或队列中的位置
        int index = 0;
        if (o == null) {
            for (InnerMyEntry e = this.header.next; e != this.header; e = e.next) {
                // 循环获得元素对象
                if (e.object == null)
                    return index;
                index++;
            }
        } else {
            for (InnerMyEntry e = this.header.next; e != this.header; e = e.next) {
                // 循环获得元素对象
                if (o.equals(e.object))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean deleteElement(Object o) {         // 移除对象
        if (o == null) {
            // 循环获元素对象
            for (InnerMyEntry e = header.next; e != header; e = e.next) {
                if (e.object == null) {
                    return this.deleteElement(e);     // 移除对象
                }
            }
        } else {
            for (InnerMyEntry e = header.next; e != header; e = e.next) {    // 循环获元素对象
                if (o.equals(e.object)) {
                    return this.deleteElement(e);     // 移除对象
                }
            }
        }
        return false;
    }

    public Object outQueue() {                 // 出队方法
        Object result = this.header.next.object; // 获得对象
        this.deleteElement(this.header.next);     // 移除对象
        return result;
    }

    public void inQueue(String o) {         // 入队方法
        this.addBefore(o, header);             // 调方法添加对象
    }

    public Object pop() {                         // 出栈方法
        Object result = this.header.previous.object;// 获得对象
        this.deleteElement(this.header.previous);     // 移除对象
        return result;
    }

    public void push(Object o) {         // 入栈
        this.addBefore(o, header);     // 调方法添加对象
    }

    private boolean deleteElement(InnerMyEntry e) { // 移除对象
        if (e == header) {
            return false;
        }
        e.previous.next = e.next;                     // 重新赋值
        e.next.previous = e.previous;                 // 重新赋值
        e.next = e.previous = null;                 // 清空
        e.object = null;
        this.len--;
        return true;
    }

    private InnerMyEntry entry(int index) {         // 获得指定的对象
        if (index < 0 || index >= this.len) {         // 判断指定元素的下标
            return null;
        }
        InnerMyEntry e = header;
        if (index < (this.len >> 1)) {                 // 判断循环获得指定的实体
            for (int i = 0; i <= index; i++)
                e = e.next;
        } else {
            for (int i = this.len; i > index; i--)
                e = e.previous;
        }
        return e;
    }
}
