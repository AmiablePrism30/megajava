package Day11;

import java.util.Scanner;


public class Day11_03 {
	
	public static void main(String[] args) {
		Kiosk kiosk=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1.Lotteria 2.Cafe");
		
		int connecter = scanner.nextInt();
		
		if(connecter==1)
			kiosk=new Lotteria();
		if(connecter ==2)
			kiosk=new Cafe();
		
		while(true) {
			System.out.println("Kiosk");
			System.out.println("1. menu 2. Basket 3. Pay 4. Exit");
			
			int choice=scanner.nextInt();
			
			if(choice==1)
				kiosk.menu();
			if(choice==2)
				kiosk.shopper_bag();
			if(choice==3)
				kiosk.payment();
			if(choice==4) {
				kiosk.end();
				break;
			}
		}
	}
	
	

}
