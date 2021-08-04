package Day11;

public class Tyre {
	
	int length;
	int rev;
	String location;
	
	public Tyre (String location,int length) {
		this.length=length;
		this.location=location;
		
		
	}
	
	public boolean revolution() {
		rev++;
		if(rev<length) {
			System.out.println(location+" tyre length " + length );
			return true;
		}
		else {
			System.out.println(location+" Tyre lenght "+length);
			return false;
		}
			
		
	}

}
