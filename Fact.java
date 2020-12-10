package ch06;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		long result = 1;
		int num;

		Scanner s = new Scanner(System.in);
		// 팩토리얼 : 앞의 숫자와 곱해서 결과를 더해 나가는 것
		System.out.println("임의의 정수를 입력하세요: ");
		num = s.nextInt();
		for (int i = 1; i <= num; i++) {// 정렬 알고리즘에 for 필요, 앞뒤 비교
			result *= i; // result = result * i;

		}
		System.out.print(result);

		s.close();
	}

}
