package cn.legeyung.study14;

/**
 * @author TuringEmmy
 *
 */
public class TryCatchTest2 {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 0;
            b = 5 / a;
            System.out.println("检验程序...");
        }
        catch (ArithmeticException e) {
            System.out.println("发生的异常是：" + e);
        }
        System.out.println("程序结束");
    }
}

