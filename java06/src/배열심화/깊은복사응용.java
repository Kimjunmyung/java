package 배열심화;

public class 깊은복사응용 {
	public static void main(String[] args) {
		String[] 과목 = {"국어", "영어", "수학","컴퓨터","회화"}; 
		int[] 학기1성적 = {44,66,22,99,100};
		int[] 학기2성적 = 학기1성적.clone(); //학기1성적을 깊은 복사를 통해 학기2성적으로 복사
		
		System.out.println(학기1성적 == 학기2성적); //가리키는 주소가 같은지 판별 => 아예 복사가 된것이므로 가르키는 주소가 같으면 안됨. false가 정상
		System.out.println();
		학기2성적[0] = 22;
		학기2성적[2] = 88;  //==> 학기 1성적을 복사해와 학기2성적을 만들고 학기2성적 중에서 [0]과 [2]에 들어간 성적만 수정
		System.out.println("1학기 성적은");
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.println(과목[i]+ " " + 학기1성적[i]+ " ");
		}
		
		System.out.println("-------------------------------");
		System.out.println("2학기 성적은");
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.println(과목[i]+ " " + 학기2성적[i]+ " ");
		}
		int samecount = 0;
		int upcount = 0;
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				samecount++;
			}else if (학기1성적[i] < 학기2성적[i]) {
				upcount++;
				System.out.println("\n성적이 오른 과목은 " + 과목[i]);
			}
		}
		System.out.println();
		System.out.println("동일한 과목수는:" + samecount);
		System.out.println("상승한 과목수는:" + upcount);
		}
}
