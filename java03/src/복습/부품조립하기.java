package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1.자주써서 RAM에 언제든 사용될 수 있도록 준비되어있음.
		// 망치
		// 부품명.기능()
		
		// 2.쓸 때마다 제공되는 틀을 이용해서 찍어내려 여러개 만들어 RAM에  저장
		// 벽돌
		// JFrame f= new JFrame();
		JFrame f = new JFrame();
		f.setSize(350, 500);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요");
		JTextField text = new JTextField(10);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding",1,20);
		
		//프레임에 각종 입력
		f.setLayout(flow);
		f.add(l); //f라는 부품위에 조립해서 얹어라
		f.add(text);
		f.add(b);
		
		//라벨 폰트, 글자 색
		l.setFont(font);
		l.setForeground(Color.blue);
		
		
		text.setFont(font);
		text.setBackground(Color.yellow);
		text.setForeground(Color.red);
		
		b.setBackground(Color.blue);
		b.setText("숫자 맞추기 게임");
		b.setForeground(Color.green);
		b.setFont(font);
		
		f.setVisible(true);
	}

}
