package 연습문제;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class 설문조사10명 {

	public static void main(String[] args) {
		int full = 0;
		int nofull = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1)배부름  2)안배부름");
			 if (data.equals("1")) {
				full = full +1; // 0+1 //중요!!!!!!!!!!!!
			}else if (data.equals("2")) {
				nofull++; //위의 full = full + 1 과 같음
			}
			
		}
		System.out.println("배부른 사람 몇명?" + full + "명");
		System.out.println("안배부른 사람 몇명?" + nofull + "명");

	}

}
