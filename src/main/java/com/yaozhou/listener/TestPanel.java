package com.yaozhou.listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by WXHang on HANG at 2021/6/19 12:22
 * @author HANG
 */
public class TestPanel{
    public static void main(String[] args) {
        //新建一个窗体
        Frame frame = new Frame("hello_world");
        //面板
        Panel panel = new Panel(null);
        //设置窗体布局
        frame.setLayout(null);

        frame.setBounds(300,300,600,600);
        frame.setBackground(new Color(0,0,123));

        panel.setBounds(100,100,300,300);
        panel.setBackground(new Color(0,0,233));

        frame.add(panel);
        //设置窗体可见性
        frame.setVisible(true);

        //监听关闭时间
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("打开窗口");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("关闭ing");
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("关闭ed");
            }

            public void windowIconified(WindowEvent e) {

            }

            public void windowDeiconified(WindowEvent e) {

            }

            public void windowActivated(WindowEvent e) {
                System.out.println("激活");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("未激活");
            }
        });
    }
}