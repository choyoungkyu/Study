package com.jykdream.java.operator;

public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 /** 이항연산자 =  '1+2' 를 보게 되면, 1은 좌항 2는 우항 그래서 이항 연산자라고 얘기를 한다.
         단항연산자 = 좌항 우항 없이 하나의 '항'을 대상으로 연산이 이루어지는 연산
  
  + = 양수를 표현(실제로는 사용할 필요X) '+3' = 양수 3 을 뜻함
  - = 음수 표현 
  ++ = 증가 연산자로 항의 값을 '1'씩 증가시킨다. '3++' = 4 가 된다.
  -- = 감소 연산자 '1'씩 감소
  
  */
		
		 int i = 3;
	        i++;
	        System.out.println(i); // 4 출력
	        
	        ++i;
	        System.out.println(i); // 5 출력
	        System.out.println(++i); // 6 출력
	        System.out.println(i++); // 6 출력 ++가 뒤에 있으면 다음에 적용이된다.
	        System.out.println(i); // 7 출력
		
		
		
		
	}

}
