package operator_program;

public class Prefix_Operator {
       void incre() {
    	   int p=45;
    	   System.out.println(p);//45 output is 45
    	   System.out.println(++p);// 46 output is (1+45=46)
    	   System.out.println(++p);// 47 output is (1+46=47)
    	   System.out.println(p);//47 output is 47
    	   System.out.println(++p);// 48 output is (1+47=4)
    	   }
         public static void main(String[] args) {
		  Prefix_Operator A= new Prefix_Operator();
		  A.incre();
		
		

	}

}
