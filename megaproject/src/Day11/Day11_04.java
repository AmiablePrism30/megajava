package Day11;

import java.util.Scanner;


public class Day11_04 {
	public static void main(String[] args) {
		
		ATM atm=null;
		Scanner scanner=new Scanner(System.in);
		
		atm=new Bank();
		
		while(true) {
			System.out.println("1.Sinhan 2.Kookmin");
			
			int connecter =scanner.nextInt();
			
			if(connecter ==1)
				atm.Menu();
			if(connecter ==2)
				atm=new Kookmin();
			
			
				
				
		}
	}
}


