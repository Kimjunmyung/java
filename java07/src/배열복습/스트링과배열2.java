package 배열복습;

import javax.net.ssl.SSLContext;
import javax.print.attribute.Size2DSyntax;

public class 스트링과배열2 {

	public static void main(String[] args) {
		String s = "감자, 고구마, 양파";
		//스트링에 들어있는 문자열을 분리시키고 싶을 때 split(기준)
		//분리된 결과는 배열에 들어감
		String[] s2 = s.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		String s3 = "감자 고구마 양파";
		String[] s33 = s3.split(" ");
		System.out.println(s33[2]);
		
		String s4 = "    홍길동";
		System.out.println(s3.trim());//공백 제거
		String s5 = s4.trim();
		System.out.println(s4.length()); //글자 수 확인
		
		String s6 = s4.replace("       ","");
		System.out.println(s6.length());
		
		String s7 = "홍길동"; //각각의 글자 하나하나 분리하고 싶을때
		char[] s8 = s7.toCharArray();
		System.out.println(s8[0]);
		System.out.println(s8[1]);
		System.out.println(s8[2]);
	}

}
