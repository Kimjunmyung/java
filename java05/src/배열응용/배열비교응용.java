package 배열응용;

public class 배열비교응용 {
	public static void main(String[] args) {
		
		//1. 1학기 성적이 오른 학생 몇명?
		//2. 1학기, 2학기 성적이 동일한 학생은 몇명?
		//3. 2학기 학생중 만점(100)인 학생의 이름과 번호는?
		//4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요??
		//5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		
		String[] name = {"홍길동", "이순신", "뉴진스", "방탄", "블랙핑크"};
		int[] term = {77,88,99,55,70};
		int[] term2 = {99,100,88,80,70};
		
		int up = 0; //2학기 성적이 오른 학생 몇명?
		int same = 0; //성적이 동일한 학생수
		int sum = 0; //1학기 모든 성적을 더한 값
		int sum2 = 0; //2학기 모든 성적을 더한 값
		//1,2
		for (int i = 0; i < term2.length; i++) {
			if (term[i]<term2[i]) {
				up++;
			}else if (term[i] == term2[i]) {
				same++;
			}
		}
		//3
		System.out.println("2학기 성적이 오른 학생수는 " + up + " 명 입니다.");
		System.out.println("1학기와 2학기 성적이 동일한 학생 수는 "+ same +" 명 입니다.");
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("만점 학생의 이름은 " + name[i] + " 입니다");
			}
		}
		
		//4
		for (int i = 0; i < term2.length; i++) {
			sum = sum + term[i];
			sum2 = sum2 + term2[i];			
		}
		double ave1 = (double)sum / term.length;
		double ave2 = (double)sum2 / term2.length;
		if (ave1 > ave2) {
			System.out.println("1학기 평균이  더 높습니다.");
		}else if(ave1 < ave2){
			System.out.println("2학기 평균이  더 높습니다.");
		}else {
			System.out.println("1,2학기 평균 성적이 동일합니다.");
		}
		
		//5
		for (int i = 0; i < term2.length; i++) {
			if (name[i].contentEquals("뉴진스")) {
				System.out.println("뉴진스의 위치는 " + i);
				System.out.println("뉴진스의 1학기 성적은 " + term[i] + "입니다");
				System.out.println("뉴진스의 2학기 성적은 " + term2[i] + "입니다");
			}
		}
		

		
		
		
	}
}
