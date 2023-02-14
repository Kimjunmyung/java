package 배열복습;

import java.applet.Applet;
import java.util.Scanner;

public class 전화번호입력 {
	public static void main(String[] args) {
		// 전화번호 --> 011-245-1234
//		1. 양쪽 공백을 제거하시오
//		2. -를 기준으로 분리하시오(String[])
//		3. 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
//		4. 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
//		5. 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호 아니면 유효하지 않은 전화번호
		
		String s = "   011-245-1234   ";
		String s2 = s.trim(); //공백제거
		System.out.println(s2.length()); //12
		
		String[] s3 = s.split("-"); //-를 기준으로 문자열 3개로 분리
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		//배열의 첫번째 문자열을 구분
		if (s3[0].equals("011")) {
			System.out.println("SK");
		}else if (s3[0].contentEquals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		if(s3[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		if(total >= 10) {
			System.out.println("유요한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}
}
