package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();        //创建线程对象
        mt.start();                            //启动线程
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);        //主线程休眠
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第" + i + "ThreadDemo");    //主线程打印相关信息
        }
    }
}

class MyThread extends Thread {
    //重写run方法

    public void run() {
        for (int i = 0; i < 10; i++)                //设置for循环语句
        {
            try                             //放入try语句块中
            {
                Thread.sleep(100);            //调用sleep方法让当前线程休眠
            }
            catch (InterruptedException e)    //catch捕获程序异常
            {
                e.printStackTrace();
            }
            System.out.println("第" + i + "MyThread");//在线程中打印出相关的信息
        }
    }
}

