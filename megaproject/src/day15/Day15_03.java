package day15;

public class Day15_03 {
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Thread thread =new Print("Thread number "+i);
			
			if(i!=9) {
				thread.setPriority(Thread.MIN_PRIORITY);
				
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
			
		}
	}

}
