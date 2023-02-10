package 배열;

public class 배열개념 {
	public static void main(String[] args) {
		//여러개의 데이터를 램에 저장해두고 cpu가 접근하여
		//사용하고 싶은 경우 사용하는 부품
		//1. 값을 이미 알고 있는경우	
		int[] jumsu = {10,20,30,40}; //length라는 변수를 자동으로 생성해 몇개인지 세어 넣어줌.
		System.out.println(jumsu);
		System.out.println(jumsu[0]); //jumsu 배열의 첫번째 값
		System.out.println(jumsu[1]); //jumsu 배열의 두번째 값
		System.out.println(jumsu[2]); //jumsu 배열의 세번째 값
		System.out.println(jumsu[3]); //jumsu 배열의 네번째 값
		System.out.println(jumsu.length); //jumsu 배열의 length변수
		
		jumsu[0] = 100; //배열의 첫번째 값에 100을 넣어라 10 --> 100
		System.out.println(jumsu[0]);
		
		//2.값을 아직 모르지만 먼저 저장공간을 만들고 나중에 값을 넣는경우
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
	}
}
