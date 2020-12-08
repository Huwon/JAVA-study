package ch05;

public class Casting {

	public static void main(String[] args) {
		// 정수형 결과 : int result
		// 실수형 결과 : double resultDouble; (줄여서 resultDbl도 가능)

		int result;
		double resultDouble;

		result = 3 / 2; // 우리가 생각할때 결과는 1.5지만 result는 정수만 가능해서 소수점을 땜. 1이라 나옴
		System.out.println(result);

		resultDouble = 3 / 2; // 더블이지만 정수를 정수로 나눠서 정수만 나옴. 1.0이라 나옴
								// 3.0과 2.0으로 넣거나 (double)3 / (double)2; 로 하면 1.5가 나옴. 더블은 한쪽에만 붙여도 됨
								// 형 변환(원래 있던 타입에서 잠시 형태를 변환해야 하는 경우)
		System.out.println(resultDouble);

		result = (int) 1.5 + (int) 1.5;
		System.out.println(result);
		// 숫자가 오류가 뜰 경우 정수형태로 변환할 것 (int)1.5 + (int)1.5; 로 변환하면 됨

		result = 3 / 2; // 몫
		System.out.println(result);

		result = 1 % 2; // 나머지
		System.out.println(result);

	}

}
