package org.java.guiEx;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//외부에 클래스를 생성           -> MouseListener 인터페이스
class MouseEventListener implements MouseListener{

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
	
}
public class MouseEventEx1 extends JFrame{

	public MouseEventEx1() {		
		
		// 이벤트리스너, 이밴트핸들러
		setTitle("MouseEvent-> MouseListener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		// JButton 마우스 이벤트를 구현
		JButton jButton= new JButton("Mouse Event");
		jButton.setBackground(Color.YELLOW);//배경색
		
		//마우스 이벤트 리스너 생성
		MouseEventListener listener1=new MouseEventListener();
		
		jButton.addMouseListener(listener1);
		
		add(jButton);
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new MouseEventEx1();
	}
	
}
