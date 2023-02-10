package 확인문제;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String what = JOptionPane.showInputDialog("수업이 끝나고 무엇을 할 예정이신가요?");
		
		System.out.println(day + "에 수업 후 나는 " + what + " 할 예정");
	
	}

}
