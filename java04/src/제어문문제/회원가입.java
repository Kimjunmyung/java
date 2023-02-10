package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입 {
	public static void main(String[] args) {
		//자주 사용하지 않는 부품을 만들어보자.
		//틀이 있어 그 틀을 가지고 찍어서 필요한 부품을 만들어 cpu가 조립.
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을  찍어내라
		//만든 부품은 모두 ram에 저장되어야 함
		//f변수 만들어서 부품을 넣어주세요
		JFrame f = new JFrame();
		f.setSize(330,400);
		
		
		//물 흐르듯이 순서대로 복사해주는 부품을 램에 복사해서 가져다 놓기.
		//f에 물 흐르듯이 배치해주는 부품을 쓰겠다 -> FlowLayout
		FlowLayout flow = new FlowLayout();//물 흐르듯 배치
		f.setLayout(flow);
		
		
		JLabel text1 = new JLabel(); 
		text1.setText("아이디 입력");
		
		JLabel text2 = new JLabel(); 
		text2.setText("비밀번호 입력");
		
		JLabel text3 = new JLabel(); 
		text3.setText("이름 입력");
		
		JLabel text4 = new JLabel(); 
		text4.setText("전화번호 입력");
		
		JLabel text5 = new JLabel(); 
		text5.setText("회원가입");
		
		JLabel text6 = new JLabel(); 
		text6.setText("로그인 결과");
		
		
		
		
		
		JTextField id = new JTextField(15);
		JTextField pw = new JTextField(15);
		JTextField name = new JTextField(15);
		JTextField phone = new JTextField(15);
	
		
		
		ImageIcon icon1 = new ImageIcon("1234.png");
		
		Font font = new Font("굴림", 1, 20);
		
		JButton b1 = new JButton();	
		

		text1.setFont(font);
		id.setFont(font);
		text2.setFont(font);
		pw.setFont(font);
		text3.setFont(font);
		name.setFont(font);
		text4.setFont(font);
		phone.setFont(font);
		text5.setFont(font);
		text5.setForeground(Color.green);
		
		f.add(text5);
		f.add(text1);
		f.add(id);
		f.add(text2);
		f.add(pw);
		f.add(text3);
		f.add(name);
		f.add(text4);
		f.add(phone);
		f.add(text6);
	
		b1.setIcon(icon1);
		
		
		
	}

}
