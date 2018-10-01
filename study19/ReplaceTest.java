package org.gaozou.book.javaabc.examples.ch19;

/**
 * @author TuringEmmy
 *
 */
public class ReplaceTest {
    public static void main(String[] args) {
        //构造一个StringBuffer对象
        StringBuffer sb = new StringBuffer
                ("Tom is a good sttudent,Tom love his mother,Tom like palying football");
        System.out.println(sb);            //打印出StringBuffer对象内容
        int index = 0;                    //用index来表示下次调用indexOf的位置
        //需要用index和名字的长度length来对indexOf操作进行定位
        int length = "Tom".length();
        String name = "Mark";                //用mark来替换tom
        //循环语句，直到全部被替换完毕位置
        while (sb.indexOf("Tom", index + 1) > index) {
            index = sb.indexOf("Tom");        //取得位置
            sb.replace(index, index + length, name);            //替换
        }
        System.out.println(sb);                            //打印出结果
    }
}
