package Day09;

public class Character {

	public String name;
	protected int lv;
	int exp;
	private int power;
	final String code="10";
	
	
	
	
	public void setpower(int power) {
		this.power=power;
		
	}
	public int getpower() {
		return power;
	}
	
	public void setlevel(int lv) {
		this.lv=lv;
	}
}
