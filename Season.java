package ch06;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int month;
		
		System.out.println("월을 입력하세요. ");
		month = s.nextInt();
		
		if (month < 0) {
			System.out.println("월을 다시 입력하세요. ");
		} else if (month <= 3) {
			System.out.println("봄. ");
		}else if  (month <= 6) {
			System.out.println("여름. ");
		}else if (month <= 9) {
			System.out.println("가을. ");
		}if (month <= 12) {
			System.out.println("겨울. ");
		}
		s.close();

	}

}
