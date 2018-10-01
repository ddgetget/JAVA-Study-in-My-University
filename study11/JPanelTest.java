package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class JPanelTest {
    public static void main(String[] args)    //主方法
    {
        PanelFrame frame = new PanelFrame();    //创建窗体对象
        frame.addWindowListener(new         //给窗体对象添加关闭事件
                WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
        frame.setVisible(true);            //显示窗体
    }
}

class PanelFrame extends JFrame            //继承JFrame类
{
    public PanelFrame() {
        setTitle("使用面板");                //设置标题
        setSize(400, 300);                    //设置窗体大小
        MyPanel p = new MyPanel();            //创建窗体面板
        Container con = getContentPane();    //取得窗体容器
        con.add(p);                        //向窗体添加面板
    }
}

class MyPanel extends JPanel                //面板类继承自JPanel类
{
    //在面板上显示信息

    public void paintComponent(Graphics g)    //重写paintComponent方法
    {
        g.drawString("这是显示在面板上的信息", 120, 100);//显示信息
    }
}

