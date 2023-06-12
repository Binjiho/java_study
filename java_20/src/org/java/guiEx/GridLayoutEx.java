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
		// 4행 2열 그리드 생성
		GridLayout g1= new GridLayout(4,2);
		g1.setHgap(10);// 수평 여백
		g1.setVgap(20);// 수작 여백
		
//		setLayout(g1);// 레이아웃 설정		
		//JPanel  
		JPanel jPanel= new JPanel(g1); // JPanel
		
		jPanel.add(new JLabel("제목"));
		jPanel.add(new JTextField(""));
		
		jPanel.add(new JLabel("날짜"));
		jPanel.add(new JTextField(""));
		
		jPanel.add(new JLabel("이름"));
		jPanel.add(new JTextField(""));
		
		jPanel.add(new JLabel("장소"));
		jPanel.add(new JTextField(""));
		
		add(jPanel);// JPanel -> JFrame에 추가
		
		setSize(500, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
