package cn.legeyung.study10;

import java.awt.*;

/**
 * 窗体Frame学习，在屏幕上显示一个窗体，缩小电脑屏的一半
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class FrameTest {
	public static void main(String[] args) {
		Frame frame = new NewFrame(); // 创建一个窗体对象
		frame.setVisible(true); // 显示窗体
	}
}

class NewFrame extends Frame // 继承自JFrame类
{
	NewFrame() // 构造函数
	{
		setTitle("这是一个在屏幕的中间位置显示的窗口"); // 设置窗体标题
		Toolkit tk = Toolkit.getDefaultToolkit(); // 取得工具类
		Dimension screenSize = tk.getScreenSize(); // 取得显示器尺寸
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2); // 设置窗体大小
		setLocation(screenWidth / 4, screenHeight / 4); // 设置窗体位置
		this.repaint(); // 重绘窗体
	}
}
