package cn.legeyung.study12;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author Óºçç¸ý(Lege_Yung)
 * 
 */
public class MyMouseTest {
	private Frame f;
	private TextField tf;

	public static void main(String[] args) {

		MouseInnerTest mit = new MouseInnerTest();
		mit.show();

	}

	public MyMouseTest() {
		f = new Frame("¼àÌýÆ÷");
		tf = new TextField();
	}

	public void show() {
		f.add(tf, "North");
		f.setVisible(true);
		f.addMouseMotionListener(new TestMouseMotionListener());
		f.setSize(300, 240);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.setVisible(false);
				f.dispose();
				System.out.println("ÍË³ö");
				System.exit(0);
			}
		});
	}
}
