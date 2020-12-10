package ch06;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score;

		System.out.print("0이상 100이하로 점수를 입력하세요 : ");

		score = s.nextInt();

		if( score < 100 || score < 0 ) { 
			System.out.println("정상적인 학생 점수가 아닙니다.");
		}
		
		else if (score >= 80) {
			System.out.println("최우수 학생입니다."); // if는 조건을 적어줘야함
		} else if (score >= 60) {
			System.out.println("우수 학생입니다.");
		} else {
			System.out.println("일반 학생입니다. "); // else는 조건이 필요없음
		}

		s.close();

	}

}
