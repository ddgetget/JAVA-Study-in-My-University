package cn.legeyung.study10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 * 面板
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class PanelTest {
    public static void main(String[] args)            //主方法
    {
        Frame f = new Frame("新建Panel");
        Panel p1 = new Panel();
        p1.setBackground(Color.red);

        Panel p2 = new Panel();
        p2.setBackground(Color.blue);

        Panel p3 = new Panel();
        p3.setBackground(Color.yellow);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);
        f.add(p3, BorderLayout.SOUTH);

        f.setSize(200, 200);
        f.setVisible(true);
    }

}

