package calling_method;  // Most Important Topic please focus

public class ClassCalling {
	// Most Important Topic Please Noted 
	//Method calling From outside/another of Method class.
	//Call to another class of Method in current method
	public static void jdk1() {
		System.out.println("JVM is Memory location to Store class");
	}
	public static void jdk2() {
		System.out.println("Class  Keyword is used to declare the class ");
		
	}
	public  void jdk3() {
		System.out.println("Java else keyword is used to indicate the branches");
	}
	public void jdk4() {
		System.out.println("Defualt keyword is used to specify the degault block of code");
	}

	public static void main(String[] args) {
		jdk1();
		jdk2();
		ClassCalling W= new ClassCalling();
		W.jdk3();
		W.jdk4();
		// here we call another method class in this current class
		// Here we can call any class for execution from another clas but need same package
		CallingMethod.single();
		CallingMethod.single1();
		CallingMethod K=new CallingMethod();
		K.single2();
		K.single3();
		// Now here We are Calling another method class in current Class
		
		


	}

}
