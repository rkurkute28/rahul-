package overloading;

public class ConstructorOverload {
	public void dream() {
		System.out.println("I am the best Tester");
		
	}
	public void dream(int a) {
		// Each and Every constructor have the 
		//different parameter and argument
		System.out.println("I have current package is 11 LPA");
	}
	public void dream(String name ) {
		System.out.println("I currently Working FIS");
			
	
	}
	public void dream(long exp,String location) {
		System.out.println("I have 5yr of experiance and job Location is pune");
	}

	public static void main(String[] args) {
		ConstructorOverload b=new ConstructorOverload();
		b.dream();
		b.dream(25);
		b.dream("Rahul");
		b.dream(96733351094l, "pune");


	}

}
