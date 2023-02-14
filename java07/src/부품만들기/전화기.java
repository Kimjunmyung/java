package 부품만들기;

public class 전화기 {
	//클래스는 성질(멤버변수),동작(멤버메서드,멤버함수)
	//전화기를 예로 들었을 때, 전화기의 성질(멤버변수)는 가격, 모양 등
	public int price; //멤버변수는 자동초기화 (0)
	public String shape; // 기본형이 아닌 경우(참조형) 모두 null로 초기화
	// public -> 다른 패키지에서도 접근 가능해라
	
	
	//동작(멤버메서드,함수)는 전화하다, 카톡하다 등등
	public void 인터넷하다() {
		//기능 처리 방법을 나열
		System.out.println("와이파이 연결");
		System.out.println("데이터 연결");
	}
	public void 카톡하다() {
		System.out.println("단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
}
