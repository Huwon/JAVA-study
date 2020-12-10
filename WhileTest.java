package ch06;

public class WhileTest {

	public static void main(String[] args) {
		// while 변수 초기화
		int i = 1; // 1번부터 시작함
		int sum = 0;
		while (i <= 100) {
			// ()조건이 틀렸을 때 까지 반복하겠다

			// 증감값 : i ++ ;
			sum += i; // sum = sum + i;

			i++;
		}
		System.out.println(sum);

	}

}
