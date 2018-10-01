package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class MyThreadTest implements Runnable {
    //实现run方法

    public void run() {
        for (int i = 0; i < 10; i++)                        //for循环
        {
            try {
                Thread.sleep(100);                //线程休眠
            }
            catch (InterruptedException e)            //捕获异常
            {
                e.printStackTrace();
            }
            System.out.println("第" + i + "MyThreadTest");        //线程信息
        }
    }
}

