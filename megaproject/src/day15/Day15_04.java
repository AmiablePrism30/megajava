package day15;

public class Day15_04 {
	
	public static void main(String[] args) {
		Account account =new Account();
		
		User_01 user1=new User_01();
		
		user1.setaccount(account);
		user1.start();
		
		User_02 user2=new User_02();
		
		user2.setaccount(account);
		user2.start();
		
		
		
		
	}
	
	

}
