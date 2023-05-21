package nonstatic_method;

public class Non1static {
	public void b1() {
		System.out.println("Rahul");
	}
	public void b2() {
		System.out.println("Velocity");
	}
	public void b3 () {
		System.out.println("course");
	}
	public void b4() {
		System.out.println("Testing");
	}
	
	

	public static void main(String[] args) {
		System.out.println("Now Learning Data types");
		Non1static rahul=new Non1static();
		rahul.b1();
		rahul.b2();
		rahul.b3();
		rahul.b4();
		

	}

}
