package operator_program;

public class BitwiseComplement {
	void complement() {
		int w = 10;
		System.out.println(w);// 10 
		System.out.println(~w);// -(10+1=11)
		System.out.println(~w);	// -(10+1=11)	
		System.out.println(w);//10
		System.out.println(~w);// -(10+1=11)




	}
	void decrement() {
		int z = -16;
		System.out.println(z);// -16
		System.out.println(~z);	// -(-16+1=-15)=-(-15)=15
		System.out.println(~z);	// -(-16+1=-15)=-(-15)=15
		System.out.println(~z);	// -(-16+1=-15)=-(-15)=15
		System.out.println(z);//-16



	}

	public static void main(String[] args) {
		BitwiseComplement q=new BitwiseComplement();
		q.complement();
		q.decrement();
}

}
