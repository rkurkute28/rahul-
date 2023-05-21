package constructor;

public class Constructrs {
                  String Name;
                  String address;
                  int age ;
                  int mobno;
                  long adharno;
                  
                 Constructrs(){
                	 Name="Rahul kurkute";
                	 address="Karanja lad";
                	 age=30;
                	 mobno=967333510;
                	 adharno=9673351094l;
                   
                	  
                  }
                 public void ladakh () {
                	 Name = "Pratiksha kurkute";
                	 address = "pune";
                	 age=28;
                	 mobno=855201502;
                	 adharno=9673351010l;
                	 System.out.println("My wife name is ="+Name+"\n"+"My wife addres is ="+address+"\n"+"My wife is Age ="+age+"\n"+"My wife mob no is ="+mobno+"\n"+"My wife adhar no is ="+adharno);
                 }
                 public  void ladakh1() {
                	 Name="riteish kurkute";
                	 address="karanja lad";
                	 age = 28;
                	 mobno=901115885;
                	 adharno=964125521524524555l;
                	 System.out.println(Name+address+"\n"+age+"\n"+adharno+"\n"+mobno);
                	 
                 }
                 
                	 
                 
                 public void ladani() {
                	 System.out.println("My name is = "+Name+"\n"+"My location = "+address+"\n"+"My Age ="+age+"\n"+"My mobile no ="+mobno+"\n"+"My adhar card no is = "+adharno);
                 }
	public static void main(String[] args) {
		Constructrs T= new Constructrs();
		
		T.ladani();
		T.ladakh();
		T.ladakh1();
		

	}

}
