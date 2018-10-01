package cn.legeyung.study10;

import java.awt.*;

/**
 * 边界布局，
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class NewBorderLayout extends Frame {
    //创建5个按钮，分别代表东、西、南、北、中。
    Button b1 = new Button("东");
    Button b2 = new Button("西");
    Button b3 = new Button("南");
    Button b4 = new Button("北");
    Button b5 = new Button("中");

    NewBorderLayout() {
        //设置窗口容器的名称
        this.setTitle("边界布局管理器示例");
        //设置布局
        this.setLayout(new BorderLayout());
        //添加按钮并设置位置
        this.add(b1, BorderLayout.EAST);
        this.add(b2, BorderLayout.WEST);
        this.add(b3, BorderLayout.SOUTH);
        this.add(b4, BorderLayout.NORTH);
        this.add(b5, BorderLayout.CENTER);
        //设置窗口的显示位置以及大小
        this.setBounds(100, 100, 250, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new NewBorderLayout();
    }
}

