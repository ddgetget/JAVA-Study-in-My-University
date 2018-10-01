package org.gaozou.book.javaabc.examples.ch22;

import java.util.Scanner;

/**
 * @author TuringEmmy
 *
 */
public class Bubble {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // 扫描输入文本
        System.out.println("请输入待排序数组（以空格分隔）：");
        String st = reader.nextLine();
        System.out.println(st + " 的排序方法：");

        String[] ss = st.split("\\s+");

        sort(ss); // 排序

        System.out.println("结果：");

        StringBuffer sb = new StringBuffer();
        for (String a : ss) {
            sb.append(a).append(" ");
        }
        System.out.println("" + sb);
    }

    public static <E extends Comparable<E>> void sort(E[] array) {
        StringBuffer sb = new StringBuffer();
        int len = array.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append("比较：").append(array[j]).append(" ").append(array[j + 1]);

                if (array[j].compareTo(array[j + 1]) > 0) {
                    sb.append(" 冒泡");
                    swap(array, j, j + 1);
                }

                System.out.println(sb);
                sb.setLength(0);
            }

            for (E s : array) {
                sb.append(s).append(" ");
            }
            System.out.println("第 " + (len - i) + " 轮：" + sb);
            sb.setLength(0);
        }
        System.out.println("-----------");
    }

    // 交换两个元素的位置

    public static <E extends Comparable<E>> void swap(E[] array, int a, int b) {
        E t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
}
