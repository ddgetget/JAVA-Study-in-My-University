package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class IntegerTest {
    public static void main(String[] args) {
        //打印Integer的最大值
        System.out.println("Integer的最大值是：" + Integer.MAX_VALUE);
        String s = new String("1010");
        //返回s的十进制数
        System.out.println("s的十进制数是：" + Integer.getInteger(s, 2));
        Integer i = new Integer("1234");
        //比较
        System.out.println("i的比较：" + i.compareTo(123));
        int j = 12345;
        //转换为字符串
        System.out.println("转换字符串结果为：" + Integer.toString(j, 16));
    }
}
