package org.java.guiEx;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
						// 1. JFrame생성
public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {		
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//2. 레이아웃 설정(컨텐이너==JFrame안의 컴포넌트 배치) 
		setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
		
		//3. 컨텐이너에 컴포넌트 추가
		JButton btn1= new JButton("BUTTON1");
		btn1.setSize(200,50);
		add(btn1);
		add(new JButton("BUTTON2"));
		add(new JButton("BUTTON3"));
		add(new JButton("BUTTON4"));
		//4.컨테이너 크기 설정
		setSize(500, 300);
		// 5.화면에 보여라
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
	
}
