package 부품사용하기;

import 부품만들기.강아지;

public class 강아지표현 {
	public static void main(String[] args) {
		강아지 retriever = new 강아지();
		retriever.sound = "멍멍";
		retriever.character = "활발";
		retriever.감정표현();
		System.out.println("리트리버의 짖는 소리는 " + retriever.sound);
		System.out.println("리트리버의 성격은 " + retriever.character);
		
		System.out.println();
		
		강아지 beagle = new 강아지();
		beagle.sound = "왈왈";
		beagle.character = "매우활발";
		beagle.놀기();
		System.out.println("비글의 짖는 소리는 " + beagle.sound);
		System.out.println("비글의 성격은 " + beagle.character);
	}
}
