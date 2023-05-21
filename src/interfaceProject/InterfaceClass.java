package interfaceProject;

public  class InterfaceClass implements Interface3,Interface2,Interface1 {

	   public void a1() {
		System.out.println("a1 is the method from Interface1");
		
		
	}

	
	public void a2() {
		System.out.println("a2 is the method from Interface1");
		
	}

	
	public void a3() {
		System.out.println("a3 is the method from Interface1");
		
	}

	public void a4() {
		
		System.out.println("a4 is the method from Interface2");
	}


	public void a5() {
		System.out.println("a5 is the method from Interface3");
		
	}

	
	public void a6() {
		System.out.println("a6 is the method from Interface3");
	
		
	}
   public static void main (String []args) {
	   InterfaceClass i = new InterfaceClass();
	   i.a1();
	   i.a2();
	   i.a3();
	   i.a4();
	   i.a5();
	   i.a6();
	
}
}
