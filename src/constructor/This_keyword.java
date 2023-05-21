package constructor;

public class This_keyword { // How to Use the keyword This 
	// While the variable is same in local and instance variable 
	// Then for calling the instance variable in nonstatic method "this" keyword is used 
	String name1="Rahul";
	String name2="Pratiksh";
	
	
	public void keyword() {
		String name1="Ritesh";
		String name2="Kurkute";
		System.out.println("My brother name is ="+name1+"\n"+"And surname ="+name2);
		// Here we can see the how to use the "this" Keyword
		// Here varible is same but information is changable.
		System.out.println("My name is ="+this.name1+"\n"+"My wife name is = "+this.name2);
	}

	public static void main(String[] args) {
		This_keyword T = new This_keyword();
		T.keyword();
		

	}

}
