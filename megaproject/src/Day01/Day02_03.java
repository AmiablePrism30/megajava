package Day01;

import java.util.Scanner;

public class Day02_03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input Name and attendance of first student");
		String name1=input.next();
		String fc1=input.next();
		String sc1=input.next();
		String tc1=input.next();
		
		System.out.println("Input Name and attendance of second student");
		String name2=input.next();
		String fc2=input.next();
		String sc2=input.next();
		String tc2=input.next();
		
		System.out.println("\t[[[[[[[[[[Attendance]]]]]]]]]]");
		System.out.println("\tName\tFirst Class\tSecond Class\tThird Class");
		System.out.println("\t"+ name1 + "\t" + fc1 + "\t" + sc1 + "\t" + tc1);
		System.out.println("\t"+ name2 + "\t" + fc2 + "\t" + sc2 + "\t" + tc2);
		
		
	}

}
