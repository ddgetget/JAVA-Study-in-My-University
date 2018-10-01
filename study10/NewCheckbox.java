package cn.legeyung.study10;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

/**
 * 复选框学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */

public class NewCheckbox {
	public static void main(String[] args) {
		Frame f = new Frame("Checkbox示例");
		f.setLayout(new GridLayout(2, 3));
		Label lb = new Label("个人爱好");

		Checkbox c1 = new Checkbox("读书");
		Checkbox c2 = new Checkbox("打球");
		Checkbox c3 = new Checkbox("上网");
		Checkbox c4 = new Checkbox("看电视");
		Checkbox c5 = new Checkbox("游泳");

		f.add(lb);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(c5);

		f.setSize(500, 150);
		f.setLocation(200, 200);
		f.setVisible(true);

	}
}
