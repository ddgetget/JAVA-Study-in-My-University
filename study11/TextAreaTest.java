package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class TextAreaTest {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("文本区示例");
        Container contentPane = jframe.getContentPane();// 返回窗体容器。
        contentPane.setLayout(new BorderLayout());     // 设置窗体容器布局。
        JPanel jpanel = new JPanel();                 // 声明面板容器。
        JTextArea jta = new JTextArea(10, 20);         // 创建单行文本框，其长度为10。
        jpanel.add(jta);
        contentPane.add(jpanel);
        jframe.setSize(500, 200);
        jframe.setVisible(true);
        jframe.addWindowListener(new WindowAdapter()     // 关闭事件。
        {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

