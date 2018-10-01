package cn.legeyung.study13;

import java.util.Scanner;

/**
 * @author TuringEmmy
 *
 */
public class GameTest {
    public static void main(String[] args) {
        System.out.println("猜数字游戏！！");
        int Guess = (int) MathTest();        //产生随机数
        int Num;                            //输入数字
        boolean right = true;                //判断结果
        while (right)                         //知道猜中数字循环结束
        {
            // 提示用户输入一个整型数字。
            System.out.println("请输入一个整型数字1-100之间:");
            Scanner scan = new Scanner(System.in);
            Num = scan.nextInt();
            System.out.println("您输入的数字为：" + Num);
            // 判断用户输入的数是否正确
            if (Num > Guess) {
                System.out.println("您输入的数大于这个数；请继续努力！");
            } else if (Num < Guess) {
                System.out.println("您输入的数小于这个数；请继续努力！");
            } else {
                System.out.println("恭喜您猜对啦！");
                System.out.println("这个数就是:" + Guess);
                right = false;
            }
        }
    }

    /**
     * 用于产生一个随机数
     *
     * @return 随机数
     */
    public static double MathTest() {
        double MathTest = Math.random() * 100;
        return MathTest;
    }
}

