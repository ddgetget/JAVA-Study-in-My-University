package cn.legeyung.study10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * 流体布局的测试学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class NewFlowLayout extends Frame {
	// 定义两个按钮组件
	Button b1 = new Button("按钮一");
	Button b2 = new Button("按钮二");
	Button b3 = new Button("按钮三");
	Button b4 = new Button("按钮四");

	NewFlowLayout() {
		// 设置窗口名称
		this.setTitle("FlowLayout布局管理器");
		// 设置布局管理器为FlowLayout
		this.setLayout(new FlowLayout());
		// 添加按钮
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		// 设置窗口大小及显示位置
		this.setBounds(100, 100, 250, 250);//来自java.awt 类 Window
		// 设置窗口可见
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NewFlowLayout();
	}
}
