/*
 * 	작성일 : 2020.07.03
 * 	작성자 : 홍길동
 * 	작성내용 : boolean 타입 연습(수도가 맞는지 확인하기)
 */

package ch05;

import java.util.Scanner;

public class Metro {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 스캐너를 사용할거다. //입출력(I/O)은 닫아줘야 함
		// 변수 생성하기
		boolean isCapital; // 메모리할당(준비)
		int citizens; // 메모리할당(준비)

		System.out.print("거주하는 곳이 서울이면 1 아니면 0 입력 : ");

		isCapital = (s.nextInt() == 1) ? true : false;
		// 짧은 if
		// 스캐너 통해서 숫자(1) 받았는데 만약에 1이면 true 아니면 false로 isCapital에 저장
		// 분기문 : 만약애 ~ 조건을 만족하면 ? 바로 뒤 아니면 콜론 뒤에

		// System.out.println(isCapital);

		System.out.print("거주하는 곳의 인구 수를 입력(단위 : 천만) : ");
		citizens = s.nextInt();

		/*
		 * 논리연산자 : shift &&(and)-조건을 다 만족해야 할때 , shift //(or)- 조건 중에 하나라도 만족하면 참
		 */
		// 만약 ~ 면
		if (isCapital == true && citizens >= 1) // 여기서 1은 위에서 설정한 천만, >=은 이상 <=은 이하 >는 초과 <는 미만
		{
			System.out.println("수도가 맞습니다. ");
		}
		// 아니면
		else {
			System.out.println("수도가 아닙니다. ");
		}

		s.close();

	}

}
