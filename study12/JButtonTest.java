package cn.legeyung.study12;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 按钮测试
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class JButtonTest {
	public JButtonTest() {
		JFrame f = new JFrame("打开窗口");// 创建一个JFrame对象，并设置它的标题为"打开窗口"
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		JButton b1 = new JButton("打开一个文本窗口"); // 定义一个按钮组件
		JButton b2 = new JButton("打开一个空窗口");
		b1.setMnemonic('T'); // 设置b1上的键盘助记符为T
		b2.setMnemonic('I'); // 设置b2上的键盘助记符为I
		f.getRootPane().setDefaultButton(b1);
		b1.addActionListener( // 添加监听器
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newf = new JFrame("文字窗口");
				JLabel label = new JLabel("这是一个有文字的窗口");
				label.setHorizontalAlignment(JLabel.CENTER);
				newf.getContentPane().add(label);
				newf.setSize(200, 200);
				newf.show();
			}
		});
		b2.addActionListener( // 添加监听器
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newf = new JFrame("空窗口");// 创建一个JFrame的对象
				JLabel label = new JLabel();
				label.setHorizontalAlignment(JLabel.CENTER);
				newf.getContentPane().add(label);
				newf.setSize(200, 200);// 设置窗口的大小
				newf.show();
			}
		});
		// 将这两个按钮添加到面板中
		contentPane.add(b1);
		contentPane.add(b2);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}
