package com.jykdream.java;

public class int_SangSu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float jyk = 2.2F;
	// float = 4byte (1.4 ~ 3.402) , double = 8byte (4.94~1.79)
	// float 는 2.2 사용 불가 그러나 '상수' 뒤에 'F'(float의 약자) 를 입력함으로써 이 상수는 float 라는 것을 인식시킨다.
	System.out.println(jyk+1);
		
	
	long a = 2147483648L;
	// byte, short 데이터 타입은 int 를 사용하는 것을 허용한다.
	
	// but, 위에 적힌 2147483648은 분명 long 타입인데도 불구하고 작성하면 에러가 나온다.
	// 그 이유는 default 값이 int 라서 그렇다. 이럴땐 상수 뒤에 'L'을 입력하여 쓴다.
	System.out.println(a);
		/**
		 
		 
		 
		 **/
	
		
	}

}
