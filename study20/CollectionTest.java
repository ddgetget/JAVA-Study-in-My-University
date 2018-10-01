package org.gaozou.book.javaabc.examples.ch20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author TuringEmmy
 *
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collstr = new ArrayList<String>();
        //创建一个元素位String类型的列表
        collstr.add("张三");        //为列表添加元素
        collstr.add("李四");
        collstr.add("王五");
        collstr.add("赵六");
        System.out.println(collstr);    //输出类表的元素内容
        Object[] arrayo = collstr.toArray();    //将列表转换位数组
        Collection<String> coll = new ArrayList<String>();
        //创建一个元素位字符串类型的列表
        coll.add("赵刚");    //为列表添加元素
        coll.add("莉莉");
        coll.addAll(collstr);
        System.out.println(coll);//输出第二个集合中的元素内容
        System.out.println("coll.contains(\"赵刚\") = " + coll.contains("赵刚"));
        //查看列表是否包含"赵刚"
        System.out.println("coll.contains(collstr) = " + coll.containsAll(collstr));
        //判断第二个集合是否包含有第一个集合中的元素
        coll.retainAll(collstr);//从第二个集合中删除第一个集合中不包含的元素
        System.out.println("从第二个集合中删除第一个集合中不包含的元素，第二个集合元素为");
        //输出字符串信息
        System.out.println(coll);    //输出第二个集合中的的元素
        coll.add("赵刚");    //位列表c2添加元素
        Iterator it = coll.iterator();    //返回列表迭代器
        System.out.print("[");        //输出字符串信息
        while (it.hasNext())        //通过迭代器遍历列表元素
            System.out.print(it.next() + ", ");//输出容器元素
        System.out.println("]");        //输出字符串信息
        coll.removeAll(collstr);         //从colll列表中删除collstr的元素
        System.out.println("从第二个集合中中删除第一个集合中包含的元素，第二个集合元素为");
        //输出字符串信息
        System.out.println(coll);//输出第二个集合中的元素
        coll.remove("赵刚");        //删除元素“赵刚"
        System.out.println("coll.isEmpty() = " + coll.isEmpty());    //查看类表是否位空列表
        System.out.println(collstr);    //输出第一个集合
        collstr.clear();//清楚第一个集合中的元素
        System.out.println("使用方法clear()后，第一个集合中的元素\n" + collstr);
    }
}

