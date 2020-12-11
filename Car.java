package ch07;

class CarOption {
	private int speedUp;
	private String color;

	CarOption(int i, String msg) { // 프로그램 실행시 생성자 먼저 실행
		System.out.println("msg");
		System.out.println(i);

	}

	CarOption(int i, String name, String msg) {
		System.out.println(i + "/" + name + "/" + msg);

	}

	public int getSpeedUp() {
		return speedUp;
	}

	public void setSpeedUp(int speedUp) {
		if (speedUp < 0) {
			speedUp = 0;
		}
		this.speedUp = speedUp; // this는 현재 내 페이지에 변수
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color.trim(); // 좌우 공백을 없애는 메소드)
	}

	// 생성자 오버로딩-클래스와 이름은 동일하나 구조가 다르면 여러 생성자 가능

}

public class Car {

	public static void main(String[] args) {
		CarOption co = new CarOption(1001, "홍길동", "객체가 생성되면 (사용) 제일 먼저 화면에 표시");

		co.setSpeedUp(100); // 저장
		co.setColor("Red");
		System.out.println(co.getSpeedUp()); // 출력
	}

}
