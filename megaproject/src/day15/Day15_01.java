  
package day15;

import java.awt.Toolkit;

public class Day15_01 {
	
	

	public static void main(String[] args) {
		
		// �Ҹ�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++) {
			toolkit.beep(); // ����� [ �Ҹ����¼ӵ����� �ݺ��� ���� ] 
			try {
				Thread.sleep(1000);  // ������ ����ó�� �߻�
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		// ��� 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // ������ �Ͻ����� [ �и��� 1000 => 1�� ]
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println("------------- ��Ƽ������ Ŭ���� ���� ----------- ");
		// 2. ��Ƽ ������ [ �Ҹ��� ��� ���� ���� ] 
		Thread thread = new Sound();
		thread.start();		
		
		// ���2 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
System.out.println(" ------------- ��Ƽ������ �������̽� ���� ----------------");
		// 3. ��Ƽ ������
		Runnable runnable = new Sound2();
			// runnable : start �޼ҵ� ���� 
		Thread thread2 = new Thread(runnable);
			// �ش� ������Ŭ������ �������������̽� �ֱ� 
		thread2.start();
		
		// ���3 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
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
