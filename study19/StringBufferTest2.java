package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcdefg");    //创建一个StringBuffer对象
        System.out.println(sb);                    //打印出sb的值
        //取得每个位置的字符，并用大写形式替换
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            System.out.println(c);
            c = (char) (c - 32);                        //取得c的大写形式
            sb.setCharAt(i, c);                    //替换
        }
        System.out.println(sb);
    }
}

