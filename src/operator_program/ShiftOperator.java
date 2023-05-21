package operator_program;

public class ShiftOperator {
	
    void shift() {
    	int k=15;
    	System.out.println(k<<2);// syntax = 15 *2^2 = 15*4=60
    	System.out.println(k<<16);// Syntax = 15 *2^16=15*65536=983040
   }
    void shifto() {
    	int m=20;
    	System.out.println(m>>2);//20 /2^2= 20/4=5
    	System.out.println(m>>4);// 20 /2^4=20/16=1
    	System.out.println(m>>5);//20/2^5=20/32=00
    	
    		
    	}
    
    
	public static void main(String[] args) {
		ShiftOperator v = new ShiftOperator();
		v.shift();
		v.shifto();
		

	}

}
