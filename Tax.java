package ch06;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int income;
		int tax = 0; // 정수로 저장함

		System.out.print("연봉을 입력하세요(단위 : 만원) : ");

		income = s.nextInt();

		// 1= 100%
		if (income < 0) { //예외처리
			System.out.println("연봉을 다시 입력하세요. ");
			System.exit(0); // 프로그램 종료

		} else if (income <= 1000) {
			tax = (int) (income * 0.09); // income은 소수점없이 나오게 하기 위해 ()필요, 계산된 값이 tax변수에 저장.
		} else if (income <= 4000) {
			tax = (int) (income * 0.18);
		} else if (income <= 8000) {
			tax = (int) (income * 0.27);
		} else {
			tax = (int) (income * 0.36);
		}
		System.out.println("소득세는" + tax + "만원입니다");
		
		/*
		 * 글자와 변수를 이어주는 것 ()쓸경우 변수값에 문제가 생기는 경우가 있음. 변수 초기화하라는 뜻 또는 초기값을 넣어라 
		 */

		s.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

	}

}
