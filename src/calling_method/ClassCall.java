package calling_method;

public class ClassCall {
	
	ClassCall(){
		System.out.println("I love java");
	}
	ClassCall(String name){
		System.out.println("I love Java Programming");
		
	}
   ClassCall(int i){
	  System.out.println("I love Methology;");
   }
	public static void main(String[] args) {
		new ClassCall();
		new ClassCall(25);
		new ClassCall("Rahul");
		// Now here We are Calling the Another Method Class in Current Class
		// Here We Observed the package is same not allowed another package
		CallingMethod.single();
		CallingMethod.single1();
		CallingMethod K=new CallingMethod();
		K.single2();
		K.single3();

		
			
		
	    
	    
		

	}

}
