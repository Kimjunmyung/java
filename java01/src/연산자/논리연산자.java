package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
	//논리적으로 판단하고 싶은데, 조건이 2개 이상이라 어떻게 판단해야할지 모르는경우 사용
		int id1 = 1111;
		int id2 = 2222;
		
		int pw1 = 3333;
		int pw2 = 3333;
		
		
		System.out.println(id1 == id2);
		System.out.println(pw1 == pw2);
		//&& and 조건, 두 조건이 모두 맞아야 맞다라고 판단
		System.out.println(id1 == id2 && pw1 == pw2);
		
		int mem1 = 111;
		int mem2 = 221;
		
		System.out.println(mem1 == 111 || mem2 == 222);
	}

}
