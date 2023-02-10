package 배열;

public class 배열총정리 {

	public static void main(String[] args) {
		int[]x = new int[5];
		x[0] = 100;
		x[4] = 500;
		x[2] = 200;
		for (int i = 0; i < 5; i++) { //index는 0부터 마지막, 마지막 위치의 인덱스는 10보다 작음
			System.out.print(x[i] + " ");
		}
		System.out.println("배열의 길이는 "+x.length);
		System.out.println(x[0]);

	}

}
