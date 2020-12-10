/*	1. 3의 배수 구하는 프로그램
 * 	1.5 변수 %3 == 0
	2. 프로그램 명 : Three.java
	3. Scanner로 입력 받은 값을 %3 == 0
   int num;
	4. 조건문 true -> sysout (3의 배수가 맞습니다.)
            false -> sysout(3의 배수가 아닙니다.) 
            */

package ch06;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // ctrl + shift + 0

		System.out.println("3의 배수를 확인할 정수를 입력하세요: ");

		int num;

		num = s.nextInt(); // num은 스캐너를 통한 정수

		if (num % 3 == 0) {
			System.out.println("입력하신 숫자는 3의 배수입니다. ");
			// 변수는 뭐가 들어올지 모르겠지만 들어올 값을 3으로 나누어 봤는데 나머지가 0
		} else {
			System.out.println("입력하신 숫자는 3의 배수가 아닙니다. ");
		}

		s.close();
	}

}
