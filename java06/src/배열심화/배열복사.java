package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		int[] num1 = {100,200,300};
		int[] num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num1[0] = 999;
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]+ " ");
		}
		System.out.println();
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i] + " ");  //--> 주소값만 복사되고 내용은 같은 내용을 가르키기 때문에 num1만 바꿔도 num2까지 같이 바뀜
		}
		//////////////////////////////////얕은 복사//////////////////////
		
		int[] num3 = {100,200,300};
		int[] num4 = num3.clone(); //num4가 num3의 배열내용 까지 복사함. -> clone()
		System.out.println(num1);
		System.out.println(num2);
		
		num3[0] = 999;
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num2[i]+ " ");
		}
		System.out.println();
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num2[i] + " ");  //--> 주소값만 복사되고 내용은 같은 내용을 가르키기 때문에 num1만 바꿔도 num2까지 같이 바뀜
		}
	}

}
