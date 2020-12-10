/*	1.SwitchTest.java
 	switch ~ case ~ break ~ (default=else)
	2. Scanner
	1-> "하나"
	2-> "둘"
	3-> "셋"
	4이상이면 "많음" + 시스템 종료 */

package ch06;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("임의의 정수를 입력하세요. ");

		int num = s.nextInt();

		switch (num) {
		case 1:
			System.out.println("하나 ");
			break;
		// :뒤에는 내용이 더 있음. 재확인 필요
		case 2:
			System.out.println("둘 ");
			break;
		case 3:
			System.out.println("셋 ");
			break;
		default: // 만약에 =else, 조건이 필요없음.
			System.out.println("시스템을 종료합니다. ");
			System.exit(0);
			
			break;

		}

		s.close();
	}

}
