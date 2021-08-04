package Day11;

public class Car implements Transmission {
	Tyre fltyre = new Tyre("front left",10);
	Tyre frtyre=new Tyre("front right",8);
	Tyre rltyre=new Tyre("rear left",4);
	Tyre rrtyre=new Tyre ("rear right",9);
	
	
	
	public int drive() {
		System.out.println("Drive");
		if(fltyre.revolution()==false) {
			park();
			return 1;//location spilled
		}
		if(frtyre.revolution()==false) {
			park();
			return 2;
		}
		if(rltyre.revolution()==false) {
			park();
			return 3;
		}
		if(rrtyre.revolution()==false) {
			park();
			return 4;
		}
		return 0;
		
		
		
	}
	
	public void park() {
		System.out.println(" Park ");
		
	}
	
	@Override
	public int neutral() {
		System.out.println("Neutral");
		return 0;
	}
	@Override
	public int reverse() {
		System.out.println("reverse");
		if(fltyre.revolution()==false) {
			park();
			return 1;//location spilled
		}
		if(frtyre.revolution()==false) {
			park();
			return 2;
		}
		if(rltyre.revolution()==false) {
			park();
			return 3;
		}
		if(rrtyre.revolution()==false) {
			park();
			return 4;
		}
		
		return 0;
	}

}
