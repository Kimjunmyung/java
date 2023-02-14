package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.FloatBuffer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	//멤버변수
	//멤버함수
	public void open( ) {
		//JFrame화면이 보이게
		System.out.println("화면이 open됩니다..");
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setSize(600, 400);
		f.getContentPane().setBackground(Color.cyan);
		
		Font font = new Font("굴림", 1, 30);
		
		JLabel date = new JLabel("오늘의 날짜");
		date.setFont(font);
		JLabel title = new JLabel("오늘의 제목");
		title.setFont(font);
		JLabel content = new JLabel("오늘의 내용");
		content.setFont(font);
		
		JTextField dateText = new JTextField(10);
		dateText.setFont(font);
		JTextField titleText= new JTextField(10);
		titleText.setFont(font);
		JTextArea contentText = new JTextArea(5, 10);
		contentText.setFont(font);
		
		JButton save = new JButton("파일에 일기 저장");
		save.setFont(font);
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String date2 = dateText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(date2 + " " + title2 + " " + content2);
				
				// 파일을 만들기 위해 자바프로그램과 file간의 연결통로(stream)를 만들어 줌.
				// 외부에 있는 파일, 네트워크나 cpu등을 자바에서 연결 할 때는 아주 위험한 상황이라고 인식.
				// 이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리해야 할 지 명시(try catch)해야 함.
				try {
					FileWriter file = new FileWriter(date2 + ".txt");
					file.write(date2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close(); //외부와 연결되면서 생긴 통로를 닫아줘야함.
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제가 생김.");
				}
			}
		});
		
		f.add(date); f.add(dateText);
		f.add(title); f.add(titleText);
		f.add(content); f.add(contentText);
		f.add(save); 
		
		
		f.setVisible(true);
	}
}
