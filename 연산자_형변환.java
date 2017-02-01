package com.jykdream.java.operator;

public class 연산자_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
          
        System.out.println(a/b);  /** 1 **/
        System.out.println(c/d);  /** 2 **/
        System.out.println(a/d);  /** 3 **/
		
 // 1번 = 정수에 틀안에서 나누기를 할 경우 '.'소수점 뒤 내용들은 누락 된다.
 // 2번 = 실수안에서 했개 때문에 소수점 값들을 모두 표시
 /** 3번 = int 와 float 즉, 정수와 실수사이는 실수로 표시된다.
   (형변환의 원칙으로 더 넓은 형식으로 표현하기위해 float로 자동 형변환 된다.)  */
        
       
        
        
		
		
		
	}

}
