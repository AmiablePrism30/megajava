package Day05;

import java.util.Scanner;


public class Day05_02 {

	public static void main(String[] args) {
		System.out.println("Input a number : ");
		Scanner var=new Scanner(System.in);
		
		int a=var.nextInt();
		int i=0;
		
		for(i=1;i<=a;i++) {
			if(i%5==0) {
				System.out.printf("*");
				System.out.printf("\n");
			}
			else
				System.out.printf("*");
		}
		System.out.printf("\n");
		System.out.println("Input a number ");
		
		int b=var.nextInt();
		
		for(i=1;i<=b;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
				
			}
			System.out.printf("\n");
			
		}
		
		
		System.out.println("Input a number");
		int c=var.nextInt();
		
		for(i=c;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
		System.out.printf("Input a number\n");
		int d=var.nextInt();
		
		for(i=1;i<=d;i++) {
			for(int j=1;j<=d-i;j++) {
				System.out.printf(" ");
			}
			for(int k=1;k<=i;k++) {					
				System.out.printf("*");
			}									
			System.out.printf("\n");				
			
		}
		
		System.out.println("Input a number\n");
		
		
		int e=var.nextInt();
		
		for(i=1;i<=e;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.printf(" ");
			}
			for(int k=1;k<=e-i+1;k++) {
				System.out.printf("*");
			}
			
			System.out.printf("\n");
		}
		
		
		
		System.out.println("Input a number");
		int f=var.nextInt();
		for(i=1;i<=f;i++) {
			for(int j=1;j<=(f-i);j++) {
				System.out.printf(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.printf("*");
			}
			System.out.printf("\n");		
			
		}
		
				
		
		
	}
}
