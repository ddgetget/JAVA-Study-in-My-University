package cn.legeyung.study11;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 复选框
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class JCheckBoxTest {
    JFrame f = null;

    JCheckBoxTest() {
        f = new JFrame("复选框示例");        // 创建一个JFrame实例对象
        Container contentPane = f.getContentPane();    // 定义一个容器
        contentPane.setLayout(new GridLayout(2, 1));    // 设置窗口的布局
        
        JPanel p1 = new JPanel();                // 创建一个面板对象p1
        p1.setLayout(new GridLayout(1, 3));
        p1.setBorder(BorderFactory.createTitledBorder("选择你想要去的城市？"));
        JCheckBox c1 = new JCheckBox("北京");
        JCheckBox c2 = new JCheckBox("深圳");
        JCheckBox c3 = new JCheckBox("青岛");
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);

        contentPane.add(p1);

        
        JPanel p2 = new JPanel();                // 创建一个面板对象p1
        p1.setLayout(new GridLayout(1, 3));
        p1.setBorder(BorderFactory.createTitledBorder("选择你想要去的城市？"));
        JCheckBox c4 = new JCheckBox("北京");
        JCheckBox c5 = new JCheckBox("深圳");
        JCheckBox c6 = new JCheckBox("青岛");
        p2.add(c4);
        p2.add(c5);
        p2.add(c6);

        contentPane.add(p2);
        
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {        // 创建一个窗口监听器

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new JCheckBoxTest();
    }
}

