package 제어문문제;

import java.io.Closeable;
import java.util.Scanner;


public class 인기투표시스템 {
	public static void main(String[] args) {
		//인기투표
			Scanner sc = new Scanner(System.in);
		
			int iu = 0;
			int bts = 0;
			int njs = 0;
			
			
			System.out.println("인기투표 시스템");
			System.out.println("======================");
			while (true) {
				System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료");
				int data = sc.nextInt();
				if (data == 1) {
					iu++;
				}else if(data == 2) {
					bts++;
				}else if(data == 3) {
					njs++;
				}else if(data == 4 ) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			sc.close();
			
			System.out.println("-----------------------");
			System.out.println("아이유" + iu + "명");
			System.out.println("bts" + bts + "명");
			System.out.println("뉴진스" + njs + "명");
			System.out.println("-----------------------");
	}
			
}
