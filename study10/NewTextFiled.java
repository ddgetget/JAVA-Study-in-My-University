package cn.legeyung.study10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

/**
 * 文本域
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class NewTextFiled {
    public static void main(String[] args) {
        Frame f = new Frame("这是一个文本域示例");
        f.setLayout(new GridLayout(2, 3));
        Label lb = new Label("请输入文本");
        lb.setAlignment(Label.RIGHT);
        TextField tf = new TextField();
        tf.setBackground(Color.red);

        f.add(lb);
        f.add(tf);
        f.setSize(200, 160);
        f.setVisible(true);
    }
}
