package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lastYear = new String[3];
		String[] thisYear = new String[3];
		int count = 0;
		for (int i = 0; i < lastYear.length; i++) {
			System.out.print("작년에 가고싶었던 여행지를 입력하세요.");
			lastYear[i] = sc.next();
			System.out.print("올해에 가고싶었던 여행지를 입력하세요.");
			thisYear[i] = sc.next();
		if (lastYear[i].equals(thisYear[i])) {
			count++;
		}
		}
		System.out.println("작년과 올해 가고 싶은 곳이 동일한 곳은 " + count + " 입니다");
		sc.close();
	}

}
