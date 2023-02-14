package 배열복습;

public class 이차원배열2 {
	public static void main(String[] args) {
		String[][] s = {
				{"일본","태국","베트남"},
				{"스웨덴","영국","프랑스"},
				{"스위스","독일","이탈리아"},
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
		
	}
}
