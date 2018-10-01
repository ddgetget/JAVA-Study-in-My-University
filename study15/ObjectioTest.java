package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;
import java.util.Calendar;

/**
 * @author TuringEmmy
 *
 */
public class ObjectioTest {
    // 将对象序例化

    public static void serialize(String fileName) throws Exception {
        // 创建一个对象输出流，将对象输出到文件
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                fileName));
        out.writeObject("今天的日期和时间如下："); // 序列化一个字符串对象到文件
        out.writeObject(Calendar.getInstance());// 序列化当前日期对象到文件
        // 序列化一个MyClass对象
        TestClass tc = new TestClass(1, 2, 3, 4);
        out.writeObject(tc);
        out.close();
    }
    // 将序列化的对象反序列

    public static void deserialize(String fileName) throws Exception {
        // 创建一个对象输入流，从文件读取对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                fileName));
        // 读取字符串对象
        String today = (String) (in.readObject());
        System.out.println(today);
        // 读日历Calendar对象
        Calendar date = (Calendar) (in.readObject());
        System.out.println(date.get(Calendar.YEAR) + "年"
                + (date.get(Calendar.MONTH) + 1) + "月"
                + date.get(Calendar.DAY_OF_MONTH) + "日："
                + date.getTime().toLocaleString());
        // 从输入流中读取TestClass对象。
        TestClass tc = (TestClass) (in.readObject());
        System.out.println(tc.toString());
        in.close();
    }

    public static void main(String[] args) {
        System.out.println("反序列化的结果如下：");
        String fileName = "D:/temp/TestClass.txt";
        try {
            ObjectioTest.serialize(fileName);
        } catch (Exception e) {
            System.out.println("对象序列化失败" + e.getMessage());
        }
        try {
            ObjectioTest.deserialize(fileName);
        } catch (Exception e) {
            System.out.println("对象反序列化失败" + e.getMessage());
        }
    }
}
// 一个类，用于被序列化和反序列化。
//一定要实现Serializable才能够被序列化和反序列化。

class TestClass implements Serializable {
    private int i, n; // 一般的实例变量会被序列化和反序列化
    private transient int x; // 用transient声明的变量不会被序列化和反序列化
    private static int y; // 类变量也不会被序列化和反序列化

    public TestClass(int m, int n, int x, int y) {// 利用构造方法赋值
        this.i = m;
        this.n = n;
        this.x = x;
        TestClass.y = y;
    }

    public String toString() {
        return i + " : " + n + "  :" + x + "  :" + y;
    }
}

