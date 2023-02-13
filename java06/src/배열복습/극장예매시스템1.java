package 배열복습;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(1000, 900);
		JLabel title = new JLabel();
		FlowLayout flow = new FlowLayout();
		
		JButton[] btn = new JButton[100]; //버튼 10개 추가
		JButton total = new JButton();
		Font font = new Font("굴림",Font.BOLD,50);
		Font font2 = new Font("굴림",Font.BOLD,25);
		
		
		
		JLabel result = new JLabel("결과 보이는곳 ");
		result.setFont(font2);
		result.setForeground(Color.red);
		
		//예약 여부를 저장하는 배열
		int[] seat = new int[btn.length];
		//각 자리에 저장된 값이 0이면 아직 미예약, 예약되면 1로 바뀜
		
		//버튼 배열 많이 만들어서 집어 넣을 배열 생성
		//반복해서 f에 add
		for (int i = 0; i < btn.length; i++) {
			btn[i]  = new JButton(i + ""); // + "" 넣는 이유 = 괄호 안은 무조건 String으로 인식하는데 i는 int이기 때문에
			btn[i].setFont(font);									//string으로 바꿔주는 방법
			total.setFont(font2);
			
			f.add(btn[i]);
			f.add(total);
			total.setText("최종금액");
			
			//버튼에 액션 추가
			btn[i].addActionListener(new ActionListener() { //버튼에 액션 추가
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand(); //e.getActionCommand()클릭한 버튼의 글자를 가지고와줌
					System.out.println(text);
					int no = Integer.parseInt(text);
					//이미 해당 좌석번호가 1로 저장되어 있는지
					if (seat[no] == 1 ) {
						result.setText(text + "번은 이미 예약된 자리입니다.");
					}else {
						result.setText(text + "번 예약완료.");
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false); //버튼 비활성화
					}
					seat[no] = 1;
				}
			});
			
		}
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : seat) {
					if ( x == 1) {
						count++;
					}
					
				}
				JOptionPane.showMessageDialog(f, (count * 10000)+"원 입니다.");
			}
			
		});
		
		f.add(result);
		f.setLayout(flow);
		f.setVisible(true);
		
	}
}
