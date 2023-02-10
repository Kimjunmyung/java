package 연습문제;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class 인기조사10명 {

	public static void main(String[] args) {
		//인기투표
			int iu = 0;
			int bts = 0;
			int njs = 0;
			for (int i = 0; i < 10; i++) {
				String data = JOptionPane.showInputDialog("당신이 가장 좋아하는 연예인은? 1)아이유  2)bts 3)뉴진스");
				 if (data.equals("1")) {
					iu++; // 0+1 //중요!!!!!!!!!!!!
				}else if (data.equals("2")) {
					bts++; //위의 full = full + 1 과 같음
				}else if (data.equals("3")) {
					njs++; //위의 full = full + 1 과 같음
				}
				
			}
			System.out.println("아이유" + iu + "명");
			System.out.println("bts" + bts + "명");
			System.out.println("뉴진스" + njs + "명");

	}

}
