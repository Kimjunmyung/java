package 제어문문제;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class 인기투표시스템3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,700);
		
		
	
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		JLabel l1 = new JLabel(); 
		JLabel l2 = new JLabel(); 
		JLabel l3 = new JLabel(); 
		JLabel l4 = new JLabel(); 
		
		JLabel l5 = new JLabel(); 
		JLabel l6 = new JLabel(); 
		JLabel l7 = new JLabel(); 
		
		
		
		Font font = new Font("굴림", 3, 30);
		Font font2 = new Font("굴림", 2, 20);
		
		ImageIcon icon1 = new ImageIcon("ditto.jpg");
		ImageIcon icon2 = new ImageIcon("younha.jpg");
		ImageIcon icon3 = new ImageIcon("ive.jpg");
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
	
		
		l1.setText("노래 인기 투표 시스템");
		l1.setFont(font);
		
		l2.setText("뉴진스");
		l2.setFont(font2);
		
		l3.setText("윤하");
		l3.setFont(font2);
		
		l4.setText("아이브");
		l4.setFont(font2);
		
	
		l5.setFont(font2);
		
		
		l6.setFont(font2);
		
		
		l7.setFont(font2);
	
		
		f.add(l1);
		
		f.add(b1);
		f.add(l2);
		f.add(l5);
		
		f.add(b2);
		f.add(l3);
		f.add(l6);
		
		f.add(b3);
		f.add(l4);
		f.add(l7);
	
		b1.addActionListener(new ActionListener() {
			int njs = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				njs++;
				l5.setText(njs + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int younha = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				younha++;
				l6.setText(younha + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int ive = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				ive++;
				l7.setText(ive + "표");
			}
		});
		
	
		
		
		f.setVisible(true);
		
	}

}
