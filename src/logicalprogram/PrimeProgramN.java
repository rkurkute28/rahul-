package logicalprogram;

public class PrimeProgramN {

	public static void main(String[] args) {
		  int a;
		  int b;
		  int count;
		  
		  for(a=1;a<=100;a++) {
			  
			  count=0;
			   
			     for(b=1;b<=a;b++) {
			    	 
			    	 if(a%b==0) {
			    		 
			    		 count++;
			    	 }
			     }
			     if(count==2) {
			    	                   System.out.println(a);
			     }
		  }
		  
	}

}
