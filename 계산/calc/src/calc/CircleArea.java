package calc;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final double PI = 3.14;
		double radius;
		double area;

		System.out.print("원의 반지름 입력 : ");
		radius = s.nextDouble(); // 소수점이 들어감. 10입력해도 10.0(더블이라)

		area = PI * radius * radius; // 왼쪽에서부터 곱해짐
		System.out.print("원의 면적 : " + area);

		s.close();

	}

}
