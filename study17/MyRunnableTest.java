package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        //创建实现Runnable接口类的对象
        RunnableTest1 rt = new RunnableTest1();
        //创建Thread对象，将第一步创建对象的引用作为构造器参数
        Thread t = new Thread(rt);
        //启动线程
        t.start();
    }
}

class RunnableTest1 implements Runnable {
    //实现run方法。

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("恭喜你，线程已经被启动" +
                "执行了run方法中的代码");
    }
}

