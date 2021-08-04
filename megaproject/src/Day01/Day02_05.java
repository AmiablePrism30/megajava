package Day01;

import java.util.Scanner;

public class Day02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("input ID, PW, Name, e-mail");
		String id=input.next();
		int pw=input.nextInt();
		String name=input.next();
		String mail=input.next();
		
		System.out.printf("\tID\tPW\tNAME\te-mail\n");
		System.out.printf("\t%s\t%d\t%s\t%s",id,pw,name,mail);
		
		
	}

}
