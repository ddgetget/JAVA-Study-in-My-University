package org.gaozou.book.javaabc.examples.ch21;

import java.util.ArrayList;

/**
 * @author TuringEmmy
 *
 */
public class WildcardTest {
    public static void printMyValue(ArrayList<?> mv) {
        //打印该对象中的值
        System.out.println("列表中的值是：");
        System.out.println(mv);
    }

    public static void main(String[] args) {
        //创建类型参数String的ArrayList对象
        ArrayList<String> as = new ArrayList<String>();
        //循环插入20个字符串
        for (int i = 0; i < 20; i++) {
            as.add(" " + i);
        }
        //调用printMyValue方法进行打印
        printMyValue(as);
    }
}
