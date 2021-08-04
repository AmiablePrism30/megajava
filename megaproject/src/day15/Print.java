package day15;

public class Print extends Thread{
	
	public Print(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0;i<2000000000;i++) {
			
		}
		System.out.println(getName());
		
	}
	

}
