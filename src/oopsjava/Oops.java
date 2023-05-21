package oopsjava;

public class Oops {
	
	public void eat() {
		System.out.println("eating....");
		
	}
   class Dog extends Oops{
	   public void bark() {
		   System.out.println("Barking....");
	   }

		
	}
   public class Testinheritance {
  

	public static void main(String[] args) {
		Oops b = new Oops();
		b.eat();
	
		
		

	}

   }}
