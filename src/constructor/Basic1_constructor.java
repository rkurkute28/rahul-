package constructor;

public class Basic1_constructor {
	// Declaration of variable
	int p;
	int q;
	
	public void X1 () {
		// Intialation of variable
		p = 100;
		q=200;
		System.out.println(p+q);
	}
	public void X2() {
		p=543;
		q=6286;
		System.out.println(p-q);
	
	}
	public  void X3() {
		p=6954;
		q=100;
		System.out.println(p*q);
	}
	

	public static void main(String[] args) {
		// Usage of Varibles
		Basic1_constructor T = new Basic1_constructor();
		T.X1();
		T.X2();
		T.X3();
		
		
		
		

	}

}
