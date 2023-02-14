package 배열복습;

public class 스트링과배열 {

	public static void main(String[] args) {
		String s1 = "나는 진짜 프로그래머프야 ";
		String s2 = "진짜!!";
		System.out.println(s1 + s2); //스트링 두개가 합쳐짐
		System.out.println(s1.concat(s2)); //스트링을 합치는 함수
		System.out.println(s1.charAt(0)); //0번째 인덱스에 있는 값 추출
	    char c	= s1.charAt(0); //한 글자만 추출하기 때문에 char형식
	    System.out.println(s1.endsWith("야")); //끝에 말이 " "에 들어간 말로 끝나는지 true false
	    boolean result = s1.endsWith("야");
	    String result2= s1.substring(3); //인덱스 3부터 끝까지 추출
	    String result3= s1.substring(3 ,8);//인덱스 3번부터 7번까지 (8-1)만큼 추출
	    boolean result4 = s1.contains(s2); 
	    int index = s1.lastIndexOf("프");
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.toLowerCase());
	    System.out.println(s1.length());
	    s1.replace("나","너");
	    System.out.println(s1);
		

	}

}
