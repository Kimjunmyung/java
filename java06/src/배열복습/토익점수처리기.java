package 배열복습;

import java.util.Random;

public class 토익점수처리기 {

	public static void main(String[] args) {
		//	입력 : 많은 양의 저장공간(배열, 2개)
		//	배열 하나당 990개의 저장공간 필요, 
		//	실제 생성된 저장공간개수(990+1+1) * 2 -> 토익문제 990개 + 배열길이 + 변수가 들어갈 자리
		//	랜덤으로 데이터를 입력(Random)
		//	반복문으로 배열 위치 (인덱스)를 옮기면서 데이터를 넣자.
		int[] answer = new int[991];
		int[] myanswer = new int[991];
		System.out.println(answer.length);
		System.out.println(myanswer.length);
		System.out.println(answer);
		System.out.println(myanswer);
		
		Random r = new Random(42); //랜덤으로 문제의 답 생성 시드값 42
		for (int i = 0; i < myanswer.length; i++) {
			answer[i] = r.nextInt(4) +1; //nextInt() 괄호 안에 들어가는 수 -1 의 수 까지만 랜덤으로 생성 
			myanswer[i] = r.nextInt(4) +1; //ex) 5지선다 문제의 경우 괄호안에 6을 넣거나 (4)+1을 넣어주면 5이하의 수로 랜덤 생성
		}
		for (int i = 0; i < myanswer.length; i++) {
			System.out.println("번호\t:\t답안\t\t내답");
			System.out.println(i+"\t:\t" + answer[i] + "\t<->\t" + myanswer[i]);
		}
		//동일하면 1점씩 획득
		int jumsu = 0;
		for (int i = 0; i < myanswer.length; i++) {
			if(myanswer[i] == answer[i]) {
				jumsu++;
			}
		}
		System.out.println("내 점수는 " + jumsu +"점 입니다");
	}

}
