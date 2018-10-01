package org.gaozou.book.javaabc.examples.ch21;

/**
 * @author TuringEmmy
 *
 */
public class MyValueTest {
    public static void main(String[] args) {
        //创建自定义的泛型类型对象，并且制定两个类型变量
        MyValue<String, Integer> mv1 = new MyValue<String, Integer>();
        //调用set方法对成员变量进行设置
        mv1.setValue("该参数为字符串类型", new Integer(100));
        //返回第一个成员变量的值
        String str1 = mv1.getValue1();
        //返回第二个成员变量的值
        Integer int1 = mv1.getValue2();
        //打印结果
        System.out.println("第一个参数对象的值为：" + str1 + "\n第二个值为：" + int1 + "。\n");
        //创建另一个自定义泛型类型对象，并且制定两个类型变量
        MyValue<Integer, String> mv2 = new MyValue<Integer, String>();
        //调用set方法对成员变量进行设置
        mv2.setValue(new Integer(100), "该参数为字符串类型");
        //返回第一个成员变量的值
        String str2 = mv2.getValue2();
        //返回第二个成员变量的值
        Integer int2 = mv2.getValue1();
        //打印结果
        System.out.println("第一个参数对象的值为：" + int2 + "\n第二个值为：" + str2 + "。");
    }
}

class MyValue<T, U> {
    //定义两个由类型变量指定类型的成员变量
    private T value1;
    private U value2;
    //定义两个成员变量的set方法，

    public void setValue(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    //定义两个成员变量的get方法。

    public U getValue2() {
        return value2;
    }

    public T getValue1() {
        return value1;
    }
}

