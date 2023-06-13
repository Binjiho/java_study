package org.java.guiEx;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventEx3 extends JFrame {

	public MouseEventEx3() {
		// �̺�Ʈ������, �̹�Ʈ�ڵ鷯
		setTitle("MouseEvent-> MouseListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton jButton = new JButton("BUTTON");
		jButton.addMouseListener(new MouseListener() {
			// �͸� Ŭ����
			@Override
			public void mouseClicked(MouseEvent e) {//click
				System.out.println("click -> ������.���� ��");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Pressed -> ������ �� <-mouseReleased");//mouseup
			}

			@Override
			public void mouseReleased(MouseEvent e) {		
				System.out.println("Released -> ������.���� �� <-mousePressed"); //mousedown
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Entered -> ���콺�� �÷��� �� <-Exited");// mouseover
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Exited -> ���콺�� ��� �� <-Entered");// mouseout
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
