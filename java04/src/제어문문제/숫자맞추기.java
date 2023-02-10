package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int target = r.nextInt(100); //0~99 난수
		Scanner sc = new Scanner(System.in);
		
		int data = 0;
		int count = 0;
		while (true) {
			System.out.print("당신이 생각한 정답은?");
			data = sc.nextInt();
			count++; //당신이 생각한 정답은?이 출력될 때 마다 count에 회수가 1씩 증가
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("당신의 시도 횟수는"+ count+"회 입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;  //while 무한루프에서 정답시 코드를 끝내는 break를 해주기
			} else {
				System.out.println("오답입니다.");
				if (data < target) {
					System.out.println("너무 작아요");
				}else {
					System.out.println("너무 커요");
				}
			} 
		}
		sc.close();
	
	}
}
