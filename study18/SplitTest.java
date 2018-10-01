package org.gaozou.book.javaabc.examples.ch18;

/**
 * @author TuringEmmy
 *
 */
public class SplitTest {
    public static void main(String[] args) {
        //创建字符串表示的正则表达式和被匹配的字符串
        String patternStr = ";|,";
        String str = "张三;李四,王五";
        //打印出待拆分的字符串内容
        System.out.println("需要拆分的字符串内容是：");
        System.out.println(str);
        //将字符串拆分默认份
        System.out.println("将字符串按照默认进行切割");
        String[] arrStr = str.split(patternStr);
        //打印拆分后的结果
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
        //将字符串拆分成3份
        System.out.println("\n将字符串拆分成3份");
        arrStr = str.split(patternStr, 3);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
        //将字符串拆分成-2份
        System.out.println("\n将字符串拆分成-2份");
        arrStr = str.split(patternStr, -2);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
        //将字符串拆分成0份
        System.out.println("\n将字符串拆分成0份");
        arrStr = str.split(patternStr, 0);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("arrStr[" + i + "]=<" + arrStr[i] + ">");
        }
    }
}
