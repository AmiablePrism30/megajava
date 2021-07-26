package Day08;

import java.util.Scanner;

public class Day08_2_Start {
	
	public static Scanner scanner=new Scanner(System.in);
	
	public static Board[] boardlist=new Board[100];
	
	
	public static void main(String[] args) {
			
			start();
			
		
	}
	
	public static void start() {
		
		Board board=new Board();//empty object;
		
		
		while(true) {
			System.out.println("[[[Community]]]");
			board.blist();
			System.out.println("0.write");
			int ch=scanner.nextInt();
			if (ch==0)
				board.bwrite();
			if(ch==1) {
				int ch2=scanner.nextInt();
				System.out.println("[[input the number of post");
				board.bview(ch2);
			}
				
			
			
		}
	}

}

//static == 전역변수