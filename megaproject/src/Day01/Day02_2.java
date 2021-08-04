package Day01;

import java.util.Scanner;

public class Day02_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer :");
		int inputnumber;
		inputnumber = input.nextInt();
		System.out.println("The Input integer is : "+ inputnumber);
		
		System.out.println("Input a string : ");
		String arr = input.next();
		System.out.println("The input string is : "+ arr);
		
		
		input.nextLine();
		System.out.println("input with space : ");
		String str=input.nextLine();
		System.out.println("The input string is : "+str);
		
		
		
	}

}
