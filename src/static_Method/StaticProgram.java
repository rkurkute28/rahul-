package static_Method;

public class StaticProgram {

	public static void main(String[] args) {
		System.out.println("Main Mehtod");
                
                 StaticProgram.a1();
                 a1();
                 a2();
    // MethodName();
    // Classname.Methodname();
    // Methodname with signature followed by Semi Coloum ( use LOwercase)
    // we also use only a2();
    // we also use only a1(); to run Program successfully
	} 
	public static void a1() {
		System.out.println("I proud of Software");
	}
    public static void a2() {
    	System.out.println("I proud of Tester");
    }
}
