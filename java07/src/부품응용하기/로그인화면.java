package 부품응용하기;

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

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 로그인화면 {

	public static void main(String[] args) {
		//f,  JFrame , imageicon, imagelabel,
		//idlabel, pwlabel, id입력칸, pw입력칸
		//로그인 버튼, reset버튼
		//font, flowlayout
		JFrame f = new JFrame();
		f.setTitle("나의 일기장 로그인");
		f.setSize(600, 950);
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("굴림", 1, 30);
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디 :");
		JLabel pw = new JLabel("비밀번호 :");
		id.setFont(font);
		pw.setFont(font);
		
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);
		
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);
		
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		
		//1)버튼에 액션기능 add
		//2)클릭했을때 '어떤 부품이' 처리를 담당할지 new로 만들자
		//3)클릭했을때 "어떻게 처리를 할 지 
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때, idText, pwText에 공백을 넣어라
				idText.setText("");
				pwText.setText("");
				
			}
		});
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String id2 = idText.getText(); //"root"
				String pw2 = pwText.getText();// "1234"
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//로그인 성공시 일기장쓰기 부품의 open()기능
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패!");
				}
				
			}
		});
		
		f.add(top);
		f.add(id); f.add(idText);
		f.add(pw); f.add(pwText);
		f.add(login); f.add(reset);
		
		f.setVisible(true);

	}

}
