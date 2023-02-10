package 배열;

import javax.jws.Oneway;

public class 배열실습 {
	public static void main(String[] args) {
		
		int[] week = {2,2,3,1,2,0,0}; 
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println(week.length);
		
		week[2] = 10;
		week[4] = 12;
		
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		
		int[] tour = new int[4];
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		System.out.println(tour.length);

		
	}
}
