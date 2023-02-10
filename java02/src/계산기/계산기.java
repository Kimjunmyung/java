package 계산기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class 계산기 {
	public static void main(String[] args) {
	// 필요한 부품 10개
	// JFrame, ImageIcon, JLabel 3개
	// Font, FlowLayout
	// JTextFiled 2개
	// Jbutton
		JFrame f =new JFrame();	
		f.setSize(200, 500);
		
		ImageIcon icon = new ImageIcon("계산기.jpg");
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		
		
		JTextField data1 = new JTextField(10);
		JTextField data2 = new JTextField(10);
		
		Font font = new Font("d2", 1, 30);
		FlowLayout flow= new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		f.add(label1);
		f.add(label2);
		f.add(data1);
		f.add(label3);
		f.add(data2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		label1.setForeground(Color.blue);
		label1.setForeground(Color.blue);
		data1.setForeground(Color.green);
		data1.setBackground(Color.yellow);
		data2.setForeground(Color.green);
		data2.setBackground(Color.yellow);
		
		f.setVisible(true);
	}

}
