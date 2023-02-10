package 조건문;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 마무리문제 {

	public static void main(String[] args) {
//		//scanner 사용해서 로그인 만들기
//		//입력 : 아이디 비밀번호 버튼 스캐너로
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 >>");
		String id = sc.nextLine(); 
		
		System.out.print("비밀번호 >>");
		String pw = sc.nextLine(); 
		
		if (id.equals("root")&& pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
		System.out.println("로그인 실패");
		}
		//---------------------------------------------------------------//
		System.out.print("사과 구매 갯수 입력 >>");
		int apple1 = sc.nextInt(); 
		System.out.print("사과 한개당 가격 입력 >>");
		int apple2 = sc.nextInt(); 
		
		System.out.print("딸기 구매 갯수 입력 >>");
		int straw1 = sc.nextInt(); 
		System.out.print("딸기 한개당 가격 입력 >>");
		int straw2 = sc.nextInt();
		
		int apple3 = apple1*apple2;
		int straw3 = straw1*straw2;
		
		System.out.println("사과 구매 가격은 " +(apple1 * apple2) + " 원 입니다.");
		System.out.println("딸기 구매 가격은 " +(straw1 * straw2) + " 원 입니다.");
		System.out.println("전체 구매 가격은 " + (apple3 + straw3) + " 원 입니다.");
		
		//----------------------------------------------------------------//
		
		System.out.println("시작값>> ");
		int start = sc.nextInt();
		System.out.println("종료값>> ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("최종합은 " + sum);
		
		//-----------------------------------------------------------------//
		
		System.out.println("시작값>> ");
		int start2 = sc.nextInt();
		System.out.println("종료값>> ");
		int end2 = sc.nextInt();
		int jump2 = sc.nextInt();
		System.out.println("점프값>> ");
		int sum2 = 0;
		for (int i = start2; i <= end2; i = i + jump2) {
			sum2 = sum2 + i;
			if (sum2 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종합은 " + sum2);
		sc.close();
		
		
		
		
		
		
		
		
	}

}
