package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기1 {
	public static void main(String[] args) {
		//자주 사용하지 않는 부품을 만들어보자.
		//틀이 있어 그 틀을 가지고 찍어서 필요한 부품을 만들어 cpu가 조립.
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을  찍어내라
		//만든 부품은 모두 ram에 저장되어야 함
		//f변수 만들어서 부품을 넣어주세요
		JFrame f = new JFrame();
		f.setSize(500, 300);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼");
		b1.setSize(100,70);
		
		f.add(b1);
		
		//출력은 항상 맨 끝으로
		f.setVisible(true);
	}

}
