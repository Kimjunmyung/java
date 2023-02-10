package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 프로그램을 어떤 순서대로 짜야할까?
		// 입력: 데이터를 가지고오는 입력
		// 처리: 특정한 작업을 수행
		// 출력: 처리한 내용을 출력
		// 외부에서 대화창같은 것으로 입력받은 경우는 무조건 컴퓨터는 String(문자열)로 인식함.
		
		String name = JOptionPane.showInputDialog("당신의 이름은?"); //input(입력)
		
		String result = "나의 이름은 " + name + "입니다.";
		
		System.out.println(result);

	}

}
