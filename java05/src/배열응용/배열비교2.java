package 배열응용;

import java.util.Random;

public class 배열비교2 {
	public static void main(String[] args) {
		
		Random r = new Random(42); //시드값 42를 가진 난수 생성
		int[] n1 = new int[10000]; //n1배열에 1000크기의 공간 생성
		int[] n2 = new int[10000]; //n2배열에 1000크기의 공간 생성
	
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101); //101 미만의 숫자 랜덤으로 생성
		}
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i]==n2[i]);
			if (n1[i] == n2[i]) {
				count1++;
			}else  {
				count2++;
			}
			
			if (n1[i] > n2[i]) {
				count3++;
			}else {
				count4++;
			
			}
		}
		System.out.println("동일한 숫자 갯수 " + count1);
		System.out.println("동일하지 않은 숫자 갯수 " + count2);
		System.out.println("배열1의 숫자가 배열2의 숫자보다 큰 경우" + count3);
		System.out.println("배열2의 숫자가 배열1의 숫자보다 큰 경우" + count4);
		
	}
}
