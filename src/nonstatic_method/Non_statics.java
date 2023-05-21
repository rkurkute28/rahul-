package nonstatic_method;

public class Non_statics {
	
	public void velocity()
	{
		System.out.println("Velocity java method note");
	}
	public void brach()
	{
		System.out.println("Chinchwad");
	}
	public void tesing()
	{
		System.out.println("Software");
	}
	public void course()
	{
		System.out.println("Tester");
	}

	public static void main(String[] args) {
		System.out.println("Velocity Trainning Center");
		Non_statics obj=new Non_statics();
		obj.velocity();
		obj.brach();
		obj.tesing();
		obj.course();
		

	}

}
