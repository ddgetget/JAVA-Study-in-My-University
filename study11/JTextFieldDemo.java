package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class JTextFieldDemo {
    public static void main(String args[]) {
        JFrame jframe = new JFrame("文本框和密码框示例");
        Container contentPane = jframe.getContentPane();// 返回窗体容器。
        contentPane.setLayout(new BorderLayout());     // 设置窗体容器布局。
        JPanel jpanel = new JPanel();                 // 声明面板容器。
        jpanel.setLayout(new GridLayout(3, 2));             // 设置面板布局。
        jpanel.setBorder(BorderFactory.createTitledBorder("请输入你的登陆信息"));
        // 设置面板边界。
        JLabel lable1 = new JLabel("用户名：", JLabel.CENTER); // 创建标签。
        JLabel lable2 = new JLabel("密码：", JLabel.CENTER);
        JTextField t1 = new JTextField(10);         // 创建单行文本框，其长度为10。
        JPasswordField t2 = new JPasswordField(10);
        jpanel.add(lable1);         // 将标签及单行文本框依次添加到面板中。
        jpanel.add(t1);
        jpanel.add(lable2);
        jpanel.add(t2);
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

