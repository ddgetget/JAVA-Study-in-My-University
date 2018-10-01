package cn.legeyung.study12;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * 
 * @author Óºçç¸ý(Lege_Yung)
 * 
 */
public class TestMouseMotionListener extends MouseMotionAdapter {
	public void mouseMoved(MouseEvent e, TextField tf) {
		tf.setText("Êó±ê×ø±ê£ºX=" + e.getX() + "Y=" + e.getY());
	}
}
