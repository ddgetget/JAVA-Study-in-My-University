package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadsleepTest {
    public static void main(String[] args) {
        FirstTest one = new FirstTest();        //创建FirstTest对象
        SecondTest two = new SecondTest();    //创建secondTest对象
        ThirdTest threa = new ThirdTest();    //创建thirdTest对象
        one.start();                        //开启one线程
        two.start();                        //开启two线程
        threa.start();                    //开启threa线程
    }
}
//创建第一个线程

class FirstTest extends Thread {
    public void run() {                //	实现run()方法。
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 5;) {            //循环打印数字
                a++;                        //a增加1
                System.out.println("第一个线程   第" + a + "次循环");//打印输出
                Thread.sleep(2000);        //间隔2秒打印一次
            }
        } catch (Exception e) {
            System.out.println("异常");
        }
    }
}
//创建第二个线程

class SecondTest extends Thread {
    public void run() {                //实现run()方法。
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 5;) {        //循环打印数字
                a++;
                System.out.println("第二个线程   第" + a + "次循环");//打印输出
                Thread.sleep(2500);    //间隔2.5秒打印一次
            }
        } catch (Exception e) {
            System.out.println("异常");    //打印输出异常
        }
    }
}
//创建第三个线程

class ThirdTest extends Thread {
    public void run() {                    //实现run()方法。
        // TODO 自动生成方法存根
        try {
            for (int a = 0; a < 5;) {            //循环打印数字
                a++;
                System.out.println("第三个线程   第" + a + "次循环");//打印输出
                Thread.sleep(3000);        //间隔3秒打印一次
            }
        } catch (Exception e) {
            System.out.println("异常");    //打印输出
        }
    }
}

