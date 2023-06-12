package org.java.guiEx;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventEx2 extends JFrame {

	JLabel jLabel=null;
	
	
	public MouseEventEx2() {
		// 이벤트리스너, 이밴트핸들러
		setTitle("MouseEvent-> MouseListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton jButton= new JButton("BUTTON1");
		jButton.addMouseListener(new MouseEventListener2());
		
		jLabel=new JLabel("Test");
		jLabel.setBackground(Color.GRAY);
		jLabel.setSize(50, 50);
		
		add(jLabel);
		add(jButton);
		setSize(500, 300);
		setVisible(true);		
	}
	//내부클래스
	class MouseEventListener2 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {
				int x=e.getX();// x좌표
				int y=e.getY();// Y좌표
				System.out.println(x+" , "+y);
				jLabel.setLocation(x, y);
		}
		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("mouseEntered");
			jLabel.setBackground(Color.BLUE);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {	
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		new MouseEventEx2();
	}

}
