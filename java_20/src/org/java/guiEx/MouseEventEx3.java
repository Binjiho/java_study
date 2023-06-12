package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventEx3 extends JFrame {

	public MouseEventEx3() {
		// 이벤트리스너, 이밴트핸들러
		setTitle("MouseEvent-> MouseListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton jButton = new JButton("BUTTON");
		jButton.addMouseListener(new MouseListener() {
			// 익명 클래스
			@Override
			public void mouseClicked(MouseEvent e) {//click
				System.out.println("click -> 눌렀다.뗐을 때");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Pressed -> 눌렀을 때 <-mouseReleased");//mouseup
			}

			@Override
			public void mouseReleased(MouseEvent e) {		
				System.out.println("Released -> 눌렀다.뗐을 때 <-mousePressed"); //mousedown
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entered -> 마우스를 올렸을 때 <-Exited");// mouseover
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Exited -> 마우스를 벗어났 때 <-Entered");// mouseout
			}

		});

		add(jButton);
		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseEventEx3();
	}

}
