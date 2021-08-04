package Day05;

public class Day05_01 {
	public static void main(String[] args) {
		
		int i=0;
		
		for(i=0;i<10;i++) {
			System.out.print(i);
			
		}
		System.out.println("");
		System.out.println("______________________________");

		for(i=0;i<50;i++) {
			//System.out.print(i);
		}
		for(i=0;i<50;i+=3) {
			//System.out.print(i);
		}
		
		int a=0;
		for(i=1;i<=50;i++) {
			
			a=a+i;			
		}
		System.out.printf("Sum is %d\n",a);
		
		int b=0;
		for(i=0;i<=50;i+=7)
			b=b+i;
		System.out.printf("Sum is %d\n",b);
		
		int c=0;
		for(i=0;i<50;i++) {
			if(i%7==0)
				c+=i;			
		}
		System.out.printf("Sum is %d\n",c);
		
		for(i=1;i<=9;i++) {
			System.out.printf("2 X %d = %d\n",i,(i*2));
		}
		
		System.out.println("-----------------------------------------");
		for(i=2;i<=15;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d\n",i,j,(i*j));
				
			}
		}
		
		
	}

}
