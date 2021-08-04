package Day11;

public interface Kiosk {
	
	public void menu();
	public void shopper_bag();
	public void payment();
	
	public default void end() {
		
	}
	

}
