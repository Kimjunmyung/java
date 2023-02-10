package 배열응용;

public class 배열비교 {
	public static void main(String[] args) {
		
		
		int[] n1 = {11,22,33,44,55};
		int[] n2 = {11,22,34,45,55};
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < n2.length; i++) {
//			System.out.println(n1[i] == n2[i]);
			if (n1[i]==n2[i]) {
				count1++;
			}else {
				count2++;
			}
		}
		System.out.println("동일한 숫자 갯수 " + count1);
		System.out.println("동일하지 않은 숫자 갯수 " + count2);
		
	}
}
