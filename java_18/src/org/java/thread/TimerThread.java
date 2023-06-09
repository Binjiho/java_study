package org.java.thread;

import javax.swing.JLabel;

public class TimerThread extends Thread{

	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		super();
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int num = 0;
		
		while(true) {
			timerLabel.setText(Integer.toString(num));
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
	
}
