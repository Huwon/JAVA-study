package ch05;

public class Oper {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		int result;
		result = ++num1 + num2++; // 단항 연산자
		System.out.println(result);
		/*
		 * 결과가 1이 나옴. 연산자가 뒤에 붙느냐 앞에 붙느냐에 차이가 있음. ++num은 증가가 된 상태에서 num1이 저장된거고 뒤의 num는
		 * 현재값 0을 그대로 사용하고 나중에 증가가 됨. System.out.println(num2); 로 하면 1이 나옴
		 */

	
	}

}
