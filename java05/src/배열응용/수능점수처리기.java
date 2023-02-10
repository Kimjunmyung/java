package 배열응용;

import java.util.Random;

public class 수능점수처리기 {
	public static void main(String[] args) {
		//수능 10000명의 점수를 처리  ==> 배열 필요
		int[] jumsu = new int[10000]; // ==> jumsu = {0,0,0,0.....}
		//랜덤을 10000명을 넣어준다. ==> 랜덤 필요
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); //0-450점의 점수 랜덤으로 시드값 42
		}
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + ": " + jumsu[i]);
		}
		System.out.println("--------------------------------");
	
		//1)만점자와 0점자가 몇명인지 (인덱스)
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : jumsu) {
			if (x == 450) {
				maxCount++; //maxCount = maxCount+1
			} 
			if (x == 0) {
				zeroCount++; //maxCount = maxCount+1
			} 
		}
		System.out.println("수능 만점자: " + maxCount + "명");
		System.out.println("수능 0점자: " + zeroCount + "명");
		//3) 평균은 어떤지?? 합계를 먼저 구해야 함.
		int sum = 0;
		for (int x : jumsu) {
			sum= sum + x;
		}
		double avg = (double)sum / jumsu.length;
		System.out.println("전체 수험생의 평균은" + (double)sum / jumsu.length);
		
		//평균보다 +-50점 인 학생 카운트(포함,>=)
		int avgPlusMinus = 0;
		//250 <= avg <= 350, avg = 300인 경우수능점수처리기.java
		for (int x : jumsu) {
			if ((avg-50 <= x)&& (x <= avg+50)) {
				avgPlusMinus++;
			}
			
		}
		System.out.println("평균 범위에 있는 수험생 수는 " + avgPlusMinus + "명");
		
	}

}
