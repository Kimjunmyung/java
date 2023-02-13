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

public class 극장예매시스템2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setSize(1000, 600);
		JButton[] bt = new JButton[101];
		Font font1 = new Font("굴림",1,30);
		Font font2 = new Font("궁서",1,25);
		Font font3 = new Font("굴림",3,25);
		JLabel result = new JLabel("예약");
		int seat[] = new int [bt.length]; // 예약이 됐을때 들어갈 정보의 배열 생성
		JButton total = new JButton();
		
		
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new JButton(i+""); // 버튼에다 인덱스의 숫자표시
			bt[i].setFont(font1);
			result.setFont(font2);
			f.add(bt[i]);
			f.add(result);
			f.add(total);
			total.setFont(font3);
			total.setText("최종금액");
			
			
			bt[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) { //버튼 눌렀을때 액션
					String text = e.getActionCommand();
					int no = Integer.parseInt(text); //버튼울 눌렀을때의 받아올 인덱스 번호를 int형으로 바꿔줌
					result.setText(text + "번 예약완료.");
					bt[no].setBackground(Color.red);
					bt[no].setForeground(Color.green);
					bt[no].setEnabled(false); //버튼 비활성화
					seat[no] = 1;
				}
				
			});
		}
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, ("예약된 총 자리는"+count+"석," +"총 가격은"+ count * 10000)+"원 입니다.");
				
			}
		});
		f.setLayout(flow);
		f.setVisible(true);
	}
}
