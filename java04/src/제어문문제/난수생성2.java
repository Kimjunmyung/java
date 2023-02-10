package 제어문문제;

import java.util.Random;

public class 난수생성2 {
	public static void main(String[] args) {
		
		Random r = new Random(10); 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호" + r.nextInt(45) + 1);//최소값을 넣어주려면 +x 해주면 됨
		}
		
		//2~10
		Random a = new Random(); 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호" + (a.nextInt(9) + 2)); //2가 최소값 -> (0~8)+ 2
		}
		
		//3~30
		Random b = new Random(); 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호" + (b.nextInt(28) + 3));//3이 최소값 -> (0~27)+ 3
		}
		
	}
}
