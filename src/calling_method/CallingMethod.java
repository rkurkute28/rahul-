package calling_method;

public class CallingMethod {
	// Method calling within the same class/Single class
    public static void single() {
    	System.out.println("All is well");
    	
    }
    public static void single1() {
    	System.out.println("All is good ");
    	
    	
    }
    public void single2() {
    	System.out.println("All is done and best");
    	
    }
    public void single3() {
    	System.out.println("All thing is happy as possible");
    }
	public static void main(String[] args) {
		 		// Now here im calling the Classcalling method class in callingmethod class to get output
		ClassCalling.jdk1();
		ClassCalling.jdk2();
		ClassCalling W= new ClassCalling();
		W.jdk3();
		W.jdk4();
		// Now im Here Calling the ClassCall method class in the CallingMethod Class
		new ClassCall();
		new ClassCall(25);
		new ClassCall("Rahul");
		// Now here we are calling anothe method class in this current class
			}

}
