package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class AppendTest {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");    //创建一个StringBuffer对象sb
        sb.append('!');                //在sb的尾部追加一系列元素
        sb.append("\n");
        sb.append(true);
        sb.append("\n");
        sb.append(20);
        sb.append("\n");
        sb.append("Hello!");
        System.out.println(sb);                    //打印出结果
    }
}
