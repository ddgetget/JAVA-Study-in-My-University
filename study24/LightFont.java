package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class LightFont extends Applet implements Runnable {
    private String text;                    // 声明文本对象
    private Font font;                        // 声明字体对象
    private int fontSize;                    // 声明字体的大小
    private Thread thread;                    // 声明线程对象
    private int position = 100;                // 声明光标点出现的位置
    private int tsize = 20;                    // 文本的大小
    private int twidth = 0;                    // 文本的宽度
    private int fheigth, baseLine, w;

    public void init()                            // 小程序的初始化
    {
        text = "灯光艺术字";                // 在小程序中需要显示的文本对像
        fontSize = 30;                    // 设置字体的大小
        font = new Font("TimesRoman", Font.BOLD, fontSize); // 创建Font对像
        FontMetrics fm = getFontMetrics(font);    // 获取FontMetrics字体规格对象。
        fheigth = fm.getHeight();
        baseLine = getSize().height / 2 + fheigth / 3;
        twidth = fm.stringWidth(text);
        w = fm.stringWidth(text);
        w = (getSize().width - w) / 2;
        position = w;
        setBackground(Color.black);         // 设置小程序的背景色为黑色
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);            // 创建多线程
            thread.start();                    // 启动多线程
        }
    }

    public void stop() {
        thread.stop();                        // 停止运行线程
        thread = null;
    }

    public void run()                            // 运行线程
    {
        while (true) {
            repaint();                        // 重绘此组件
            try {
                thread.sleep(30);
            }                                // 线程休眠
            catch (InterruptedException e) {
            }
        }
    }

    public void update(Graphics g)                // 更新组件
    {
        paint(g);
    }
    // 利用clipRect()方法，每次调用显示方法paint()时，
    // 先用红色的笔画一遍文字，再用白色在裁剪区中画一遍文字

    public void paint(Graphics g) {
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString(text, w, baseLine);         // 第一遍显示
        g.clipRect(position, 0, tsize, getSize().height); // 设置裁剪区域
        g.setColor(Color.white);
        g.drawString(text, w, baseLine);         // 第二遍显示
        position = (position + 1) % (twidth + 100); // 移动光标位置
    }
}
