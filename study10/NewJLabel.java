package cn.legeyung.study10;

import java.awt.Frame;
import java.awt.Label;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class NewJLabel {
	public static void main(String[] args) {
		Frame f = new Frame("标签");

		Label label = new Label("这是一个标签"); // 标签测试
		label.setAlignment(Label.CENTER);

		f.add(label);
		f.setSize(200, 200);
		f.setVisible(true);

	}
}
