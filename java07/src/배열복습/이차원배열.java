package 배열복습;

public class 이차원배열 {
	public static void main(String[] args) {
		//배열을 만들때 이미 알고 있는경우
		int[][] n1  = {
				
			//j   0 1 2     i
				 {1,2,3}, //0
				 {4,5,6}  //1
		};
		System.out.println(n1.length);
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) { //행
			for (int j = 0; j < n1.length; j++) { //열
				System.out.println(n1[i][j]);
			}
		}
		//배열을 만들때 아직 모를 경우 , 공간을 먼저 만든다.
		int[][] n2  = new int[2][3];
		
	}
}
