package cn.legeyung.study10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 * 网格布局
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class NewGridLayout {
    public static void main(String[] args) {
        //创建窗口容器并设置
        Frame f = new Frame("这是一个网格布局示例");
        f.setLayout(new GridLayout(3, 3));
        //使用for循环为窗口添加按钮
        for (int i = 0; i < 9; i++) {
            f.add(new Button("按钮" + (i + 1)));

        }
        //设置窗口的大小，以及可见
        f.setSize(200, 200);
        f.setVisible(true);

    }
}
