/*
 * 작성일:2020.07.02
 * 작성자:홍길동
 * 작업내용: Scanner를 이용한 더하기 프로그램 
 */

package calc;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// new: 인스턴트화(객체화)(class를 가져다 쓰는 것)
		// Scanner s = new Scanner(System.in); 사용할 준비가 된 상태

		int num1, num2; // 정수를 저장할 변수
		int result; // 저장공간 만든것

		System.out.print("더하기 할 첫번째 숫자를 입력하세요 :"); // 숫자를 연달아 입력하기 위해 print로 이용
		num1 = s.nextInt(); // 소문자 s는 스캐너를 뜻

		System.out.print("더하기 할 두번째 숫자를 입력하세요 :");
		num2 = s.nextInt();

		result = num1 + num2;
		System.out.println("두 수의 합은 " + result + "입니다.");
		// + : 앞 뒤로 숫자가 아니면 붙여나옴(숫자와 글자를 붙일때 쓰는 것)
		//"글자 " 뒤에"앞에 띄어쓰기를 하면 문장이 자연스러워짐.
		
		s.close();
	}

}

//run하고 console 에서 숫자를 입력하면 값이 나옴
