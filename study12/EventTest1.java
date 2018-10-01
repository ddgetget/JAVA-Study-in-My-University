package cn.legeyung.study12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 事件监听
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class EventTest1 extends WindowAdapter implements ActionListener {
	JButton b1 = null;
	JButton b2 = null;

	public EventTest1() { // 构造方法
		JFrame f = new JFrame("EventTest1"); // 创建一个框架
		Container contentPane = f.getContentPane(); // 获得一个窗口容器
		contentPane.setLayout(new GridLayout(1, 2)); // 设置布局方式（网格布局）
		b1 = new JButton("关闭窗口"); // 创建一个关闭窗口的按扭
		b2 = new JButton("打开窗口"); // 创建一个打开新窗口的按扭
		// 为按扭添加事件监听
		b1.addActionListener(this);
		b2.addActionListener(this);
		// 往容器中添加按扭组件
		contentPane.add(b1);
		contentPane.add(b2);
		f.pack(); // 将窗口调节到适当的大小
		f.show(); // 显示窗口
		f.addWindowListener(this); // 添加窗口事件监听
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) // 利用getSource判断哪个按钮被按下了。
			Toolkit.getDefaultToolkit().beep();
		if (e.getSource() == b2) {
			JFrame jf = new JFrame("新窗口");
			jf.setSize(200, 200);
			jf.show();
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String args[]) {
		new EventTest1();
	}
}
