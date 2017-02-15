package jyk9881.java.Repetition;

public class B_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0;/*i의 값을 0 으로 초기화*/  i <= 20;/*종료기간설정*/  i=i+2/*반복실행 즉, 반복될때 마다 i의 값을 1씩 증가*/) {
            System.out.println("Coding Everybody " + i);
        }
	}

}
/* 
 *  for(초기화; 종료조건; 반복실행){
 *  	반복적으로 실행될 구문
 *  }
 *  
*/