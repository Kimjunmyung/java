package BMI;

import javax.swing.JOptionPane;

public class BMI계산기 {
	private void main(String[] args) {
		// bmi = (키 - 체중*100)
		
		//입력
		String height = JOptionPane.showInputDialog("키를 입력하세요");
		String weight =JOptionPane.showInputDialog("키를 입력하세요");
		//처리
		double data1 = Double.parseDouble(height);
		double data2 = Double.parseDouble(weight);
		//출력
		double result = (data1 - data2) *0.9;
	}

}
