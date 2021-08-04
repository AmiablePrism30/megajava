package day15;

public class Account {

	
	private int money;
	
	
	public int getmoney() {
		return money;
	}
	
	public synchronized void setmoney(int money) {
		this.money=money;
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.money);
		
	}
}
