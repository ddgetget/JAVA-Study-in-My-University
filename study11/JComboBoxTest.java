package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

/**
 * @author TuringEmmy
 *
 */
public class JComboBoxTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JComboBoxDemo1");    // 创建一个JFrame对象
        Container contentPane = jf.getContentPane();        // 定义一个容器
        contentPane.setLayout(new GridLayout(1, 2));
        // 定义一个字符串数组，并将其初始化
        String[] str = {"故宫", "泰山", "张家界", "颐和园", "孔府"};
        Vector vector = new Vector();            //创建一个Vector对象
        //向Vector对象中添加数据
        vector.addElement("北京");
        vector.addElement("上海");
        vector.addElement("青岛");
        vector.addElement("广州");
        vector.addElement("成都");
        vector.addElement("西安");
        JComboBox combo1 = new JComboBox(str);    // 定义一个JComboBox17	对象
        // 利用JComboBox类所提供的addItem()方法，加入一个项目到此JComboBox19	中。
        combo1.addItem("泰山");
        //创建一个带有指定标题的标题框
        combo1.setBorder(BorderFactory.createTitledBorder("你想去哪个景点游玩？"));
        JComboBox combo2 = new JComboBox(vector);
        combo2.setBorder(BorderFactory.createTitledBorder("你喜欢的城市"));
        contentPane.add(combo1);
        contentPane.add(combo2);
        jf.pack();
        jf.show();
        jf.addWindowListener(new WindowAdapter() {        // 添加窗口监听器

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
