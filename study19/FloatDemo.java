package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class FloatDemo {
    public static void main(String[] args) {
        //创建一个Float对象
        Float f = new Float(20f);
        //打印出Float类定义的常量
        System.out.println("Float最大值：" + f.MAX_VALUE);
        System.out.println("Float最小值：" + f.MIN_VALUE);
        System.out.println("Float位数：" + f.SIZE);
        System.out.println("Float正无穷大的常量:" + f.POSITIVE_INFINITY);
        System.out.println("Float负无穷大的常量:" + f.NEGATIVE_INFINITY);
        System.out.println("f的值：" + f.floatValue());
        System.out.println("f的十六进制形式" + f.toHexString(f));
        System.out.println("f的double值" + f.doubleValue());
    }
}
