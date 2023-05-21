package nonstatic_method;

public class Nonstatics {
	
	public void staticnon ()
	{
		System.out.println("We are proctice the nonstatic method");
		
	}
	public void a1()
	{
		System.out.println("We are make the nonstatic program");
		
	} 
	public void a2()
	{
		System.out.println("We are make a2 program");
		
	}
	public void a3 ()
	{
		System.out.println("We are make a3 program");
	
	}
	
	
	

	public static void main(String[] args) {
    Nonstatics obj = new Nonstatics();
    obj.a1();
    obj.a3();
    obj.a2();
    obj.staticnon();
	}

}
