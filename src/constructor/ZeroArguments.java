package constructor;

public class ZeroArguments {

	String id;
	char p;                // Decleration of variables
	boolean b;
	
	ZeroArguments(){// Zero constructor datatype
		id = "rahul";
		p='R';
		b=511>845;
		System.out.println("My Employee ID is ="+id+"\n"+"My Iniatial no is ="+p+"\n"+"My condition is ="+b);
	
	}
	public ZeroArguments(int o) {
		id ="Pratiksha";
		p='T';
		b=5<5;
		System.out.println(id);
		System.out.println(p);
		System.out.println(b);
	}
	public ZeroArguments(String bike,int o) {
		//Difference constructor with diff variable 
		id ="Unicorn";
		p='U';
		b=5>6;
		System.out.println(id);
		System.out.println(p);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
	ZeroArguments T=new ZeroArguments();
    new ZeroArguments(711);
    new ZeroArguments("Hero bike",851);

	}

}
