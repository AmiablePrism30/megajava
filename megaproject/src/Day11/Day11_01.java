package Day11;


public class Day11_01 { 
	public static void main(String[] args) {
		
	Remocon remocon;
	remocon=new TV();
	
	remocon.execute();
	remocon.noise_control(5);
	remocon.end();
	
	remocon=new Audio();
	
	remocon.execute();
	remocon.noise_control(15);
	remocon.end();
	
	
	
	
	}
	
	

}
