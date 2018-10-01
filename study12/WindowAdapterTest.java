package cn.legeyung.study12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author Óºçç¸ý(Lege_Yung)
 * 
 */
public class WindowAdapterTest {
	public static void main(String[] args) {

		Frame fra = new Frame("´°¿Ú¹Ø±ÕÊ¾Àý");
		fra.setSize(200, 200);
		fra.setVisible(true);
		fra.addWindowListener(new WindowClose());
	}
}

class WindowClose extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(1);

	}
}
