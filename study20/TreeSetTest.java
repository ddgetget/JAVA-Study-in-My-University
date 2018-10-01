package org.gaozou.book.javaabc.examples.ch20;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author TuringEmmy
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<People> people = new TreeSet<People>();    //创建一个排序的集合
        People people1 = new People("张三", "0001");    //创建，并初始化Student对象
        People people2 = new People("李四", "0002");
        People people3 = new People("王五", "0003");
        People people4 = new People("赵六", "0004");
        People people5 = new People("钱七", "0005");
        People people6 = new People("赵刚", "0006");
        people.add(people1);                //将元素s1添加到集合
        people.add(people2);
        people.add(people3);
        people.add(people4);
        people.add(people5);
        people.add(people6);
        System.out.print(people);        //输出集合元素
    }

    public static void print(Collection c) {
        Iterator it = c.iterator();            //返回集合迭代器
        while (it.hasNext()) {            //遍历迭代器
            Object o = it.next();
            System.out.println(o);    //输出元素
        }
    }
}

class People implements Comparable {
    String name;                        //声明字符串类型域name
    String id;                            //声明字符串类型域id
    //声明Student对象构造方法

    public People(String name, String id) {
        this.name = name;                //初始化成员对象name
        this.id = id;                    //初始化成员变量id
    }
    //将对象信息转化为字符串信息

    public String toString() {
        return name + "|" + id;            //返回信息
    }
    //实现compareTo接口，比较id的大小

    public int compareTo(Object o) {
        People ts = (People) o;                //创建People局部变量
        return id.compareTo(ts.id);            //返回compareTo运算结果
    }
}
