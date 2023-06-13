package org.java.guiEx;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{

	public GridLayoutEx() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4�� 2�� �׸��� ����
		GridLayout g1= new GridLayout(4,2);
		g1.setHgap(10);// ���� ����
		g1.setVgap(20);// ���� ����
		
//		setLayout(g1);// ���̾ƿ� ����		
		//JPanel  
		JPanel jPanel= new JPanel(g1); // JPanel
		
		jPanel.add(new JLabel("����"));
		jPanel.add(new JTextField(""));
		
		jPanel.add(new JLabel("��¥"));
		jPanel.add(new JTextField(""));
		
		jPanel.add(new JLabel("�̸�"));
		jPanel.add(new JTextField(""));
		
		jPanel.add(new JLabel("���"));
		jPanel.add(new JTextField(""));
		
		add(jPanel);// JPanel -> JFrame�� �߰�
		
		setSize(500, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
