package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		
		String workOut = JOptionPane.showInputDialog("당신이 좋아하는 운동은?"); //input(입력)
		
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?"); //input(입력)
		
		String resultw = "내가 좋아하는 운동은 " + workOut + "이고, " + day + "에 하는걸 좋아합니다." ;
		
		System.out.println(resultw);

	}

}
