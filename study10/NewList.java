package cn.legeyung.study10;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;

/**
 * 列表学习
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class NewList {
    public static void main(String[] args) {
        //创建窗口容器并设置
        Frame f = new Frame("这是一个列表示例");
        f.setLayout(new GridLayout(1, 2));
        Label lb = new Label("请选择右边的年份");
        lb.setAlignment(Label.RIGHT);
        //创建列表
        List list = new List(7, true);
        list.add("2007年");
        list.add("2008年");
        list.add("2009年");
        list.add("2010年");
        //将列表添加到窗口中
        f.add(lb);
        f.add(list);
        //设置窗口可见
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
