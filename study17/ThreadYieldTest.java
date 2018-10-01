package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadYieldTest {
    public static void main(String[] args) {
        FirstTest2 one = new FirstTest2();        //创建FirstTest对象
        SecondTest2 two = new SecondTest2();        //创建secondTest对象
        ThirdTest2 threa = new ThirdTest2();        //创建thirdTest对象
        one.start();                            //开启one线程
        two.start();                            //开启two线程
        threa.start();                        //开启threa线程
    }
}
//创建第一个线程

class FirstTest2 extends Thread {
//	实现run()方法。

    public void run() {
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 5;) {            //循环打印数字
                a++;
                System.out.println("第一个线程   第" + a + "次循环");//打印输出
            }
        } catch (Exception e) {
            System.out.println("异常");    //输出异常
        } finally {
        }

    }

}
//创建第二个线程

class SecondTest2 extends Thread {
//	实现run()方法。

    public void run() {
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 5;) {                    //循环打印数字
                a++;
                System.out.println("第二个线程   第" + a + "次循环");//打印输出
                Thread.yield();            //线程让步
            }
        } catch (Exception e) {
            System.out.println("异常");    //打印输出异常
        }
    }
}
//创建第三个线程

class ThirdTest2 extends Thread {
//	实现run()方法。

    public void run() {
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 5;) {                        //循环打印数字
                a++;
                System.out.println("第三个线程   第" + a + "次循环");//打印输出
            }
        } catch (Exception e) {
            System.out.println("异常");        //打印输出异常
        }
    }
}

