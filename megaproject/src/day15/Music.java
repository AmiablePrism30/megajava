package day15;

public class Music extends Thread {
	
	static boolean musicswitch=true;
	
	
	public static void Musicstop(boolean sw) {
		musicswitch =sw;
		
		if(musicswitch==true) {
			System.out.println("Music playing");
			
		}
		else {
			System.out.println("Music stop");
		}
		
	}
	@Override
	public void run() {
	
		while(musicswitch) {
			System.out.println("Music playing");
			
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e){
				
			}
			
		}
	}

}
