/*1. 학생 등급 관리 프로그램 : Grade.java
2. Scanner 로 점수(~100), 학년(1~4학년)을 입력받음
3. 점수가 60점 이상이고 4학년이 아니면 합격
            4학년이면서 70점 이상이면 합격
           아니면 불합격
   점수가 60점 미만이면 불합격
   */

//연속적인 if 문

package ch06;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("학생점수를 입력하세요(1~100) : ");
		int score = s.nextInt();

		System.out.println("학년을 입력하세요(1~4) : ");
		int year = s.nextInt();

		if (score >= 60) { // 필수 합격 조건

			if (year != 4) { // 1,2,3학년인 경우
				System.out.println("합격!! ");
			} else if (score >= 70) {
				System.out.println("합격 ");
			} else {
				System.out.println("불합격. ");

			}
		} else { // 60이 아니면, else는 조건 꼭 안적어도 됨
			System.out.println("불합격 대상입니다. ");
		}

		s.close();
	}

}
