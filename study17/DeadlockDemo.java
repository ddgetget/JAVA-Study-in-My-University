package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class DeadlockDemo {
    public static void main(String[] args) {
        //创建资源对象
        Resource rs1 = new Resource("资源1");
        Resource rs2 = new Resource("资源2");
        Resource rs3 = new Resource("资源3");
        //创建三个实现Runnable接口的对象
        MyThread1 ms1 = new MyThread1(rs1, rs2, "线程1");
        MyThread1 ms2 = new MyThread1(rs2, rs3, "线程2");
        MyThread1 ms3 = new MyThread1(rs3, rs1, "线程3");
        //创建线程
        Thread t1 = new Thread(ms1);
        Thread t2 = new Thread(ms2);
        Thread t3 = new Thread(ms3);
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}

class Resource                     //资源类
{
    String resoureName;            //资源名字

    Resource(String name) {
        this.resoureName = name;
    }
}

class MyThread1 implements Runnable     //实现Runnble接口
{
    Resource rs1;                    //线程需要的资源1
    Resource rs2;                    //线程需要的资源1
    String name;

    MyThread1(Resource rs1, Resource rs2, String name) {//构造方法
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.name = name;
    }
    //run方法有两个同步块语句，只有它同时占有两个资源的锁时才能执行完毕

    public void run() {
        synchronized (rs1)                 //对资源1同步锁定
        {
            System.out.println(this.name + "获得  " + rs1.resoureName);
            try {
                Thread.sleep(1000);        //线程休眠
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + "等待" + rs2.resoureName + "释放");
            synchronized (rs2)                 //对资源2同步锁定
            {
                System.out.println(this.name + "获得  " + rs2.resoureName);
                try {
                    Thread.sleep(1000);        //线程休眠
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

