package 배열복습;

import java.awt.Color;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		//1. 프레임 만듦.
		//2. 프레임 설정
		//3. 버튼을 넣을 배열을 만들기. 500개
		//4. 버튼틀 200개 만들어서 배열에 넣기
		//5. 배열에 있는 버튼을 꺼내서 위치를 지정후, f에 붙여주기
		
		//1,2
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		
		
		//3.
		JButton[] buttons = new JButton[500]; //기본형이 아닌 데이터는 참조형 데이터
		//참조형은 배열에 null로 초기화
		
		//4.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}
		
		//5.
		f.setLayout(null);
		
		Random r = new Random(42);
		
		Color[] colors = {Color.red, Color.CYAN, Color.yellow};
		
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(700);
			int y = r.nextInt(800);
			buttons[i].setBounds(x, y, 100, 80);
			buttons[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(buttons[i]);
			
		}
		f.getContentPane().setBackground(Color.cyan);
		f.setVisible(true);
		
	}

}
