package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class WordsToExpand extends Applet implements Runnable {
    private Image image;//声明Image图象对象
    private Graphics graphic;//声明Graphics对象
    private int width = 0, height = 0;//声明高和宽变量
    private String words;//定义文本内容
    private Thread thread;//声明Thread多线程对象
    private int xPosition = 0, yPosition = 0, myHeight;//定义x和y坐标点
    private int times = 0;//表示线条出现的方向
    private Font font;

    public void init()//初始化Applet小程序
    {
        this.setSize(300, 200);
        font = new Font("TimesRoman", Font.ROMAN_BASELINE, 30);
        width = 300;
        height = 200;
        myHeight = height / 3;
        yPosition = myHeight;
        words = "这是Applet小程序";
        image = createImage(width, height);
        graphic = image.getGraphics();
    }

    public void start()//起动Applet小程序和多线程
    {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void update(Graphics g)//更新组件
    {
        paint(g);
    }

    public void paint(Graphics g)//绘制组件
    {
        g.drawImage(image, 0, yPosition, width, myHeight, this);
    }

    public void run()//运行多线程
    {
        try {
            while (true) {
                yPosition = 0;
                myHeight = height;
                graphic.setColor(Color.pink);
                graphic.fillRect(0, 0, width, height);
                repaint();
                thread.sleep(100);
                if (times == 0) {
                    graphic.setColor(Color.red);
                    for (int i = width; i >= 0; i--) {
                        graphic.fillRect(i, height / 3, width, height / 10);
                        repaint();
                        thread.sleep(10);
                    }
                } else if (times == 1) {
                    graphic.setColor(Color.black);
                    for (int i = 0; i <= width; i++) {
                        graphic.fillRect(0, height / 3, i, height / 10);
                        repaint();
                        thread.sleep(10);
                    }
                }
                yPosition = height / 3;
                myHeight = height / 3;
                for (int i = height / 3; i >= 0; i--) {
                    xPosition = 0;
                    yPosition--;
                    myHeight = myHeight + 2;
                    if (times == 0)//0表示从右向左移动
                    {
                        graphic.setColor(Color.black);
                        graphic.fillRect(0, 0, width, height);
                        graphic.setFont(font);
                        graphic.setColor(Color.yellow);
                        graphic.drawString(words, 10, 35);
                        times++;
                    } else if (times == 1)//1表示从左向右移动
                    {
                        graphic.setColor(Color.red);
                        graphic.fillRect(0, 0, width, height);
                        graphic.setFont(font);
                        graphic.setColor(Color.black);
                        graphic.drawString(words, 10, 35);
                        times = 0;
                    }
                    repaint();
                    thread.sleep(100);
                }
                thread.sleep(2500);
                System.out.println(times);
            }
        } catch (InterruptedException e) {
        }
    }
}
