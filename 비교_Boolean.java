package com.jykdream.java.operator;

public class 비교_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**
	Boolean : 참 과 거짓 을 의미 하는 데이터 타입!! 'bool' 이라고도 부른다.
	          true false 두개의 값만을 가진다.
	          
	비교 연산자(관계연산자) : 주어진 값들이 같은지, 다른지, 크거나 작거나 를 구분하는 것을 의미
	  					 결과 값은 'true' or 'false' 로 나타낸다.
					ex)	'=='  /  '!=' not 을 의미한다. 아니다. 부정
					    '>'  = 부등호!!  / >= 일반적인 상식선의 부등호 의미
					     '.equals' = 문자열 비교할때 사용하는 메소드!
 
 */
	/**	 System.out.println(1==2);           //false
	     System.out.println(1==1);           //true
	     System.out.println("one"=="two");   //false
	     System.out.println("one"=="one");   //true
		
	     
	     System.out.println(1!=2);           //true   1과 2는 같지 않다 그러므로 결과값은 참!true
	     System.out.println(1!=1);           //false
	     System.out.println("one"!="two");   //true  
	     System.out.println("one"!="one");   //false
		*/
		
		//문자열 비교
		//  '.equals' = 문자열 비교할때 사용하는 메소드!
	     
	     String a = "Hello world";
	     String b = new String("Hello world");
	     System.out.println(a == b); // 
	     System.out.println(a.equals(b));
		 System.out.println(a!=b);
		 
	}

}
