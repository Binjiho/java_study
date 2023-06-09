package org.java.thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerThreadEx extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public TimerThreadEx() {
		setTitle("Timer ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		
		timerLabel.setFont(new Font("Gothic",Font.BOLD,120));
		c.add(timerLabel);
		setSize(500,300);
		setVisible(true);
		
		TimerThread thread = new TimerThread(timerLabel);
		thread.start();
	}
	
	public static void main(String[] args) {
		new TimerThreadEx();
	}
}
