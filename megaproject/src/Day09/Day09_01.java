package Day09;


/***
 * public: can call anywhere from project
 * protected: can call on current package
 * but inherited subclass approaches package
 * where supper class is
 * default: can call on current package
 * private: can call on current class
 * 
 *
 * final: constant of memory
 * static: allocate memory when program runs
 * 
 */
public class Day09_01 {
	
	public static void main(String[] args) {
		
		Character character =new Character();
		character.name="sinchon_mega";
		character.lv=1;
		character.exp=0;
		character.setpower(10);
		System.out.println("Power is "+character.getpower());
		
		System.out.println("final ");
	//	character.code="30";
		
	}

}
