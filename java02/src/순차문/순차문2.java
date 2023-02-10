package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//기본 순차문 입력 = 입력 --> 처리 --> 출력
		//입력 -> 부품사용, 망치처럼 언제나 바로 사용할 수 있는 것 
		//다이얼로그 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식함
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오 -1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오 -2");
		
		//처리 -> 숫자 더하기 연산
		// 		String으로 인식한 data1의 숫자를 int로 변경 해주어야 함
		int data11 = Integer.parseInt(data1); //"200" -> 200
		int data22 = Integer.parseInt(data1); //"100" -> 100
		
		int result = data11 + data22;//결과는 String

	}

}
