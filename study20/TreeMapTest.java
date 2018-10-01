package org.gaozou.book.javaabc.examples.ch20;

import java.util.*;

/**
 * @author TuringEmmy
 *
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();    //创建HashMap对象hm
        hm.put("张三 ", new Integer(5));        //添加一个映射关系的键值
        hm.put("李四", new Integer(3));         //添加一个映射关系的键值
        hm.put("王五 ", new Integer(2));         //添加一个映射关系的键值
        hm.put("赵六", new Integer(1));         //添加一个映射关系的键值
        hm.put("钱七", new Integer(4));         //添加一个映射关系的键值
        hm.put("赵刚", new Integer(7));         //添加一个映射关系的键值
        hm.put("思思", new Integer(6));        //添加一个映射关系的键值
        //创建一个TreeMap对象
        Map<String, Integer> sortedMap = new TreeMap<String, Integer>();
        sortedMap.putAll(hm);                //将hm所有的元素添加于sortedMap
        System.out.println(sortedMap);        //输出sortedMap的键值对
        Iterator itk = hm.keySet().iterator();//返回hm的键的迭代器
        Iterator itv = hm.values().iterator();//返回hm值的迭代器
        while (itk.hasNext()) {            //通过键的迭代器遍历
            Object key = itk.next();//返回键的下一个元素
            Object value = itv.next();    //返回值的下一个元素
            System.out.print(key.toString() + "=");//输出键的名称
            System.out.print(value.toString() + ", ");//输出值
        }
    }

    public static void print(Collection c)    //输出集合类
    {
        Iterator it = c.iterator();        //返回迭代器
        while (it.hasNext())        //遍历集合类
        {
            Object o = it.next();    //获取下一个元素
            System.out.println(o);//输出该
        }
    }
}

