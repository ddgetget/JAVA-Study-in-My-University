package org.gaozou.book.javaabc.examples.ch21;

import java.io.Serializable;

/**
 * @author TuringEmmy
 *
 */
public class ExtendsTest {
    public static void main(String[] args) {
        //创建ValueTest的对象，并制定类型参数为Integer
        ValueTest<Integer> vt = new ValueTest<Integer>();
        //设置vt中的参数。
        vt.setValue(new Integer(200));
        //获取vt中的值
        Integer inte = vt.getValue();
        //打印输出
        System.out.println("vt对象中的值是：" + inte +
                "\n该值既属于Number又实现了Comparable和Serializable");
    }
}

class ValueTest<T extends Number & Comparable & Serializable> {
    //定义由类型参数指定类型的成员变量
    private T value;
    //设置成员变量的set方法

    public T getValue() {
        return value;
    }
    //设置成员变量的get方法

    public void setValue(T value) {
        this.value = value;
    }
}

