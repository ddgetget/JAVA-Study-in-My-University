package cn.legeyung.study10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 流式布局学习，自动添加按钮
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class FlowLayoutTest extends Frame implements ActionListener {
	Button b = new Button("添加");
	int i;

	FlowLayoutTest() {
		// 设置窗口名称
		this.setTitle("FlowLayout布局管理器");
		// 设置布局管理器为FlowLayout
		this.setLayout(new FlowLayout());
		// 添加按钮
		this.add(b);
		b.addActionListener(this);
		// 设置窗口大小
		this.setBounds(100, 100, 250, 250);
		// 设置窗口可见
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}

	public void actionPerformed(ActionEvent e) {

		i++;
		Button bi = new Button("按钮" + i);
		this.add(bi);
		this.show(true);

	}
}
