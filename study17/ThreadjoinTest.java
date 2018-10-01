package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadjoinTest {
    public static void main(String[] args) {
        FirstTest1 one = new FirstTest1();    //创建FirstTest对象
        SecondTest1 two = new SecondTest1();    //创建secondTest对象
        ThirdTest1 threa = new ThirdTest1();    //创建thirdTest对象
        one.start();                        //开启one线程
        two.start();                        //开启two线程
        threa.start();                    //开启threa线程
    }
}
//创建第一个线程

class FirstTest1 extends Thread {
//	实现run()方法。

    public void run() {
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 10;) {            //循环打印数字
                a++;
                System.out.println("第一个线程   第" + a + "次循环");    //打印输出
                Thread.sleep(1000);        //间隔1秒打印一次
            }
        } catch (Exception e) {
            System.out.println("异常");    //打印输出异常
        } finally {
        }
    }
}
//创建第二个线程

class SecondTest1 extends Thread {
    public FirstTest1 first;

    public void run() {            //实现run()方法。
        // TODO 自动生成方法存根
        for (int a = 0; a < 10;) {    //循环打印数字
            try {
                a++;
                System.out.println("第二个线程   第" + a + "次循环");//打印输出
                Thread.sleep(1000);    //间隔1秒打印一次
            } catch (Exception e) {
                System.out.println("异常");    //打印输出异常
            }
            if (a == 4) {
                try {
                    first.join();            //加入线程FirstTest1
                } catch (InterruptedException e) {
                    // TODO 自动生成 catch 块
                    e.printStackTrace();
                }
            }
        }
    }
}
//创建第三个线程

class ThirdTest1 extends Thread {
//	实现run()方法。

    public void run() {
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 10;) {            //循环打印数字
                a++;
                System.out.println("第三个线程   第" + a + "次循环");//打印输出
                Thread.sleep(1000);        //间隔1秒打印一次
            }
        } catch (Exception e) {
            System.out.println("异常");    //打印输出异常
        }
    }
}

