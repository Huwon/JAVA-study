package calc;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int salary, deposit;
		System.out.print("급여를 입력하세요 : ");
		salary = s.nextInt();

		deposit = 10 * 12 * salary;
		System.out.printf("10년간의 저축액은 : %d\n", deposit);
		
		s.close();

	}

}
