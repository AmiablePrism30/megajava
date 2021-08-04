package Day11;

public class Bank implements ATM{
	@Override
	public void account() {
		System.out.println("Account Register");
	
	}@Override
	public void deposit() {
		System.out.println("deposit page");
		// TODO Auto-generated method stub
		
	}@Override
	public void left() {
		System.out.println("Deposit left");
		// TODO Auto-generated method stub
		
	}@Override
	public void Menu() {
		System.out.println("1. Account 2. Deposit 3.Withdraw 4.Send 5. Left");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void send() {
		System.out.println("Sending");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void withdrwal() {
		System.out.println("Withdraw");
		// TODO Auto-generated method stub
		
	}
	

}
