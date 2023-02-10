package 조건문;

import java.util.Scanner;

public class 나에대한정보2 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나에 대한 정보 입력");
		System.out.println("-----------------");
		
		System.out.print("이름 입력 >>");
		String name = sc.next(); //단어
		
		System.out.print("나의 키 입력 >>");
		double height = sc.nextDouble(); //소수점
		
		System.out.print("나의 몸무게 입력 >>");
		double weight = sc.nextDouble(); //소수점
		
		System.out.print("나는 저녁밥을 먹었는지(ture/false) >>");
		Boolean dinner = sc.nextBoolean(); // 조건
		
		System.out.print("좌우명 입력 >>");
		sc.nextLine();
		String mind = sc.nextLine(); //한줄 다
		
		System.out.println("나의 이름은 " + name + " 입니다.");
		System.out.println("나의 내년 키는 " + (height + 5) + " 입니다.");
		System.out.println("나의 내년 키는 " + (weight - 5) + " 입니다.");
		System.out.println("나는 저녁밥을  " + dinner + " 했습니다.");
		System.out.println("나의 좌우명은 " + mind + " 입니다.");
		
		sc.close();
	}

}
