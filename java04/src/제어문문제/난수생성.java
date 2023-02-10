package 제어문문제;

import java.util.Random;

public class 난수생성 {
	public static void main(String[] args) {
		//아무 값이나 발생시키는 부품 == Random
		//가짜 랜덤을 만들어주는 부품.
		Random r = new Random(10); //씨앗값(seed) Random에 10을 넣으면 10이라는 시드값에 있는 값이 출력됨
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호" + r.nextInt(10));//0~9
		}
	}
}
