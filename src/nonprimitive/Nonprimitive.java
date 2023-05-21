package nonprimitive;

public class Nonprimitive {
         String b = "Shotout at wadala"; // instant variable because its outside of method Body
         static String s = "Shotout at wadala";// static variable
	public static void main(String[] args) {
		 String H = "Horiable"; // Local variable
		 String F = "Faster";   // local variable inside method
		System.out.println("manya Surve"      +           H+"        "+F+" ");
		Nonprimitive U = new Nonprimitive();
		U.Datatype();
		variables();

}
	public void Datatype() { 
		
	String p = "Horiable 2";// local  variable
    String m = "Faster 2";// local variable
	System.out.println("gangstar"+p+" "+m);
	System.out.println(b);
	System.out.println(""+s);
	}
	public static void variables() {
		String A = "Horiable 3"; // Local variable
	    String B = "Faster 3";// Local variable
		System.out.println(A+" "+B);
				System.out.println(""+s);
		
		System.out.println("This is Diravar gang"+"+s");
	
	}
	
	
}