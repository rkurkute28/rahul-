package superkeyword;

public class Super1 extends Super {
	
	int a =50;
	int b=60;
	
	public void test1() {
		
		System.out.println(a-b); // super keyword is used call same name variable from another class
		
	    System.out.println(super.a*super.b);// int a and b is from another class by using super keyword
	}

	public static void main(String[] args) {
		
		Super1 qa = new Super1();
	
		qa.test();
		
		qa.test1(); 


	}

}
