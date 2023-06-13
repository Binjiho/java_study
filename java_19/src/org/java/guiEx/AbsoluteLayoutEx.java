package org.java.guiEx;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AbsoluteLayoutEx  {

	public static void main(String[] args) {
		
		JFrame jFrame= new JFrame();
		jFrame.setTitle("AbsoluteLayout");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel= new JPanel();
		
//- void setLocation(int x, int y)        // ������Ʈ ��ġ ����
// - void setBounds(int x, int y, int width, int height)   // ��ġ�� ũ�� ���� ����
		   
		jPanel.setLayout(null);
		
		JLabel jLabel= new JLabel("�̸�");
		JTextField jTextField= new JTextField();
		JButton jButton1= new JButton("BUTTON1");
		JButton jButton2= new JButton("BUTTON2");
		jLabel.setBounds(20, 20, 120, 30);
		jTextField.setBounds(50, 20, 120, 30);
		jButton1.setBounds(60, 30, 120, 30);
		jButton2.setBounds(80, 50, 120, 30);
		
		jPanel.add(jLabel);
		jPanel.add(jTextField);
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		
		jFrame.add(jPanel);
		jFrame.setSize(500, 300);
		jFrame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
