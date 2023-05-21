package polymorphism;

public class Compiletime {

	public void test() {
		System.out.println("This is the test method with No args");
	}
	
	public void test(String a) {
		
		System.out.println("This is the test method with string arguments");
		
	}
	public void test (String b , int c) {
		
		System.out.println("This the test method with String and int arguments");
	}
	 
	public void test (int e,String d) {
		
		System.out.println("This the test method with int and String arguments");
		
	}
	public static void main(String []args) {
		Compiletime c=new Compiletime();
	   c.test("Rahul", 100);
		c.test(1, "r");
		c.test();
	}
}
