package ch06;

public class Arr {

	public static void main(String[] args) {
		// 배열 = 회원정보 , String을 여러개 만듬, 배열에는 [], for 꼭 필요
		String str[] = { "green", "1234", "홍길동", "010-123-4567" };
		// str은 string, {}는 여러개를 쓰겠다.
		// []는 순서번호를 입력.for을 통해 간단하게 입력할 수 있다.

		System.out.println("일반 for로 출력. ");

		/*
		 * 배열은 객체 for 초기값 설정을 뭐부터해야할지 모르겠다면 0부터 설정값은 실제 숫자를 주면 안됨(주면 하드코딩)-추가될때마다
		 * 수정해줘야함, lenght(배열개수)를 넣으면 알아서 숫자세줌.여기서는 ()없음. 메소드가 아니기때문 출력할때 (str[i])초기화값에
		 * 해당되는 변수를 적어주면 출력됨
		 */
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("........................");
		
		System.out.println("향상된 for로 출력");

		// for(데이터 타입 변수명 : 배열명)
		// 향상된 for는 index번호를 사용하지 않음.

		for (String s : str) {
			System.out.println(s);
		}
	}

}
