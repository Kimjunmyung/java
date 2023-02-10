package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.beancontext.BeanContext;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 반복문3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton b1 = new JButton();		
		JButton b2 = new JButton();		
		JButton b3 = new JButton();		
		JButton b4 = new JButton();	
		Font font = new Font("DCoding2",1,20);
		
		
		FlowLayout flow = new FlowLayout();
		
		b1.setText("별 10개");
		b1.setFont(font);
		b1.setBackground(Color.green);
		
		b2.setText("커피 *5");
		b2.setFont(font);
		b2.setBackground(Color.cyan);
		
		b3.setText("커피* 우유3");
		b3.setFont(font);
		b3.setBackground(Color.green);
		
		b4.setText("1:짱!");
		b4.setFont(font);
		b4.setBackground(Color.cyan);
	
		f.setSize(400, 500);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.yellow);
		
		//(1)버튼에 액션 기능을 추가
		//(2)클릭 액션이 있을 때, 어떤 부품이 액션 처리를 어떻게 할 지 코딩
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때, 처리 내용을 여기에
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
			}
				System.out.println();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
			}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때, 처리 내용을 여기에
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
			}
				System.out.println();
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때, 처리 내용을 여기에
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1)+": 짱!");
			}
				System.out.println();
			}
		});
		
		f.setVisible(true);
		
		
	}

}
