package cn.legeyung.study10;

import java.awt.*;

/**
 * 卡片布局学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class NewCardLayout {
	public static void main(String[] args) {
		// 创建Frame并设置布局
		Frame f = new Frame("卡片布局管理器示例");
		f.setLayout(new CardLayout());
		// 创建两个按钮，并添加到窗口中
		f.add(new Button("按钮一"), "card1");
		f.add(new Button("按钮二"), "card2");
		// 设置窗口的显示大小及位置
		f.setBounds(100, 100, 250, 250);
		f.setVisible(true);
	}
}
