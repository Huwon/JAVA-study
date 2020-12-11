package ch07;

import java.text.NumberFormat;
import java.util.Scanner;

public class MallEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Member m = new Member(); // 가져다 쓰기
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// 숫자포맷바꾸기 number + ct + space
		// 한글로 설정(통화표시가 설정됨) new를 안쓰고 기울임꼴은 static

		boolean loop = true; // 무한반복, loop는 무한루프를 뜻함
		char c; // 메뉴선택:숫자는 s.nextInt(), 글자는 s.next()-String str 과 비교

		String name; // 변수-회원가입일 떄 이름 변수
		final int M_POINT = 100000; // 정회원 가입시 포인트 줌
		final int N_POINT = 500000; // 비회원 가입시 포인트 줌

		int price;
		int total;

		while (loop) { // 스캐너에 s.next만나기 전까지 무한반복함, 프로그램종료를 가장 먼저 만들것
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.회원가입(M) | 2.비회원(N) | 3.포인트 충전(C) | 4.상품구매(I) | 5.프로그램종료(Q)");
			System.out.println("-----------------------------------------------------------------------");

			System.out.print("메뉴선택 > ");
			c = s.next().charAt(0);
			// charAt이 생각안나면 위의 char c를 String으로 바꿔줌

			switch (c) {// switch- case- break-(default)
			case 'M':
			case 'm':
				// 대문자는 소문자든 다 됨. char타입이므로 '와 :사용
				// 실행내용
				if (m.isYN()) { // 회원가입이 되어 있는 상태라면 = try(if) ~ catch(else)
					System.out.println("이미 회원가입이 되었습니다. ");

				} else { // 정, 비회원가입이 안 되었을 때
					System.out.println("(정)회원가입 메뉴 선택");

					// 정회원은 이름 입력 받기
					System.out.print("이름을 입력하세요 : ");
					name = s.next();
					m = new Member("정회원", M_POINT);

					System.out.println();

					System.out.println(m.getName() + "님 회원가입을 축하합니다. ");
					System.out.println(nf.format(Member.getPoint()) + "점 포인트를 드립니다.");
				}

				break;

			case 'N':
			case 'n':
				if (m.isYN()) { // 회원가입이 되어 있는 상태라면 = try(if) ~ catch(else)
					System.out.println("이미 회원가입이 되었습니다. ");

				} else { // 정, 비회원가입이 안 되었을 때
					System.out.println("(비)회원가입 메뉴 선택");

					// 비회원으로 저장하려면 이름, 포인트, 가입여부등 여러개 저장시 객체저장
					m = new Member("비회원", N_POINT); // 생성자
					System.out.println();

					// System.out.println(m.isYN()); ->true나오게, 이 문장은 밑의 break 위에 넣을것.
					System.out.println(m.getName() + "으로 회원가입이 되었습니다. ");
					System.out.println(nf.format(Member.getPoint()) + "점 포인트를 드립니다.");
					// nf 통화설정을 위에서 했으면 숫자들어가는 부분도 변경
				}

				break;

			case 'C':
			case 'c':
				if (m.isYN()) {
					System.out.println("포인트 충전을 시작합니다");

					/* 충전 프로그래밍--- */

				} else {
					System.out.println("포인트 충전은 회원만 가능합니다. ");
					System.out.println("회원가입을 먼저 진행해 주세요. ");
				}
				System.out.println("포인트 충전을 시작합니다. ");
				break;

			case 'I':
			case 'i':
				// 계산은 필요할 떄만 하는거라 생상자 필요없음,
				if (m.isYN() == false) {
					System.out.println("상품 구입은 회원가입을 하셔야 합니다. ");
					System.out.println("회원 가입을 먼저 진행해 주세요.");
				} else {

					while (true) {
						System.out.println("상품구입을 시작합니다. ");
						System.out.println();
						System.out.print("구입할 상품 금액을 입력 > ");
						price = s.nextInt();

						// 현재 보유 포인트와 상품 금액 비교
						if (Member.getPoint() < price) {
							System.out.println("잔액이 부족합니다. ");
							System.out.println("현재 보유 잔액 : " + nf.format(Member.getPoint()));
							break;
						} else { // 잔액(total) : 포인트(point)-상품금액(price)
							total = m.buy(Member.getPoint(), price); // 결과를 표시
							Member.setPoint(total); // 위에서 계산한걸 다시 저장, 차액을 저장하는 변수

							System.out.println("상품을 구매하였습니다. ");
							System.out.println("구입한 상품 금액은 " + nf.format(price));
							System.out.println("상품 구입 후 잔액 : " + nf.format(Member.getPoint()));
						}
					}
				}
				break;

			case 'Q':
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 종료라 break 필요없음

			default:
				System.out.println("메뉴를 다시 선택해 주세요. "); // 예외처리
				System.out.println();
				break; // switch 빠져나가서 다시 무한루프 실행
			}
			System.out.println(); // 띄어쓰기 break들에 영향
		}

		s.close();

	}

}
