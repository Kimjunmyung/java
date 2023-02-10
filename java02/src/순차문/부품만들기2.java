package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {
	public static void main(String[] args) {
		//자주 사용하지 않는 부품을 만들어보자.
		//틀이 있어 그 틀을 가지고 찍어서 필요한 부품을 만들어 cpu가 조립.
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을  찍어내라
		//만든 부품은 모두 ram에 저장되어야 함
		//f변수 만들어서 부품을 넣어주세요
		JFrame f = new JFrame();
		f.setSize(500,700);
		
		
		//물 흐르듯이 순서대로 복사해주는 부품을 램에 복사해서 가져다 놓기.
		//f에 물 흐르듯이 배치해주는 부품을 쓰겠다 -> FlowLayout
		FlowLayout flow = new FlowLayout();//물 흐르듯 배치
		f.setLayout(flow);
		JButton b1 = new JButton();	
		b1.setText("아이디");
		
		JButton b2 = new JButton();	
		b2.setText("비밀번호");
		
		JLabel text1 = new JLabel(); //글자를 넣고싶을때
		text1.setText("아이디");
		
		JLabel text2 = new JLabel(); //글자를 넣고싶을때
		text2.setText("비밀번호");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		
		Font font = new Font("궁서", 1, 15);
		
		ImageIcon icon1 = new ImageIcon("kygo.jpg");
		ImageIcon icon2 = new ImageIcon("kygo2.jpg");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);

		
		text1.setFont(font);
		text2.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
		
	}

}
