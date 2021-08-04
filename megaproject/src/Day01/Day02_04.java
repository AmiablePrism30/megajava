package Day01;

import java.util.Scanner;


public class Day02_04 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input First Student Name : ");
		String name1=input.next();
		System.out.println("Input grade of subjects in order");
		int fs1=input.nextInt();
		int ss1=input.nextInt();
		int ts1=input.nextInt();
		
		System.out.println("Input Second Student : ");
		String name2=input.next();
		System.out.println("Input grade of subjects in order ");
		int fs2=input.nextInt();
		int ss2=input.nextInt();
		int ts2=input.nextInt();
		
		System.out.println("\t[[[[[[[[[[[Scoreboard]]]]]]]]]]]]");
		System.out.println("\tName\tKorean\tMath\tEnglish");
		System.out.println("\t"+name1+"\t"+fs1+"\t"+ss1+"\t"+ts1);
		System.out.printf("\t%s\t%d\t%d\t%d\n",name1,fs1,ss1,ts1);
		System.out.println("\t"+name2+"\t"+fs2+"\t"+ss2+"\t"+ts2);
		System.out.printf("\t%s\t%d\t%d\t%d\n",name2,fs2,ss2,ts2);
		
		
		
		
	}
}
