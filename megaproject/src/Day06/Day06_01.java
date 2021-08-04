package Day06;


import java.util.Scanner;

public class Day06_01 {
	
	public static void main(String[] args) {
		
		int score=80;
		switch(score) {
			case 90:
				System.out.println("90"); break;
			case 80:
				System.out.println("80");break;
			case 70:
				System.out.println("70"); break;
			default:
				System.out.println("Fail"); break;
		
		}
		
		for(int i=0;i<10;i++) {
			System.out.printf("%d",i);
			if(i==1)
				continue;
			if(i==6)
				break;
		}
		
		int i=0;
		System.out.println("");
		while(i<10) {
			System.out.printf("%d",i);
			i++;
		}
		
		
		
		
		
		
	}

}
