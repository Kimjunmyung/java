package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		//자바 연산시 주의점
		int x = 20;
		int y = 30;
		System.out.println(x / y);
		
		//이미 정수로 된 저장값을 cpu가 가져다가 실수 연산을 하고 싶은 경우
		//cpu가 정수를 실수로 변환해서 할 수 있음.
		//강제 타입변환(강제형변환) ==> (강제로 바꾸고싶은 타입)변수명
		System.out.println(x /(double)y);
	}

}
