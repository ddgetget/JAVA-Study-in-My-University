package org.gaozou.book.javaabc.examples.ch21;

/**
 * @author TuringEmmy
 *
 */
public class FFTest {
    //自定义泛型方法

    public static <T> T getLast(T[] a) {
        //返回指定类型数组的最后一个元素。
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        //创建字符串类型的数组
        String[] str = {"第一个元素", "第二个元素", "第三个元素"};
        //使用泛型方法，并为其指定类型参数
        String laststr = FFTest.<String>getLast(str);
        //打印结果
        System.out.println("String数组str的最后一个元素是：" + laststr);
        //创建Integer类型数组
        Integer[] inte = {new Integer(100), new Integer(200), new Integer(300)};
        //使用泛型方法，但是没有显示指定类型参数
        Integer lastint = FFTest.getLast(inte);
        //打印结果
        System.out.println("Integer数组inte的最后一个元素是：" + lastint);
    }
}
