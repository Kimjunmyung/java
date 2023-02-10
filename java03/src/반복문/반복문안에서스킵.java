package 반복문;

public class 반복문안에서스킵 {
	public static void main(String[] args) {
		//1번부터 10번까지 데이터 중 짝수만 프린트
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}else if (i == 8){
				System.out.println("끝");
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("끝났다리");
	}
}
