package cn.legeyung.study11;

import javax.swing.*;
import java.awt.*;

/**
 * @author TuringEmmy
 *
 */
public class JFrameTest extends JFrame {
    public JFrameTest() {
        setSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setVisible(true);

    }

    public static final int WIDTH = 300;
    public static final int HEIGH = 200;

}

