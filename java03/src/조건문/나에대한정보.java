package 조건문;

import java.util.Scanner;

public class 나에대한정보 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나에 대한 정보 입력");
		System.out.println("-----------------");
		
		System.out.print("이름 입력 >>");
		String name = sc.next(); //단어
		
		System.out.print("나이 입력 >>");
		int age = sc.nextInt(); //숫자
		
		System.out.print("취미 입력 >>");
		String hobby = sc.next(); //단어
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는 " + age + "살 입니다.");
		System.out.println("나의 취미는 " + hobby + "입니다.");
		
		sc.close();
	}

}
