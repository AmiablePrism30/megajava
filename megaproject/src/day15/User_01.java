package day15;

public class User_01 extends Thread{
	private Account account;
	
	
	public void setaccount(Account account) {
		this.setName("User1");
		this.account=account;
		
	}
	
	@Override
	public void run() {
		account.setmoney(100);
	}
	

}
