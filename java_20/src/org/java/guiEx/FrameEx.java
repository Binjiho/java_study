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
//		// 이벤트 리스너 -> 이벤트를 실행 하고 난 이후에 콜백되는 함수
//		f1.dispose();// 윈도우 종료  <- 이벤트를 통해서 종료 
//		
//		f1.setVisible(true); // 보여라
		
		System.out.println("JFrame");
		
		//컨테이너
		JFrame j1= new JFrame();		
		j1.setTitle("JFrame Ex");
		
		//콤포넌트		
		JButton jBtn1=new JButton();
		jBtn1.setText("BUTTON1");
		jBtn1.setSize(150, 30);		
		//콤포넌트
		j1.add(jBtn1);
		
		//콤포넌트		
		JButton jBtn2=new JButton();
		jBtn2.setText("BUTTON2");
		jBtn2.setSize(350, 30);		
		//콤포넌트
		j1.add(jBtn2);
		
		JLabel jLabel1= new JLabel();
		jLabel1.setText("버튼:");
		jLabel1.setSize(20, 20);
		j1.add(jLabel1);
		
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		j1.setSize(500,300);
		j1.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
