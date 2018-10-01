package org.gaozou.book.javaabc.examples.ch22;

import java.util.Scanner;


/**
 * @author TuringEmmy
 *
 */
public class Hanoi {
    private static int i = 0;

    public static void main(String[] args) {
        int n = 0;
        Scanner reader = new Scanner(System.in); // 扫描输入文本
        System.out.println("请输入金盘子的数量：");
        n = reader.nextInt();
        System.out.println(n + " 层汉诺塔的解法是：");

        // 将n个盘子从A移动到C，中间借助B
        move(n, 'A', 'B', 'C');

        System.out.println("Total: " + i);
        System.exit(0);
    }

    // 移动盘子的方法，将n个盘子从from移到to，inter辅助

    public static void move(int no, char from, char inter, char to) {
        i++;
        if (no == 1) {
            System.out.println("Move plate 1 from " + from + " to " + to);
        } else {
            move(no - 1, from, to, inter); // 先将n-1个盘子从from移动到inter
            System.out.println("Move plate " + no + " from " + from + " to " + to);
            move(no - 1, inter, from, to); // 再将n-1个盘子从inter移动到to
        }
    }
}
