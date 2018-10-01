package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class DoubleTest {
    public static void main(String[] args) {
        Double dd = new Double(56);
        //打印出Double类的一些常量
        System.out.println("Double的最大值是：" + dd.MAX_VALUE);
        System.out.println("Double的最小值是：" + dd.MIN_VALUE);
        System.out.println("Double的类型是：" + dd.TYPE);
        System.out.println("Double的数据大小是：" + dd.SIZE);
        System.out.println("Double的正无穷是：" + dd.POSITIVE_INFINITY);
        System.out.println("Double的负无穷是：" + dd.NEGATIVE_INFINITY);
    }
}
