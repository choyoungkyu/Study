package jyk9881.java.Operator;

public class Operator_or {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *	id = jyk9881, jyk, ziral112 중 어느것을 선택해도 참! '||' or 연산을 사용했기 때문에 or 연산은 둘중하나만 참이면 참
 *	pw = 111 만을 써야 참! 왜? '&&' 사용했기 때문에
 *	
 *	즉, id = jyk9881, jyk, ziral112 중 택일하며 pw= 111 만 사용해야 참!!
 * OK??
 *
 **/
		String id = args[0];
		String password = args[1];
		
		if(id.equals("jyk9881") || id.equals("ziral112") || id.equals("jyk")
			&& password.equals("111"))
			{
				System.out.println("OK");
			} else {
				System.out.println("NO");
			}
		
	}

}
