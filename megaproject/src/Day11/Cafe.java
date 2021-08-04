package Day11;

public class Cafe implements Kiosk {
	
	@Override
	public void menu() {
		System.out.println("Cafe MENU");
	}
	@Override
	public void payment() {
		System.out.println("Cafe Payment");

		
	}
	@Override
	public void shopper_bag() {
		System.out.println("Cafe basket");

		
	}
	

}
