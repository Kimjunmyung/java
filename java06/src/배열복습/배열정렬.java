package 배열복습;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class 배열정렬 {

	public static void main(String[] args) {
		//정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		
		//일반 for문: 입력,출력, i변수 활용가능
		for (int i = 0; i < jumsu.length; i++) {
		jumsu[i] = r.nextInt(1000) +1;//1~1000
		}
		
		//for-each: 알아서 위치값을 옮겨주면서 하나씩, 출력용
		for (int x : jumsu) {
			System.out.println(x);
		}
		//오름차순 정렬
		Arrays.sort(jumsu); //sort : 정렬
		//jumsu가 sort로 인해서 바뀌어버림(원본이 파괴)
		
        //String n = JOptionPane.showInputDialog("숫자입력");
        //int n2 = Integer.parseInt(n);
        //parseInt(n) ==> ram에 저장된 n이 변경된 건 아님(원본이 비파괴)
        //비파괴형 함수
		
		
		System.out.println("-------------------------");
		
		//정렬 후 확인
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		//정렬후, 최대값, 최소값을 프린트
		System.out.println("최소값"+ jumsu[0]); //최소값은 정렬 후 제일 첫번째 인덱스에 있기때문에 [0]으로
		System.out.println("최대값"+ jumsu[jumsu.length - 1]); //최대값은 배열의 length-1(length가 내가 설정한 최대값 +1 이기때문)
		
		//상위 30%, 인원3000명, 높은 점수부터 3000개 추출
		int top30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			top30 = top30 + jumsu[i]; //sum += i;
		}
		System.out.println("상위 30%평균" + (top30 / 3000.0));
		//하위 30%, 인원이3000명
		int low30 = 0;
		for (int i = 0; i < 3000; i++) {
			low30 = low30 + jumsu[i]; //sum += i;
		}
		System.out.println("하위 30%평균" + (low30 / 3000.0));
		
		//String result = Arrays.toString(jumsu);/비파괴, 주소 안에 있는 모든 배열을 String으로 만들어주는 함수
	}

}
