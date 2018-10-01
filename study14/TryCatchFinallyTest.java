package cn.legeyung.study14;

/**
 * @author TuringEmmy
 *
 */
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        double a = Math.random();
        try {
            if (a > 0.5) {
                System.out.println(a);
            } else {
                throw new Exception();
            }
        } catch (Exception el) {
            System.out.println("这是在外层所捕获的异常：" + el);
            try {
                a = 10 / 0;
            } catch (ArithmeticException em) {
                System.out.println("这是内层所捕获的异常：" + em);
            } finally {
                System.out.println("这是内层的finally块");
            }
        } finally {
            System.out.println("这是外层的finally块");
        }
    }
}

