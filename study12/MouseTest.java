package cn.legeyung.study12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class MouseTest extends WindowAdapter implements MouseListener {
	JFrame jfarme = null;
	JButton button1 = null;
	JLabel label = null;

	public MouseTest() {
		jfarme = new JFrame("鼠标事件示例"); // 创建一个框架
		Container contentPane = jfarme.getContentPane(); // 获得一个窗口容器
		contentPane.setLayout(new GridLayout(2, 1));// 设置布局方式
		button1 = new JButton("按钮"); // 创建一个按扭
		label = new JLabel("起始状态，还没有鼠标事件", JLabel.CENTER);// 创建一个文本标签
		button1.addMouseListener(this); // 为按扭添加事件监听
		contentPane.add(label);
		contentPane.add(button1);
		jfarme.pack(); // 将窗口调节到适当的大小
		jfarme.show(); // 显示窗口
		jfarme.addWindowListener(this); // 添加窗口事件监听
	}

	public void mousePressed(MouseEvent e) { // 激发按下鼠标事件
		label.setText("你已经按下鼠标按钮");
	}

	public void mouseReleased(MouseEvent e) { // 激发释放鼠标按键
		label.setText("你已经抬起鼠标按钮");
	}

	public void mouseEntered(MouseEvent e) { // 鼠标进入组件时调用
		label.setText("光标已经进入按钮");
	}

	public void mouseExited(MouseEvent e) { // 鼠标离开组件时调用
		label.setText("光标已经离开按钮");
	}

	public void mouseClicked(MouseEvent e) { // 鼠标在组件上单击时调用
		label.setText("你单击按钮");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new MouseTest();
	}
}
