package day15;

public class Day15_02 {
	
	public static void main(String[] args) {
		Thread thread1 =new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Puppy barks!");
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
				
			}
		});
		
		Thread thread2 =new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Cat growling");
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
			}
		});
		
		
		Thread thread3 =new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0;i<5;i++) {
					System.out.println("Tiger roars!");
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
			}
		});
		
		
		Thread mainThread=Thread.currentThread();
		
		
		System.out.println("main Thread name : "+ mainThread.getName());
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		System.out.println("Thread 1 name "+thread1.getName());
		
		
	}

}
