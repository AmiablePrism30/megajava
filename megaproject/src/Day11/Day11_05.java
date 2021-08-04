package Day11;

public class Day11_05 {
	public static void main(String[] args) {
		
		Car car=new Car();
		Sedan car2=new Sedan();
		SUV car3=new SUV();
		
		for(int i=1;i<10;i++) {
			int index=car.drive();
			int index2=car2.drive();
			int index3=car3.drive();
			
			switch(index3) {
			case 1:
				System.out.println("[[Tyre replace]]");
				car.fltyre=new kumho("front left tyre",10);
				break;
				
			case 2:
				System.out.println("[[Tyre replace]]");
				car.frtyre=new kumho("front right tyre",10);
				break;
			
			case 3:
				System.out.println("[[Tyre replace]]");
				car.rltyre=new kumho("rear left tyre",10);
				break;
				
			case 4:
				System.out.println("[[Tyre replace]]");
				car.rrtyre=new kumho("rear right tyre",10);
				break;
			}
			
		}
	}

}
