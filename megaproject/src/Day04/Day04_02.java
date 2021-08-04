package Day04;

import java.util.Scanner;

public class Day04_02 {
	
	public static void main(String[] args) {
		
	
		Scanner var=new Scanner(System.in);
		
		System.out.println("Input ID and PW");
		
		String ID=new String("admin");
		String PW=new String("1234");
		
		String id;
		String pw;
		
		id=var.nextLine();
		pw=var.nextLine();
		
		
		
		if(id.equals(ID)) {
			if(pw.equals(PW)) 
				System.out.println("Login success");
			
			else
				System.out.println("PW is wrong");
			
			}
		else {
			if(pw.equals(PW))
				System.out.println("ID is wrong");
			else
				System.out.println("Login denied");
		}
	}
	
}
