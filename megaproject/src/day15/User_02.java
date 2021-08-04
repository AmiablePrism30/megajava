package day15;

public class User_02 extends Thread {
	private Account account;
	
	public void setaccount(Account account) {
		this.setName("User2");
		this.account=account;
		
	}
	
	@Override
	public void run() {
		account.setmoney(50);
	}
	

}
