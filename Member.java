package ch07;

public class Member {
	// 1.필드 - private: 변수(회원이름-문자열, 포인트-연산작업, 회원가입 여부-t/f)

	private String name; // 처음값이 굳이 필요없는 경우에 초기화-입력할때 값이 저장되게
	private static int point; // 즉 회원가입하기 전까지 아무것도 없게 하는 것, static을 써야 공유되도록
	private boolean isYN = false; // 회원가입 전까지는 무조건 f로 시작

	/*
	 * 2.생성자 : 클래스 이름과 동일 //디폴트생성자(), 생성자(파라미터1), 생성자(파라미터1, 파리미터2)-생성자 오버로딩(똑같은 메소드
	 * 사용, 파라미터 개수가 다른 것)
	 */

	public Member() {
	} // 전체적인 생성자 만들어줘야 가져다 쓸 수 있음

	public Member(String name, int point) {
		// 만약에 (정,비)회원가입을 누른다면, 이름을 넣는다면
		// 누르는 순간에 회원 구분에 상관없이 이름과 포인트도 함께
		// 필드에서 저장되는 것, 그렇기에 필드와 생성자의 구분이 필요, 그래서 왼쪽(저장하는 것)에 무조건 this
		this.name = name;
		this.point = point; // 클래스변수-클래스이름을 앞에 붙이면 클래스 변수가 됨
							// 클래스.변수 = Member.point => new사용해도 됨
		this.isYN = true;
	}

	// 3.캡슐화 : getter(출력), setter(저장)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getPoint() {
		return point;
	}

	public static void setPoint(int point) {
		Member.point = point;
	}

	public boolean isYN() { // boolean은 get, set이 안붙음.
		return isYN;
	}

	public void setYN(boolean isYN) {
		this.isYN = isYN;
	}

	// 4.필요한 동작이 있다면 메소드() 만들어서 사용
	// 상품 구입하면 계산하는 메소드(생성자 아님)
	// 접근제한자 리턴타입(결과) 메소드명(매개변수)

	public int buy(int point, int price) {
		// 잔액(total) : 포인트(point)-상품금액(price)
		// int total = point - price;
		// return total; //정수쓸 꺼면 임시로 정수넣으면 됨(실수, 글자 동일)

		return (point - price); // 결과를 표시해 주세요.

	}

}
