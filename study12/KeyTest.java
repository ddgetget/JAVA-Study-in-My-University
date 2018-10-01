package cn.legeyung.study12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Author: George Li
 * Powered by GaoZou group.
 */
public class KeyTest extends KeyAdapter
        implements ActionListener {
    JFrame jframe = null;            //声明一个JFrame类对象
    JLabel label = null;        //声明一个JLabel类对象
    JTextField jtext = null;    //声明一个JTextField类对象
    String key = "";

    public KeyTest() {
        jframe = new JFrame("键盘监听示例");    // 为这个JFrame设置一个标题
        Container contentPane = jframe.getContentPane();
        contentPane.setLayout(new GridLayout(3, 1));
        label = new JLabel();            // 创建一个标签对象
        jtext = new JTextField();
        jtext.requestFocus();
        jtext.addKeyListener(this);
        JButton b = new JButton("清除");    // 创建一个按钮
        b.addActionListener(this);
        contentPane.add(label);
        contentPane.add(jtext);
        contentPane.add(b);
        jframe.pack();
        jframe.show();
        jframe.addWindowListener(new WindowAdapter() {    //添加窗口事件监听

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        key = "";
        label.setText("");
        jtext.setText("");
        jtext.requestFocus();
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();    //获取事件源上的字符
        if (c == 'o') {        //如果输入字母o，就会产生新窗口
            JFrame newF = new JFrame("这是输入o后弹出的新窗口");
            newF.setSize(200, 200);
            newF.show();
        }
        key = key + c;
        label.setText(key);
    }

    public static void main(String[] args) {
        new KeyTest();
    }
}

