package Day06;

import java.util.Scanner;
import java.util.Random;

public class Day06_03 {
	public static void main(String[] args) {
		
		Scanner var=new Scanner(System.in);
		Random random = new Random();
		//tictacto game
		
		String[] board= {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		int i;
		
		while(true) {
			for(i=0;i<board.length;i++) {
				System.out.printf(board[i]);
				if(i%3==2)
					System.out.println("");				
			}
			while(true) {
				System.out.println("choose a location");
				int index= var.nextInt();
				if(board[index].equals("[ ]")) {
					board[index]="[O]";
					break;
				}
				else {
					System.out.println("Already exists");
					
				}
			}
			while(true) {
				int ranidx=random.nextInt(9);
				if(board[ranidx]=="[ ]") {
					board[ranidx]="[X]";
					break;
				}
				
				
			}
			
			if(board[0]==board[1]&&board[1]==board[2]) {
				if(board[0]=="[O]")
					System.out.println("Player win!");
				else if(board[0]=="[X]")
					System.out.println("Cpu win!");
			}
			if(board[0]==board[3]&&board[3]==board[6]) {
				if(board[0]=="[O]")
					System.out.println("Player win!");
				else if(board[0]=="[X]")
					System.out.println("Cpu win!");
			}
		}
			
	}

}
