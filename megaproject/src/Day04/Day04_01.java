package Day04;


import java.util.Scanner;

public class Day04_01 {

	public static void main(String[] args) {
		Scanner var =new Scanner(System.in);
		
		System.out.println("Input four numbers : ");
		
		int a=var.nextInt();
		int b=var.nextInt();
		int c=var.nextInt();
		int d=var.nextInt();
		
		if(a>b) {
			int tmp;
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a>c) {
			int tmp=a;
			a=c;
			c=tmp;
						
		}
		if(a>d) {
			int tmp=a;
			a=d;
			d=tmp;
		}
		
		if(b>c) {
			int tmp=b;
			b=c;
			c=tmp;
		}
		if(b>d) {
			int tmp=b;
			b=d;
			d=tmp;
		}
		if(c>d) {
			int tmp=c;
			c=d;
			d=tmp;
		}
		
		System.out.println("Ascending orders "+ a + b + c + d);
		
		
	}
}
