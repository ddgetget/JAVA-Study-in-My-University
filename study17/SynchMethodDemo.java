package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class SynchMethodDemo {
    public static void main(String[] args) {
        Source s = new Source();                //创建一个资源对象
        //创建两个实现Runnable接口的对象
        MyThread2 mt1 = new MyThread2(s, "method1");
        MyThread2 mt2 = new MyThread2(s, "method2");
        //创建两个线程
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        //启动线程
        t1.start();
        t2.start();
    }
}

class Source {
    //定义同步方法method1

    synchronized void method1() {
        System.out.println("进入方法method1，获得锁");
        try {
            Thread.sleep(1000);                //线程休眠
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mehtod1执行完毕，释放锁");
    }
    //定义同步方法method2

    synchronized void method2() {
        System.out.println("进入方法method2，获得锁");
        try {
            Thread.sleep(1000);                //线程休眠
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mehtod2执行完毕，释放锁");
    }
}
//定义线程类

class MyThread2 implements Runnable {
    String name;                            //通过name来判断调用哪个方法
    Source s = null;

    MyThread2(Source s, String nm)                //构造方法
    {
        this.s = s;
        name = nm;
    }

    public void run() {                        //线程执行时的操作
        if ("method1".equals(name))
            s.method1();                    //调用同步方法1
        else {
            System.out.println("Thread2启动，准备调用method2");
            s.method2();                    //调用同步方法2
        }
    }
}
