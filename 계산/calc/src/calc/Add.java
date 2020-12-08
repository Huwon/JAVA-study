/*
 * 작성일 : 2020.07.02
 * 작성자 : 홍길동
 * 작업내용 : 더하기 프로그램
 */
package calc;

/*접근제한자 public, private, protected, default*/

public class Add {
	/*
	 * 곱하기 기능(메소드) public int mul() int num1, num2, result; result = 1 * 2; return
	 * result;
	 */
	/* class 1.필드(멤버변수) 2.메소드() */
	/* 메소드만들 때 규칙-접근. static=공유,누적(같이 쓰거나 앞에 값에 누적할때) . void=return타입x, 메소드명() */
	// 변수초기화:메모리에 숫자 저장할 거라고 알려주는 것.
	// 정수(int,-,+), 소수(부동소수)(float, double-주로사용)
	// 한글자(char), 여러글자(String) ->정수, 더블,스트링 중심

	public static void main(String[] args) {
		int num1; // 메모리 할당만 한것(숫자가 정해지지 않음)(설정+초기값)
		int num2;
		int result;

		num1 = 100; // 초기화
		num2 = 200;

		result = num1 + num2; // 1과 2를 더해서 결과를 내시오, result라는 메모리에 저장된 것, sysout로 출력
		System.out.println(result); // 변수는 " 하면 안됨(변수는 num같은 것들)
		// 같다 : == (메모리 주소가 같다), 값이 같다:equals, 같지않다 : !=, 나머지값을 구하는 것:1%2->1(안나눠지면그 값이
		// 그대로 나옴)
		// =:오른쪽에 있는 값을 왼쪽에 저장
		// 숫자가 저장될 공간을 만들어 주면서 거기에 100을 넣는것(숫자는 "안씀)=초기화
		// 100이라는 숫자를 넘버링에서 넣었다(컴은 뒤에서-오른쪽부터 읽어야함)
		// 데이터타입변수명= 초기값
		// TODO Auto-generated method stub

	}

}
