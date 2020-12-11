package game;

import java.util.Scanner;

public class GamePlayer {
	// 필드, 생성자, getset, 메소드

	private String playerName;
	private String word;
	Scanner s = new Scanner(System.in);

	// 생성자를 이용해서 사용자 이름 입력 받기
	public GamePlayer() {
	}

	public GamePlayer(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	// 이름 > 단어 입력받는 것 -입려된 인원수만큼
	public String getWordFromYou() {
		System.out.println(playerName + ">");
		setWord(s.next()); // 스캐너 통해서 입력을 받지만 word에 저장하도록 할것

		return getWord(); // 입력한 단어를 호출하는 것으로 전달
	}

	public boolean chkWord(String lastWord) {
		// 앞 단어의 끝글자와 입력한 단어의 첫 글자 비교-비교값 넣어줘야함(String lastWord)
		int lastIdx = lastWord.length() - 1;
		if (lastWord.charAt(lastIdx) == getWord().charAt(0))
			return true;
		else
			return false;
		// 실행class에서 for 통해 출력해주면 됨
	}

}
