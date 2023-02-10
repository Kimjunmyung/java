package 조건문;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class IF문7 {
	public static void main(String[] args) {
		
		String pw = JOptionPane.showInputDialog("비밀번호는?");
			if (pw.equals("pass") ) {
				System.out.println("들어오세요");
			}else {
				System.out.println("나가세요");
			}
		
		String dinner = JOptionPane.showInputDialog("오늘 저녁메뉴는?");
		if (dinner.equals("자장면") ) {
			System.out.println("중국집에 가자");
		}else if (dinner.equals("라면")) {
			System.out.println("분식집에 가자");
		}else if (dinner.contentEquals("회")) {
			System.out.println("횟집에 가자");
		}else {
			System.out.println("안먹을래");
		}
	
		String a = JOptionPane.showInputDialog("정수를 입력하세요1");
		String b = JOptionPane.showInputDialog("정수를 입력하세요2");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b); 
		
		if (a1 > b1) { 
			System.out.println("a가 더 큽니다!");
		}else if (a1 < b1) {
			System.out.println("b가 더 큽니다!");
		}else {
			System.out.println("두 수가 같습니다!");
		}
		
		String no = "A100EX";
		char no1 = no.charAt(0);
		switch (no1) {
		case 'A':
			System.out.println("기획부 사원입니다.");
			break;
		case 'B':
			System.out.println("총무부 사원입니다.");
			break;
		case 'C':
			System.out.println("개발부 사원입니다.");
			break;
		default:
			System.out.println("해당사항 없음.");
			break;
		}
		
		
		
		
		
		
		}
	}
