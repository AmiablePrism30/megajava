package Day04;

import java.util.Scanner;

public class Day04_03 {
	public static void main(String[] args) {
		
		while(true) {
		
		
			
			while(true) {
				int coke=10;
				int fanta=10;
				int soda=10;
				
				Scanner var=new Scanner(System.in);
				System.out.println("Input money");
				int money=var.nextInt();
					
				System.out.println("[[1.Cola(300)]] \t [[2.Fanta(200)]]\t[[3.Soda(100)]] \t [[Exit]]");
				int choice = var.nextInt();
				
				
				if((money>=100)&&(coke>0)&&(fanta>0)&&(soda>0)) {
								
					if((choice==1)) {
						if(money>=300) {
					
						coke--;
						//money=money-300;
						System.out.printf("You got Cola : %d, Fanta %d, Soda %d, Money : %d\n",(10-coke),(10-fanta),(10-soda),money);
						
						System.out.printf("Left Cola : %d, Fanta %d, Soda %d\n",coke,fanta,soda);
						}
						else {
							System.out.println("Not enough Money for Coke");
							break;	
						}
					}
					
					if((choice==2)) {
						if(money>=200) {
					
						fanta--;
						//money=money-200;
						System.out.printf("Left Cola : %d, Fanta %d, Soda %d, Money : %d\n",coke,fanta,soda,money);
						}
						else {
							System.out.println("Not enough Money for Fanta");
							break;	
						}
					}
					
					if(choice==3) {
						if(money>=100) {
					
						soda--;
						//money=money-100;
						System.out.printf("Left Cola : %d, Fanta %d, Soda %d, Money : %d\n",coke,fanta,soda,money);
						}
						else {
							System.out.println("Not enough Money for Soda");
							break;	
						}
					}
					
					if(choice==4) {
						System.out.printf("You've got ");
						System.out.printf("Cola : %d, Fanta %d, Soda %d\n",(10-coke),(10-fanta),(10-soda));
						int bill;
						bill=((10-coke)*300)+((10-fanta)*200)+((10-soda)*100);
						System.out.printf("Total Money is %d\n",bill);
						System.out.println("Press 1 to Confirm");
						int a=var.nextInt();
						if(a==1) {
							System.out.println("Thank you");
							money=money-bill;
							System.out.printf("%d$ has left.",money);
							break;
							
						}
						else {
							System.out.println("Thank you");
							System.out.println("Money will be returned");
							System.out.printf("%d$ has left",money);
														
						}
						
					}
									
				}
					
						
				else {
					System.out.println("Not enough Money or Not enough left");
					break;
				}	
					
			}
		}
	}
}
		
		
	


