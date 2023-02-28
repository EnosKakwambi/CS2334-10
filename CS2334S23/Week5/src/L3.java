
public class L3 extends L2 {
	
	static int a = 9;
	
	@Override
	public void display() {  
		System.out.println("L3: display");  
	}
	
	public void anotherDisplay() {  
		System.out.println("L3: anotherDisplay");  
	}
	
	/**
	* Returns double of an integer. 
	*/
	public static int doubleIt() {  
		return 2*a;
	}

}
