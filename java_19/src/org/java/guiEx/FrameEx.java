package org.java.guiEx;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameEx {

	public static void main(String[] args) {
		System.out.println("Frame");
		
//		Frame f1= new Frame();
//		f1.setTitle("Frame Ex");
//		f1.setSize(500, 300);		
//		// �̺�Ʈ ������ -> �̺�Ʈ�� ���� �ϰ� �� ���Ŀ� �ݹ�Ǵ� �Լ�
//		f1.dispose();// ������ ����  <- �̺�Ʈ�� ���ؼ� ���� 
//		
//		f1.setVisible(true); // ������
		
		System.out.println("JFrame");
		
		//�����̳�
		JFrame j1= new JFrame();		
		j1.setTitle("JFrame Ex");
		
		//������Ʈ		
		JButton jBtn1=new JButton();
		jBtn1.setText("BUTTON1");
		jBtn1.setSize(150, 30);		
		//������Ʈ
		j1.add(jBtn1);
		
		//������Ʈ		
		JButton jBtn2=new JButton();
		jBtn2.setText("BUTTON2");
		jBtn2.setSize(350, 30);		
		//������Ʈ
		j1.add(jBtn2);
		
		JLabel jLabel1= new JLabel();
		jLabel1.setText("��ư:");
		jLabel1.setSize(20, 20);
		j1.add(jLabel1);
		
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		j1.setSize(500,300);
		j1.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
