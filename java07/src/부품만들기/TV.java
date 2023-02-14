package 부품만들기;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 때문에 
	//클래스 전체 영역에서 이 변수를 사용 가능
	//전역변수(global 변수, 글로벌 변수)
	public int ch; //0으로 자동초기화
	public int vol;
	public boolean onOff; //false로 자동초기화
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수, 로컬변수, 로컬변수는 자동초기화 x
		System.out.println(ch + "에서" + change + "로 바꾸다");
	}
	
	public void 유튜브보다() { //메서드를 만드는것 -> 메서드를 정의한다.
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
