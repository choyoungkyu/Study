package jyk9881.java.Operator;

public class Operator_AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// && = AND 즉, 좌항과 우항 모두 참일경우 참!!
		
		/**	if (true && true) {
	            System.out.println(1);
	        }
	 
	        if (true && false) {
	            System.out.println(2);
	        }
	 
	        if (false && true) {
	            System.out.println(3);
	        }
	 
	        if (true && true) {
	            System.out.println(4);
	        }	*/
		
		//변경전
	String id2 = args[0];
	String password2 = args[1];
	
	if(id2.equals("jyk"))
	{ if(password2.equals("11"))
		System.out.println("OK");
	} else{
		System.out.println("NO");
	} 
}

}
	// 변경 후
/**		String id = args[0];
		String password = args[1];
		
		if (id.equals("jyk") && password.equals("111111")){
		
			System.out.println("right");
	} else {
			System.out.println("worng");
	}
}
// &&(AND) => 연산을 사용함으로써 기존 if의 중첩을 사용안해도 될수 있겠끔 한다. 즉, 코드를 간결하게!!
}
*/
