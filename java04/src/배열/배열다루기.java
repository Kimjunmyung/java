package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		//반복문으로 여러개의 배열 출력하기
		int[] x = new int[10];
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) { //index는 0부터 마지막, 마지막 위치의 인덱스는 10보다 작음
			System.out.print(x[i] + " ");
		}

		
		System.out.println();
		char[] family = {'남','남','남','여'};
		
		for (int i = 0; i < 4; i++) { //index는 0부터 마지막, 마지막 위치의 인덱스는 10보다 작음
			System.out.println("우리가족의 성별은" +family[i] + "입니다. ");
		}
		
		System.out.println();
		String[] name = {"저팔계","사오정","홍길동","삼장법사"};
		
		for (int i = 0; i < 4; i++) { //index는 0부터 마지막, 마지막 위치의 인덱스는 10보다 작음
			System.out.println(name[i] + " ");
		}
		
		System.out.println();
		double[] eye = {1.0,0.7,1.2,0.8};
		
		for (int i = 0; i < 4; i++) { //index는 0부터 마지막, 마지막 위치의 인덱스는 10보다 작음
			System.out.print(eye[i] + " ");
		}
		
		System.out.println();
		boolean[] lunch = {true,true,false,false};
		
		for (int i = 0; i < 4; i++) { //index는 0부터 마지막, 마지막 위치의 인덱스는 10보다 작음
			System.out.print(lunch[i] + " ");
		}
		
	}

}
