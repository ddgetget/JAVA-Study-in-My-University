package org.gaozou.book.javaabc.examples.ch20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author TuringEmmy
 *
 */
public class ArrayListTest {
    public static void main(String[] args) { // java程序主入口处
        add();                     // 调用方法获得添加后的食物
        leftovers();                 // 调用方法获得剩下的食物
    }

    public static void add() {
        List list = new ArrayList(5); // 创建容量为5的列表集合
        list.add("语文");             // 添加元素(对象)，向冰箱中添加食物
        list.add("数学");
        list.add("生物");
        list.add("物理");
        System.out.println("第一次选课单中的科目:");
        for (Iterator iter = list.iterator(); iter.hasNext();) { // 使用Iterator进行循环
            Object obj = iter.next();     // 获得每个元素(对象)
            System.out.print(obj + "\t");
            if ("数学".equals(obj))     // 第一次想要选择数学科目，所以先判断哪个是数学
                iter.remove();             // 选择正确后吃掉（移除对象）
        }
        System.out.println();
        System.out.println("第二次选课单中的科目：");
        Iterator it = list.iterator();// 获得Iterator对象
// 只要有元素(对象)便进行循环，第二次选课，数学已经选择。
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        System.out.println();
    }

    public static void leftovers() {     // 查看经过一系列科目的选择，最终剩下的科目
        Vector vector = new Vector(4);     // 创建容量为4的向量集合
        vector.add("语文");             // 添加元素(对象)
        vector.add("数学");
        vector.add("生物");
        vector.add("物理");
        System.out.println("最后还没有选择的科目:");
        for (Iterator iter = vector.iterator(); iter.hasNext();) { // 使用Iterator进行循环
            if (iter.next().equals("语文"))     // 获得一个元素进行判断
                iter.remove();                 // 移除对象
            else {
                System.out.println(iter.next().toString());// 输出元素
            }
        }
    }
}
