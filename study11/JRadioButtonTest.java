package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author TuringEmmy
 *
 */
public class JRadioButtonTest {
    JFrame f = null;
    JRadioButton r4 = null;
    JRadioButton r5 = null;

    JRadioButtonTest() {
        f = new JFrame("单选框示例");            // 创建一个JFrame的对象
        Container contentPane = f.getContentPane();    // 创建一个容器
        contentPane.setLayout(new GridLayout(2, 1));    // 设置这个窗口的布局
        JPanel p1 = new JPanel();                    // 创建一个面板对象p1
        p1.setLayout(new GridLayout(1, 3));        // 设置布局管理器的格式
        p1.setBorder(BorderFactory.createTitledBorder("选择你喜欢的城市"));
        // 定义3个JRadioButton单选按钮
        JRadioButton r1 = new JRadioButton("北京");
        JRadioButton r2 = new JRadioButton("上海");
        JRadioButton r3 = new JRadioButton("青岛");
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1));
        contentPane.add(p1);
        contentPane.add(p2);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {// 添加一个窗口监听器

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new JRadioButtonTest();
    }
}

