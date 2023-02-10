package 반복문;

import javax.swing.JOptionPane;

public class 반복문2 {
	public static void main(String[] args) {
		for(; ;) { //무한 루프(반복)
			System.out.println("잘 쓰지 않음");
			String data = JOptionPane.showInputDialog("종료하려면 y를 입력");
			//== 연산자는 비교데이터만 가능 string은 기본데이터 x
			//string 부품에서 제공하는 기능을 사용해야함.
			if (data.equals("y")) {
				System.out.println("안녕히 가세용");
				break; //for문의 break
			}
		}
	}

}
