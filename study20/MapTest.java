package org.gaozou.book.javaabc.examples.ch20;

import java.util.*;

/**
 * @author TuringEmmy
 *
 */
public class MapTest {
    public static void main(String[] args) {// java程序主入口处
        printHashMap();                 // 操作HashMap显示课程科目
        printTreeMap();                 // 操作TreeMap显示课程科目
        printArrayList();                 // 操作ArrayList显示课程科目
    }

    public static void printHashMap() { // 操作HashMap的方法
        Map map = new HashMap();         // hashMap是无序的
        map.put("01", "语文");
        map.put("02", "数学");
        map.put("03", "物理");
        map.put("04", "生物");
        map.put("05", "化学");
        map.put("06", null);
        map.put(null, "政治");
        Iterator iterator = map.keySet().iterator(); // 获得迭代器Iterator
        System.out.println("<1> 操作HashMap显示课程科目");
        while (iterator.hasNext()) {             // 循环获得每个对象
            Object key = iterator.next();         // 获得每个键元素
            System.out.print(map.get(key) + "\t"); // 输出值
        }
        System.out.println();
    }

    public static void printTreeMap() {                 // 操作TreeMap的方法
        TreeMap treeMap = new TreeMap();         // HashMap是无序的
        treeMap.put("01", "语文");
        treeMap.put("02", "数学");
        treeMap.put("03", "物理");
        treeMap.put("04", "生物");
        treeMap.put("05", "化学");
        treeMap.put("06", null);
        Iterator iterator = treeMap.keySet().iterator();// 获得迭代器Iterator
        System.out.println("<2> 操作TreeMap显示课程科目");
        while (iterator.hasNext()) {                     // 循环获得每个对象
            Object key = iterator.next();                 // 获得每个键元素
            System.out.print(treeMap.get(key) + "\t");         // 输出值
        }
        System.out.println();
    }

    public static void printArrayList() {                 // 操作有序的ArrayList列表集合
        ArrayList arrayList = new ArrayList();             // 创建列表集合对象
        arrayList.add("01 语文");
        arrayList.add("03 物理");
        arrayList.add("06 地理");
        arrayList.add("04 生物");
        arrayList.add("05 化学");
        arrayList.add("02 数学");
        System.out.println("<3> 排序前的课程种类");
        for (int i = 0; i < arrayList.size(); i++) {     // 循环显示列表集合中的元素
            System.out.print(arrayList.get(i) + "\t");
        }
        System.out.println();
        Collections.sort(arrayList);                     // 对列表集合进行排序
        System.out.println("<4> ArrayList排序后课程科目");
        for (int i = 0; i < arrayList.size(); i++) {     // 循环显示列表集合中的元素
            System.out.print(arrayList.get(i) + "\t");
        }
        System.out.println();
    }
}
