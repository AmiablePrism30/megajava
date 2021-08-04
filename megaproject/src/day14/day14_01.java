package day14;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

public class day14_01 {
	public static void main(String[] args) {
		ZonedDateTime zonedDateTime=ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("UTC "+zonedDateTime);
		ZonedDateTime newyork=zonedDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println("NY "+newyork);
		
		//Math
		
		int a=Math.abs(-5);
		System.out.println("absolute a is "+a);
		double b=Math.abs(-3.14);
		System.out.println("absolute b is "+b);
		
		double c=Math.ceil(5.3);
		System.out.println("round up C is "+c);
		double c2=Math.ceil(-5.3);
		System.out.println("Round up -c is "+c2);
		
		System.out.println("Round downed n is "+Math.floor(5.3));
		System.out.println("Round donwed -n is "+Math.floor(-5.3));
		
		System.out.println("MAX 5,9 "+Math.max(5,9));
		
		Random random=new Random();
		
		System.out.println("Random input "+random.nextInt());
		System.out.println("Random (0~1)"+Math.random());
		
		System.out.println("nearist int "+Math.rint(5.5));
		System.out.println("nearist int -5.5"+Math.rint(-5.5));

		double r4=12.3456;
		System.out.println(Math.round(r4));
		
		double temp=r4*100;
		System.out.println(temp);
		r4=(Math.round(temp))/100.0;
		System.out.println(r4);
		
		Integer arr[]=new Integer[10];
		
		for(int i=0;i<10;i++) {
			int temp1=random.nextInt(9999-0000)+0000;
			arr[i]=temp1;
			
			if(i==0) {
			
				if(arr[i]<1000) {
					
				
					if(arr[i]%2==0) {
						System.out.println((i+1)+"st "+"even number! 0"+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"st "+"Odd number! 0"+arr[i]);
					}
				}
				else {
					if(arr[i]%2==0) {
						System.out.println((i+1)+"st "+"even number! "+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"st "+"Odd number! "+arr[i]);
					}
					
				}
			}
			
			else if(i==1) {
				if(arr[i]<1000) {
					
					
					if(arr[i]%2==0) {
						System.out.println((i+1)+"nd "+"even number! 0"+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"nd "+"Odd number! 0"+arr[i]);
					}
				}
				else {
					if(arr[i]%2==0) {
						System.out.println((i+1)+"nd "+"even number! "+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"nd "+"Odd number! "+arr[i]);
					}
					
				}
			}
			
			else if(i==2) {
				if(arr[i]<1000) {
					
					
					if(arr[i]%2==0) {
						System.out.println((i+1)+"rd "+"even number! 0"+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"rd "+"Odd number! 0"+arr[i]);
					}
				}
				else {
					if(arr[i]%2==0) {
						System.out.println((i+1)+"rd "+"even number! "+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"rd "+"Odd number! "+arr[i]);
					}
					
				}
				
			}
			
			else {
				if(arr[i]<1000) {
					
					
					if(arr[i]%2==0) {
						System.out.println((i+1)+"th "+"even number! 0"+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"th "+"Odd number! 0"+arr[i]);
					}
				}
				else {
					if(arr[i]%2==0) {
						System.out.println((i+1)+"th "+"even number! "+arr[i]);
					}
					
					if(arr[i]%2==1) {
						System.out.println((i+1)+"th "+"Odd number! "+arr[i]);
					}
					
				}
				
			}
			
			
			
		}
		
		String[] cararr=new String[10];
		
		for(int i=0;i<10;i++) {
			cararr[i]=String.format("%04d", random.nextInt(9999));
			
			//System.out.println(cararr[i]);
			
			int lastnumber=Integer.parseInt(cararr[i].substring(3));
			if(lastnumber%2==0) {
				System.out.println((i+1)+"th even number! "+cararr[i]);
			}
			else if(lastnumber%2==1) {
				System.out.println((i+1)+"th odd number! "+cararr[i]);
			}
			
			

		
		}
		
		/**
		 * for(String string : oddcar)
		 * for(자료형 임시객체: 배열명)
		 * 배열 내 인덱스 0번부터 끝까지 하나씩 임시객체에 대입 null은 출력 ㅅ\안함
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
