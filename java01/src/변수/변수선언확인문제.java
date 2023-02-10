package 변수;

import java.util.jar.Attributes.Name;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 내정보중 기본 데이터에 속하는 정보를 변수로 바꿔보자.
		// 정수, 실수, 문자(1개), 논리
		
		int num = 25; //정수
		
		double num2 = 180.8; //실수
		
		char a = '남'; //문자(1개)
		
		boolean b = true; //논리(x or o)
		
		String name = "홍길동"; // 여러 글자를 쓸 때는 ""
		// 기본형 데이터는 아니나, 너무 많이 쓰기 때문에 기본형 데이터처럼 사용 가능
		
		
		System.out.println("나의 나이는? " + num);
		System.out.println("나의 키는? " + num2);
		System.out.println("나의 성별은? "+ a);
		System.out.println("아침밥을 먹었는지?  " + b);
	}

}
