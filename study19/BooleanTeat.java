package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class BooleanTeat {
    public static void main(String[] args) {
        //通过两个不同的构造方法来构造对象
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("a");
        //用构造函数构造对象
        Boolean b4 = new Boolean("true");
        Boolean b5 = new Boolean("a");
        Boolean b6 = new Boolean(true);
        //打印出这些Boolean对象的值
        System.out.println("b1对象的值：" + b1.booleanValue());
        System.out.println("b2对象的值：" + b2.booleanValue());
        System.out.println("b3对象的值：" + b3.booleanValue());
        System.out.println("b4对象的值：" + b4.booleanValue());
        System.out.println("b5对象的值：" + b5.booleanValue());
        System.out.println("b6对象的值：" + b6.booleanValue());
    }
}
