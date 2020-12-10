package ch06;

public class CharAt {

	public static void main(String[] args) {
		String email = "green@green.co.kr"; // String: 기본타입, 객체타입
		// String 객체는 배열 - for가 반드시(배열은)
		int count = 0; // @ 개수 체크하는 변수 , count는 cnt로 줄여쓸 수 있음
		// 배열의 초기화는 무조건 0부터

		for (int i = 0; i < email.length(); i++) { // email.lenght()주소의 개수를 세는 것

			if (email.charAt(i) != '@') // charAt애서 나오는 index는 i, @찾기
				continue; // 밑에꺼 실행시키지 말고 건너뛰기 즉. @아니면 갯수올리지 마라

			count++; // 결과값은 @이가 1기 때문에 1이 나옴

		}

		if (count < 1) { // @가 하나도 없으면
			System.out.println("사용하실 수 없는 이메일 형식입니다.\n다시 입력해 주세요. ");

		} else {
			System.out.println("사용하셔도 좋습니다. ");
		}

	}

}
