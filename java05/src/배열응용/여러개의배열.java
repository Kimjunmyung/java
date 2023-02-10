package 배열응용;

public class 여러개의배열 {

	public static void main(String[] args) {
		//여러개의 배열을 사용하는 경우
		//각각의 배열에 대한 인덱스를 통일시킬것 ex)아버지에 관한 정보는 모두 첫번째 인덱스에 저장
		String[] family = {"아버지","어머니","동생","나"};
		int[] age = {50, 40, 30, 25};
		double[] height = {175.5, 155.6, 176.3, 180.3};
		
		System.out.println("우리집 식구 정리");
		System.out.println("------------------");
		System.out.println("이름\t나이\t키");
		System.out.println("------------------");
		for (int i = 0; i < height.length; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);
		}
	
	}

}
