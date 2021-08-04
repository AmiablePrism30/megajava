package day15;

import java.awt.Toolkit;

public class Sound extends Thread {
				// extends 클래스명 : 상속 
	
	@Override
	public void run() { // 멀티스레드 메소드 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ;i++ ) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
