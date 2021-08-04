package Day05;

import java.util.Scanner;

public class Day05_03 {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		int i;
		int j;
		int k;
		System.out.printf("Input a number\n");
		int a=var.nextInt();
		
		for(i=1;i<=a;i++) {
			for(j=1;j<=(a-i);j++) {
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++) {
				System.out.print(i);
			}
			System.out.print("\n");		
			
		}
		
		
		System.out.printf("Input a number");
		int b= var.nextInt();
		
		for(i=1;i<=b;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=b*2-(i*2-1);k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		
		System.out.printf("Input a number");
		
		int c=var.nextInt();
		
		for(i=1;i<=c;i++){
			for(j=i;j<=c;j++) {
				if(i==j)
					System.out.print("*");
				else if((i+j)==(c+1))
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.print("\n");
			
		}
			
		
		
		
	}

}
