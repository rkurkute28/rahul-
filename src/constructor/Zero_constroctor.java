package constructor;

public class Zero_constroctor {
	
	Zero_constroctor(){
		System.out.println("Zero / non parameter constructor");
		}
	public Zero_constroctor(int i) {
		// Here in constructor one parameter is used
		System.out.println("one parameter constructor");
		}
	public Zero_constroctor(String s,int i){
		// Here in constructor two parameter is used
		System.out.println("Two parameter of Constructor");
		}
	
	public Zero_constroctor (String s, long l, char c) {
		System.out.println("Tree parameter of constructor");
		
	}
	public static void main(String[] args) {
		Zero_constroctor T = new Zero_constroctor();// we can call creating the object of class.
	    new Zero_constroctor(52); // we call the constructor in main method by using the "new" keyword
		new Zero_constroctor("rahul kurkute" ,25);
		new Zero_constroctor("Tester",54525522,'G');

	}

}
