package ch07;

public class Student {
	// 1. 필드-학번은 자동으로 생성(int):0으로 시작하는 숫자는 x(아예0은 가능)-10000, 무조건 private
	private static int stdID = 10000; // 자동생성
	private String stdName; // 직접입력

	// 2. 생성자 - 클래스이름과 동일
	public Student() {
	} // 디폴트 생성자 무조건 생성

	public Student(String stdName) { // 매개변수 무조건 왼쪽에 this
		this.stdName = stdName;
		this.stdID = this.stdID + 1; // 또는 ++this.stdID; 학번 1개씩 증가 자동생성
	}

	public void showinfo() { // 여러번 쓰게 될 동작을 한번만 입력해서 적용-void=내용이 sysout
		System.out.println("학번 :" + this.getStdID());
		System.out.println("이름: " + this.getStdName());
	}

	// 3. getter, setter
	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	// 4. 메소드-동작(생략가능)
}
