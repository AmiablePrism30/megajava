package day15;

import java.util.Scanner;

public class Day15_05 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		boolean sw=true;
		
		
		while(true) {
			System.out.println("1. Music    2. Movie");
			int ch=scanner.nextInt();
			if(ch==1) {
				Thread thread = new Music();

				
				if(sw) {
					Music.Musicstop(sw);
					thread.start();
					//thread.stop();
					sw=false;
				}
				
			}
			
		}
		
		
		
		
	}

}
