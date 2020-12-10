package ch06;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int code;

		while (true) {

			System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.종료 ");
			code = s.nextInt(); // 무한반복은 next를 만나면 멈춤.그래서 글자나오고 나서 next를 넣어줌.

			switch (code) {
			case 1:
				System.out.println("입력 프로그램이 진행됩니다. ");
				System.out.println();
				break;

			case 2:
				System.out.println("수정 프로그램이 진행됩니다. ");
				System.out.println();
				break;

			case 3:
				System.out.println("삭제 프로그램이 진행됩니다. ");
				System.out.println();
				break;

			default:
				System.out.println("프로그램을 종료합니다. ");
				System.out.println();
				System.exit(0);

			}
			System.out.println();
			s.close();
		}
	}
}



