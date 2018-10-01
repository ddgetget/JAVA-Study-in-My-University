package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class RunnableTest {
    public static void main(String[] args) {

        MyThreadTest my = new MyThreadTest();            //创建MyThread类对象
        Thread thr = new Thread(my);                //构造新的线程对象
        thr.start();                                //启动线程
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);                //主线程休眠
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第" + i + "RunnableTest");    //主线程信息
        }
    }
}

