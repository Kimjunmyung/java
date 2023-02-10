package 조건문;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class IF문4 {
	public static void main(String[] args) {
		int hour = 15;
		
		if (hour < 11) {
			System.out.println("굿모닝");
		}else if (hour <14) {
			System.out.println("굿이브닝");
		}else if (hour < 20) {
			System.out.println("굿 나잇");
		}
		
		
		int month = 2;
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 511:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}
}
