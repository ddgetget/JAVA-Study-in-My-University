package org.gaozou.book.javaabc.examples.ch24;

import java.applet.Applet;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class WordsTest extends Applet implements Runnable {
    private Image image;                        // 定义图片对象
    private Graphics graphic;                    // 定义Graphics对象
    private Font font;                            // 定义Font对象
    private String str;                    // 定义一个字符串对象
    private Thread thread;                    // 定义一个Thread对象
    private int fontSize;                        // 定义一个int型变量

    public void init() {                        // Applet小程序初始化
        this.setSize(400, 400);
        image = createImage(400, 400);         // /创建Image图像对像
        graphic = image.getGraphics();
        str = "这是Applet小程序";            // 需要变化的文本内容
        font = new Font("TimesRoman", Font.BOLD, 8);
    }

    public void start() {                        // 启动多线程
        if (thread == null) {
            thread = new Thread(this);
            thread.start();                    // 启动线程
        }
    }

    public void update(Graphics g) {            // 重新调用paint方法
        paint(g);
    }

    public void paint(Graphics g) {                // 绘图像
        graphic.setColor(Color.black);
        graphic.fillRect(0, 0, getSize().width, getSize().height);
        font = new Font("TimesRoman", Font.BOLD, fontSize);
        graphic.setFont(font);
        graphic.setColor(Color.white);
        FontMetrics fm = graphic.getFontMetrics(font);
        int fontHeight = fm.getHeight();
        int w;
        int baseLine = getSize().height / 2 + fontHeight / 2;
        w = fm.stringWidth(str);
        w = (getSize().width - w) / 2;
        graphic.drawString(str, w, baseLine -= 20);
        g.drawImage(image, 0, 0, this);
        fontSize++;
    }

    public void run() {                        // 重写run方法
        while (true) {
            repaint();
            if (fontSize > getSize().height)
                fontSize = 0;
            try {
                thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
