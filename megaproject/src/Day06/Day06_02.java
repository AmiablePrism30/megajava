package Day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day06_02 {
	
	
	public static void main(String[] args) { 	
		String[] strarr= {"abc","bcd","cde"};
		for(int i=0;i<3;i++) {
			System.out.printf("string array %d is %s\n",i,strarr[i]);
		
		}
		
		
		Scanner var=new Scanner(System.in);
		int end=0;
		
		Integer[] score=null;
		
		while(true) {
			System.out.println("1.number of student  2.input scores  3.analyze  4. Exit ");
			int cn=var.nextInt();
			
			switch(cn) {
			case 1:
				System.out.println("Input a number of students");
				int count=var.nextInt();
				score=new Integer[count];
				System.out.println(count+" lists have been made");
				break;
			case 2:
				System.out.println("Input scores");
				for(int i=0;i<score.length;i++) {
					System.out.printf("input score of %dth student\n",i+1);
					score[i]=var.nextInt();
				}
				break;
			case 3:
				System.out.println("[[Analyze: sort, average]]");
				
				int average=0;
				for(int i=0;i<score.length;i++) {
					average+=score[i];
				}
				System.out.printf("Average is %d\n",average/score.length);
				
				Arrays.sort(score,Collections.reverseOrder());
				
				for(int i=0;i<score.length;i++) {
					System.out.printf("Score of %dth student is %d\n",i+1,score[i]);
					
				}
				break;
			case 4:
				System.out.println("[[Exit]]");
				end=1;
				break;
			default:
				break;
			}
			
			if(end==1)
				break;
		
		
		}
	}
}


