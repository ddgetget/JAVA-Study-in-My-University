package org.gaozou.book.javaabc.examples.ch17;

/**
 * @author TuringEmmy
 *
 */
public class SynchDemo {
    public static void main(String[] args) {
        //创建一个打印机对象
        Printer ps = new Printer();
        //创建3个教师实例
        Teacher t1 = new Teacher(ps, "lancy", 87, 76, 90);
        Teacher t2 = new Teacher(ps, "macula", 97, 86, 70);
        Teacher t3 = new Teacher(ps, "herbert", 67, 86, 97);
        //启动打印工作
        t1.t.start();
        t2.t.start();
        t3.t.start();
    }
}
//Printer类用来模拟打印机，它可以获得信息并把它打印出来

class Printer {
    //打印方法

    void printScore(String name, int score1, int score2, int score3) {
        System.out.println(name + "的成绩：");
        System.out.print(name + "英语：");
        System.out.println(score1);
        //为了是程序运行结果明显，在打印的过程中让打印工作休眠一段时间
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(name + "数学：");
        System.out.println(score2);
        System.out.print(name + "语文：");
        System.out.println(score3);
    }
}
//教师类，每个教师都有自己的线程并且公用一个打印机

class Teacher implements Runnable {
    Printer ps = null;                            //打印机
    String name = null;                            //姓名
    Thread t;                                //线程
    int score1 = 0;                                //成绩
    int score2 = 0;
    int score3 = 0;
    //教师类的构造函数

    Teacher(Printer printer, String nm, int s1, int s2, int s3) {
        ps = printer;
        name = nm;
        t = new Thread(this);
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    //教师调用打印机

    public void run() {
        ps.printScore(name, score1, score2, score3);
    }
}
