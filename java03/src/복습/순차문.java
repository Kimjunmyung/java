package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//항상 프로그램은 입력 -> 처리 -> 출력
		//두 개의 숫자를 받아서 더하기 연산을 해보자.
		//프로그래밍은 손으로 입력하는 값은 모두 다 스트링으로 취급(문자열)
		String n1 = JOptionPane.showInputDialog("숫자1을 입력.");
		String n2 = JOptionPane.showInputDialog("숫자2을 입력.");
		
		//처리
		//입력받은 값을 정수로 바꾸고 싶다면 정수로 바꾸어주는 부품을 써서 처리해야함.
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		//출력
		System.out.println((double)n11 / n22);
		//하나의 결과만 더블(실수형)으로 바꾸어 주어도 결과는 실수형으로 나온다.
		//앞에 
		
	}

}
