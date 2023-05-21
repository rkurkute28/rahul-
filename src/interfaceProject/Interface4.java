package interfaceProject;

public interface Interface4 {
       int f=45;
       
       public static void z1() {
    	   System.out.println("z1 is static method from Interface 4");
    	   System.out.println("z1 = "+f);
       }
       // abstract and public . Default method,private method
       default void r1() {
    	   System.out.println("r1 is Defauls Method from Interface 4");
    	   System.out.println("r1 = "+f);
    	   k1();
       }
       void a1();
       void a2();
       void a3();
       public static void z2() {
    	   System.out.println("z2 is static method from Interface 4");
    	   System.out.println("z2 ="+f);
       }
        
       private void k1() {
    	   System.out.println("k1 is private non static method from Interface 4");
    	   System.out.println("k1 = "+f);
       }
       public static void main (String []args ) {
    	   z1();
    	   z2();
    	  
    	   // interface4 = new interface4();
    	   System.out.println("Main Method = "+f);
       }
}

