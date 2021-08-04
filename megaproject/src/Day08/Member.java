package Day08;

public class Member {
	
	//1.field
	String id;
	String nickname;
	int pw;
	String name;
	String email;
	
	
	//2.object[initial value when declare
	//empty constructor
	public Member() {
		
	}
	// field constructor
	public Member(String id,String nickname,int pw,String name,String email) {
		this.id=id;
		this.pw=pw;
		this.nickname=nickname;
		this.name=name;
		this.email=email;
		//this is class itself
		
		
	}
	public void info() {
		System.out.println(id);
	}
	
	public String getemail() {
		return email;
		
		
	}
	
	public String setname(String name) {
		this.name=name;
		return "name has been changed";
		
	}
	
	public void setmail(String email) {
		this.email=email;
		
	}
	
	//3.method

}
