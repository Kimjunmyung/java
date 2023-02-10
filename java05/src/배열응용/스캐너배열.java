package 배열응용;

import java.util.Scanner;

public class 스캐너배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 함수 추가
		
		int[] num = new int[5]; //num 이라는 이름을 가지고 크기가 5인 int형 배열 생성 
		for (int i = 0; i < num.length; i++) { //반복문을 통해 숫자를 입력하세요에  
			// 쓴 숫자를 입력받아 배열의 크기까지 순서대로 반복하여 넣는다
			System.out.print("숫자를 입력하세요: ");
			num[i] = sc.nextInt();
			
		}
		System.out.println("첫번째 배열과 세번째 배열의 합은: " + (num[0] + num[2]));//배열에 내가 입력한 숫자가 들어갔으면 
		//그 배열의 첫번째와 3번째 배열에 들어간 수를 더하여 출력한다.
		
		System.out.println();
		String[] s = new String[3]; //크기 3개의 스트링 배열을 만든다
		for (int i = 0; i < s.length; i++) {
			System.out.print("컴퓨터 언어를 입력하세요");
			s[i] = sc.next();
		}
		System.out.println(s[0] + " 보다는 " + s[1]);
		
		sc.close();
	}
}
