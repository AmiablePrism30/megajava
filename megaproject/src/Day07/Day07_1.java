package Day07;

import java.util.Scanner;

public class Day07_1 {
	public static void main(String[] args) {
		
		Integer[] arr=new Integer[100];
		for(int i=0;i<100;i++) {
			arr[i]=i;
		}
		for(int i=0;i<100;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		for(int temp:arr) {
			System.out.print(temp+" ");
		}
		
		System.out.println();
		
		int[][] arr4=new int[2][50];
		
		for(int i=0;i<100;i++) {
			if(i<50) {
				arr4[0][i]=i;
			}
			else
				arr4[1][i-50]=i;
		}
		for(int i=0;i<100;i++) {
			if(i<50)System.out.print(arr4[0][i]+" ");
			else System.out.print(arr4[1][i-50]+" ");
		}
		
		
		int[][][]arr5=new int [2][3][3];
		
			
			
		
		
		
	}

}
