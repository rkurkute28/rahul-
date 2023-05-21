package logicalprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		                 int a=5;
		                 
		                 int b;
		                 
		                 int c=a;
		                 for(b=2;b<a;b++){
		                	    
		                	 if (a%b==0) {
		                		 c=1;
		                		 
		                	 }
		                
		                 }
		                 if (c>0) {
		                	 
		                	 System.out.println(a+" Is not a prime Number");
		                 }
		                 else {
		                	 System.out.println(a+" is a prime Number ");
		                 }
	}

}
