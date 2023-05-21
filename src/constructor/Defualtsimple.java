package constructor;

public class Defualtsimple {
	int u;
	String name;
	
	Defualtsimple(){
		u=5546;
		name="Defaults";
		System.out.println(u+" "+name);
	}
	void simple() {
		System.out.println("My package is ="+u+"\n"+"My system is"+"Defaults");
	}

	public static void main(String[] args) {
		Defualtsimple T=new Defualtsimple();
		Defualtsimple T1=new Defualtsimple();
		T.simple();
		T1.simple();
	}

}
