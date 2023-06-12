package org.java.guiEx;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Swing_01 extends JFrame implements ActionListener {

	JButton jButton = null;
	JMenuItem jMenuItem1;
	JMenuItem jMenuItem2;
	JMenuItem jMenuItem3;

	public Swing_01() {

		setTitle("Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JMenuBar jMenuBar = new JMenuBar();

		JMenu jMenu = new JMenu("메뉴1");
		jMenuItem1 = new JMenuItem("menu1");
		jMenuItem2 = new JMenuItem("menu2");
		jMenuItem3 = new JMenuItem("새창열기");

		jButton = new JButton("BUTTON");

		jMenu.add(jMenuItem1);
		jMenu.add(jMenuItem2);
		jMenu.add(jMenuItem3);

		JMenu jMenu2 = new JMenu("메뉴2");
		JMenu jMenu3 = new JMenu("메뉴2");

		jMenuBar.add(jMenu);
		jMenuBar.add(jMenu2);
		jMenuBar.add(jMenu3);

		this.add(jMenuBar);
		this.add(jButton);

		setSize(800, 500);
		setVisible(true);

		// 여러 객체의 이벤트를 적용하는 방법
		jButton.addActionListener(this);
		jMenuItem1.addActionListener(this);
		jMenuItem2.addActionListener(this);
		jMenuItem3.addActionListener(this);
	}

	public static void main(String[] args) {
		new Swing_01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jButton) {
			System.out.println("jButton");
			this.setVisible(false);
			
		} else if (e.getSource() == jMenuItem1) {
			System.out.println("jMenuItem1");

		} else if (e.getSource() == jMenuItem2) {
			System.out.println("jMenuItem2");

		} else if (e.getSource() == jMenuItem3) {
			System.out.println("jMenuItem3");			
			dialPop();
		}
	}

	private void dialPop() {		
		JPanel jPanel=new JPanel();
		Dialog dialog= new Dialog(this,"새창");
		
		dialog.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		JButton closeBtn=new JButton("Close");
		closeBtn.setSize(100, 30);
		
		jPanel.add(closeBtn);
		dialog.add(jPanel);
		
		dialog.setSize(500,300);
		dialog.setVisible(true);
		//close 버튼 클릭 하면 다이얼로그 닫기
		closeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(false);				
			}
		});
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
