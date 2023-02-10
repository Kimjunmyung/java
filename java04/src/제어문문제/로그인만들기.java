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

public class 로그인만들기 {
	public static void main(String[] args) {
		//자주 사용하지 않는 부품을 만들어보자.
		//틀이 있어 그 틀을 가지고 찍어서 필요한 부품을 만들어 cpu가 조립.
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을  찍어내라
		//만든 부품은 모두 ram에 저장되어야 함
		//f변수 만들어서 부품을 넣어주세요
		JFrame f = new JFrame();
		f.setSize(250,300);
		
		
		//물 흐르듯이 순서대로 복사해주는 부품을 램에 복사해서 가져다 놓기.
		//f에 물 흐르듯이 배치해주는 부품을 쓰겠다 -> FlowLayout
		FlowLayout flow = new FlowLayout();//물 흐르듯 배치
		f.setLayout(flow);
		
		
		JLabel id = new JLabel(); 
		id.setText("아이디");
		
		JLabel pw = new JLabel(); 
		pw.setText("비밀번호");
		
		JLabel result = new JLabel(); 
		result.setText("로그인 결과");
		
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		JButton b1 = new JButton();	
		b1.setText("");
		
		ImageIcon icon1 = new ImageIcon("1234.png");
		
		Font font = new Font("굴림", 1, 20);
		
		
		

		
		id.setFont(font);
		pw.setFont(font);
		
		input1.setFont(font);
		input2.setFont(font);
		
		f.add(id);
		f.add(input1);
		f.add(pw);
		f.add(input2);
		f.add(b1);
		f.add(result);
		
		b1.setFont(font);
		b1.setIcon(icon1);
		
		result.setForeground(Color.red);
		result.setFont(font);
		
		f.setVisible(true);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = input1.getText();
				String pw2 = input2.getText();
				if (id2.equals("root")&& pw2.equals("1234")) {
					result.setText("로그인 성공");
				}else {
					result.setText("로그인 실패");
				}
				
			}
		});
	}

}
