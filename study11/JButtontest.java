package cn.legeyung.study11;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * JButton学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class JButtontest {
	public static void main(String[] args) {
		JFrame f = new JFrame("这是一个按钮");
		Container contentPane = f.getContentPane();
		JButton b = new JButton("按钮");// 创建一个带初始文本的按钮。
		// 如果没有设置文字的位置，系统默认值会将文字置于图形的右边中间位置。
		// 设置文本相对于图标的水平方向的位置。
		b.setHorizontalTextPosition(JButton.CENTER);
		// 设置文本相对于图标的垂直方向的位置。
		b.setVerticalTextPosition(JButton.BOTTOM);
		contentPane.add(b);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
