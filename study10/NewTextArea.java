package cn.legeyung.study10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;

/**
 * 文本框，在网格布局下
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class NewTextArea {
	public static void main(String[] args) {
		Frame f = new Frame("这是一个多行文本域示例");
		f.setLayout(new GridLayout(2,1));
		Label lb = new Label("请输入文本，可以换行");
		lb.setAlignment(Label.CENTER);
		TextArea tf = new TextArea();
		tf.setBackground(Color.gray);

		f.add(lb);
		f.add(tf);
		f.setSize(200, 160);
		f.setVisible(true);
	}
}
