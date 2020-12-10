package ch06;

public class GuGu {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			if (i % 3 == 0)
				continue; // 3의 배수 건너띄기:끝까지 실행은 됨
			// 2단~9단, i++은 한단씩 증가라는 의미
			for (int j = 1; j <= 9; j++) {
				// i가 한번 돌때 j는 9번 작동됨
				System.out.println(i + "X" + j + "=" + (i * j));
				if (j % 4 == 0)
					break; // 4의 배수가 나오면 끊기:끝까지 실행 안됨

			}
			System.out.println(); // 단별로 띄어쓰기
		}

	}

}
