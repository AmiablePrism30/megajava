package Day07;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Day07_02 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int[] userarr=new int[6];
		int[] randarr=new int[6];
		
		int choice;
		for(int i=0;i<6;i++) {
			System.out.println("Input six numbers(1~45)");
			choice=input.nextInt();
			
			if(choice<=0||choice>45) {
				System.out.println("N.A. Input again");
				i--;
			}
			else {
				
				boolean check=true;
				for(int temp:userarr) {
					if(temp==choice) {
						System.out.println("N.A. Input again");
						i--;
						check=false;
						break;
					}					
				}
				if(check) {
					userarr[i]=choice;
				}
			}
			
		}
		System.out.println("Your number is");
		for(int i=0;i<6;i++) {
			System.out.print(" "+userarr[i]);
			
		}
		System.out.println();
		
		
		Random rand=new Random();
				
		for(int i=0;i<6;i++) {
			
			int lottery=rand.nextInt(45)+1;
			
			boolean check=true;
			for(int temp:randarr) {
				if(temp==lottery) {
					i--;
					check=false;
					break;
				}
			
			}
			if(check) {
				randarr[i]=lottery;
			}
			
		}
		System.out.println("Lottery number is ");

		for(int i=0;i<6;i++) {
			System.out.printf(" "+randarr[i]);
			
		}
		System.out.println();
		
		int count=0;

		
		for(int temp:userarr) {
			for(int temp2:randarr) {
				if(temp==temp2)
					count++;
			}
		}
		
		System.out.printf("The number of match is %d\n",count);

		
		/*
		Arrays.sort(userarr);
		Arrays.sort(randarr);
		
		for(int i=0;i<6;i++) {
			if(userarr[i]==randarr[i]) {
				count++;
			}
		}
		System.out.printf("The number of correct number is %d\n",count);
		***/
		
		
	}

}
