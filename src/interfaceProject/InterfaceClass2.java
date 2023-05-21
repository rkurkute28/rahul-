package interfaceProject;

public class InterfaceClass2 implements Interface4,Interface5,Interface6{
	public void a1() {
		System.out.println("A1 is the method from Interface4");
		System.out.println("a1 ="+f);
	}
    public void a2(){
    	System.out.println("A2 is the method from Interface4");
    	System.out.println("a2 ="+f);
    	
    }
    public void a3 () {
    	System.out.println("A3 is the Method from Interfae4");
    	System.out.println("a3 ="+f);
   
    	}
    public void a4() {
    	System.out.println("A4 is the Method from Interface5");
    	System.out.println("a4 ="+f);
    	
    }
    public void a5() {
    	System.out.println("A5 is the Method from Inteface6 ");
    	System.out.println("a5 ="+f);
    	
    }
    public void a6() {
    	System.out.println("A6 is the Method from Interface6");
    	System.out.println("a6 ="+f);
    }
    
	public static void main(String[] args) {
		InterfaceClass2 b = new InterfaceClass2();
		b.a1();
		b.a2();
		b.a3();
		b.a4();
		b.a5();
		b.a6();
	
	
		Interface4.z1();
		Interface4.z2();
	    b.r1();
		
	 
	  

	}

}
