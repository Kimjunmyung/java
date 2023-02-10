package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때 어떤 데이터의 타입을 넣을지 미리 결정한다.
		// 선언 타입변수명 => 변수가 생성됨.
		int num = 100; //정수형 변수 int
		double num2 = 22.2; //실수형 변수 double
		char c = 'A'; //글자 1글자 일땐 ''을 쓴다.
		boolean b = true; // true,false 둘 중 하나.
		
		num = 200;
		num2 = 22.12341;
		c = '옹';
		b = true;
		System.out.println(num);
		System.out.println("정수값은" + num);
		System.out.println("실수값은" + num2);
		System.out.println("문자 1개의 값은" + c);
		System.out.println("부울렌의 값은" + b);

	}

}
