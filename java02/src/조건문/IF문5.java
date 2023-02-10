package 조건문;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class IF문5 {
	public static void main(String[] args) {
		String ssn = "2111777"; // 주민번호 뒷자리
		//String은  기본형 데이터x if문으로 비교 불가!!
		//따로 명령어(함수)를 사용해야함.
		if (ssn.equals("1111777")){
			System.out.println("동일한 지역 출신이시군요");
		}else {
			System.out.println("다른 지역 출신이시군요");
		}
		
		char gender = ssn.charAt(0);//첫번째 자리 있는 문자 추출
			switch (gender) {
			case '1': case '3':
				System.out.println("남자");
				break;
			case '2': case '4':
				System.out.println("여자");
				break;
				}
			}
	
		}
