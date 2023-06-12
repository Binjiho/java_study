package org.java.guiEx;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	public BorderLayoutEx() {
	
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 동서남북 위치
		setLayout(new BorderLayout());
		
		add(new JButton("CENTER"),BorderLayout.CENTER);
		add(new JButton("EAST"),BorderLayout.EAST);
		add(new JButton("WEST"),BorderLayout.WEST);
		add(new JButton("SOUTH"),BorderLayout.SOUTH);
		add(new JButton("NORTH"),BorderLayout.NORTH);
		
		setSize(500, 300);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
