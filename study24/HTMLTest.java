package org.gaozou.book.javaabc.examples.ch25;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;

/**
 * @author TuringEmmy
 *
 */
public class HTMLTest extends JFrame {
    private JPanel contentPane;
    private JPanel mainPanel = new JPanel();
    //设置URL输入框
    private JTextField urltext = new JTextField();
    //设置页面显示
    private JEditorPane htmlPanl = new JEditorPane();

    public HTMLTest() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //单击关闭按钮，自动退出程序并释放资源
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void jbInit() throws Exception {
        contentPane = (JPanel) getContentPane();
        //设置布局
        contentPane.setLayout(new BorderLayout());
        mainPanel.setLayout(new BorderLayout());
        //设置提示
        JLabel promptlabel = new JLabel("请输入网址");
        urltext.setText("http://");
        //设置监听器，输入完URL后按Enter键自动获取网页内容
        urltext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPaneContent(urltext.getText());
            }
        });
        //设置htmlPane为不可编辑
        htmlPanl.setEditable(false);
        //添加事件监听器，当单击超链接时会自动获取链接内容
        htmlPanl.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                hyperlinkUpdate(e);
            }
        });
        //添加滚动条
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.getViewport().add(htmlPanl);
        mainPanel.add(urltext, BorderLayout.NORTH);
        mainPanel.add(scrollpane, BorderLayout.CENTER);
        contentPane.add(promptlabel, BorderLayout.NORTH);
        contentPane.add(mainPanel, BorderLayout.CENTER);
        this.setSize(new Dimension(600, 500));
        this.setTitle("浏览器");
        this.setVisible(true);
    }
    //将URL内容显示到htmlPane中

    public void setPaneContent(String url) {
        try {
            htmlPanl.setPage(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "URL地址不正确：" + urltext.getText(), "输入不正确", 0);
        }
    }
    //将超链接内容显示到htmlPane中

    public void hyperLinkUpdate(HyperlinkEvent e) {
        if (e.getEventType() == javax.swing.event.HyperlinkEvent.EventType.ACTIVATED) {
            URL url = e.getURL();
            setPaneContent(url.toString());
        }
    }

    public static void main(String[] args) {
        new HTMLTest();
    }
}

