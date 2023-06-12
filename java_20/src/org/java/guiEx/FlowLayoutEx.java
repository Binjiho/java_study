package org.java.guiEx;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
						// 1. JFrame����
public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {		
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//2. ���̾ƿ� ����(�����̳�==JFrame���� ������Ʈ ��ġ) 
		setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
		
		//3. �����̳ʿ� ������Ʈ �߰�
		JButton btn1= new JButton("BUTTON1");
		btn1.setSize(200,50);
		add(btn1);
		add(new JButton("BUTTON2"));
		add(new JButton("BUTTON3"));
		add(new JButton("BUTTON4"));
		//4.�����̳� ũ�� ����
		setSize(500, 300);
		// 5.ȭ�鿡 ������
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
	
}
