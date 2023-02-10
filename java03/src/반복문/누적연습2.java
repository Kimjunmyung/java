package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {
	public static void main(String[] args) {
		
		// 1. 숫자누적 연습
		// 5부터 300까지 5의 배수만 모두 더해서 출력하라.
		// 5의 배수의 조건 -> i % 5 == 0
		
		
		// 2. 문자 누적 연습
		// 먹고싶은 음식 4가지 감자랑 고구마랑 딸기랑 커피랑이 나오도록 출력
		int sum = 0;
		for (int i = 1; i <= 300; i++) {
			if (i % 5 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("전체 더한 값은 -> " + sum);
		
		
		String sum2 = " "; //string의 초기값은 " "
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고싶은 음식?");
			sum2 = sum2 + data + "랑 "  ;
			
		}
		System.out.println("먹고싶은 음식 종류 >"+ sum2);
		
	}
}
