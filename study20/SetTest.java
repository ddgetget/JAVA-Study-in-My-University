package org.gaozou.book.javaabc.examples.ch20;

import java.util.*;

/**
 * @author TuringEmmy
 *
 */
public class SetTest {
    public static void main(String[] args) { // java程序主入口处
        hashSetResult();
        treeSetResult();
        linkedHashSetResult();
        Set hashSet = new HashSet();
        addSetElement(hashSet);
        hashSet.add("数学");                 // Set不允许元素重复
        hashSet.add("语文");
        System.out.println("\n为hashSet加入数学, 语文元素后->: ");
        showElement(hashSet);             // 调用方法显示元素
        hashSet.remove("物理");             // 删除元素
        System.out.println("\nhashSet删除物理元素后->: ");
        showElement(hashSet);             // 调用方法显示元素
        List list = new ArrayList();             // 创建一个列表集合
        list.add("数学");
        list.add("化学");
        list.add("生物");
        hashSet.addAll(list);                 // 将列表集合添加到Set中
        System.out.println("\nhashSet添加一个集合的所有元素后->: ");
        showElement(hashSet);
        hashSet.retainAll(list);                 // 删除除列表集合中的元素之外的元素
        System.out.println("\nhashSet删除除了列表集合之外的元素后->: ");
        showElement(hashSet);             // 调用方法显示元素
        hashSet.removeAll(list);             // 删除集合中的元素
        System.out.println("\nhashSet删除集合中的元素后->: ");
        showElement(hashSet);             // 调用方法显示元素
        // 获取Set中元素的个数
        System.out.println("\thashSet中当前元素的个数: " + hashSet.size());
        // 判断Set中的元素是否为空
        System.out.println("\thashSet中当前元素为0？  " + hashSet.isEmpty());
    }

    public static void hashSetResult() {             // 使用HashSet操作元素
        Set hashSet = new HashSet();
        addSetElement(hashSet);             // 调用方法初始化元素
        System.out.println("使用HashSet存储的数据元素如下->： ");
        showElement(hashSet);             // 调用方法显示元素
    }

    public static void treeSetResult() {             // 使用TreeSet操作元素
        Set treeSet = new TreeSet();
        addSetElement(treeSet);             // 调用方法初始化元素
        System.out.println("\n使用TreeSet存储的数据元素如下->：");
        showElement(treeSet);                 // 调用方法显示元素
    }

    public static void linkedHashSetResult() {     // 使用LinkedHashSet操作元素
        Set linkedHashSet = new LinkedHashSet();
        addSetElement(linkedHashSet);         // 调用方法初始化元素
        System.out.println("\n使用LinkedHashSet存储的数据元素如下->：");
        showElement(linkedHashSet);         // 调用方法显示元素
    }

    public static void addSetElement(Set set) { // 初始化Set的元素
        if (set != null) {
            set.add("数学");
            set.add("语文");
            set.add("生物");
            set.add("化学");
            set.add("政治");
        }
    }

    public static void showElement(Set set) {         // 输出set的元素
        if (set != null && set.size() > 0) {
            Iterator it = set.iterator();         // 获得迭代器Iterator
            while (it.hasNext()) {             // 循环获得Set每个元素
                System.out.print(it.next() + " ");
            }
        } else {
            System.out.println("没有元素！");
        }
        System.out.println();                 // 换行
    }
}
