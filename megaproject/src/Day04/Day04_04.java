package Day04;


import java.util.Scanner;

public class Day04_04 {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		
		System.out.println("Input two cards");
		String a;
		String b;
		a=var.nextLine();
		b=var.nextLine();
		
		if(a.equals("rock")) {
			if(b.equals("rock"))
				System.out.println("tied");
			else if(b.equals("scissor"))
				System.out.println("First player has won");
			else if(b.equals("paper"))
				System.out.println("Second player has won");
			else
				System.out.println("N.A.");
		}
		else if(a.equals("scissor")) {
			if(b.equals("rock"))
				System.out.println("Second player has won");
			else if(b.equals("scissor"))
				System.out.println("tied");
			else if(b.equals("paper"))
				System.out.println("First player has won");
			else
				System.out.println("N.A.");
		}
		
		else if(a.equals("paper")) {
			if(b.equals("rock"))
				System.out.println("First player has won");
			else if(b.equals("scissor"))
				System.out.println("Second player has won");
			else if(b.equals("paper"))
				System.out.println("tied");
			else
				System.out.println("N.A.");
			
		}
		else
			System.out.println("N.A.");
			
	}

}
