  
package day15;

import java.awt.Toolkit;

public class Day15_01 {
	
	

	public static void main(String[] args) {
		
		// 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // 경고음 [ 소리내는속도보다 반복문 빠름 ] 
			try {
				Thread.sleep(1000);  // 무조건 예외처리 발생
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 출력 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 스레드 일시정지 [ 밀리초 1000 => 1초 ]
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println("------------- 멀티스레드 클래스 시작 ----------- ");
		// 2. 멀티 스레드 [ 소리와 출력 동시 실행 ] 
		Thread thread = new Sound();
		thread.start();		
		
		// 출력2 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println(" ------------- 멀티스레드 인터페이스 시작 ----------------");
		// 3. 멀티 스레드
		Runnable runnable = new Sound2();
			// runnable : start 메소드 없음 
		Thread thread2 = new Thread(runnable);
			// 해당 쓰레드클래스에 스레드인터페이스 넣기 
		thread2.start();
		
		// 출력3 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		Thread thread3=new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<0;i++) {
					try {
						Thread.sleep(1000);
					}
					catch(Exception e){
						
					}
				}
			}
		});
		
		thread3.start();
		
		for(int i=0;i<0;i++) {
			System.out.println("ming");
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e ) {
				
			}
		}
		
		
		
		
		
		
	}
		
	

}
