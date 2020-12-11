package game;

import java.util.Random;
import java.util.Scanner;

public class GameAction {
	// GamePlayer에서 가져와야함-게임참여자 인원수 입력

	Scanner s = new Scanner(System.in);
	GamePlayer[] gamePlayer; // 전역변수로 선언만 한것
	String[] startWord = { "부산", "과일", "가을", "취업", 
			"컴퓨터", "사전", "독서", "가수", "노래", "사람인" }; // 랜덤알고리즘 사용하기 위함

	long seed = System.currentTimeMillis();
	Random rnd = new Random(seed);
	// 랜덤 통해 위희 startWord의 idx번호 만들어야함
	// seed를 넣어 최대한 중복이 안되게 - 현재시간을 초로 계산

	int idx = rnd.nextInt(10);
	// 10개 중에서 하나의 숫자(인데스번호)를 골라냄

	public GameAction() {
		run();
	}

	public void createAuser() {// 게임 참여자 생성
		System.out.print("게임에 참여할 인원수를 입력하세요(숫자) > ");
		int cntPlayer = s.nextInt();
		gamePlayer = new GamePlayer[cntPlayer];
		// 입력한 인원수만큼

		for (int i = 0; i < cntPlayer; i++) {// GamePlayer.java가 입력한 인원수만큼 생성됨
			System.out.print("게임참가자 이름 > ");
			String userName = s.next();
			gamePlayer[i] = new GamePlayer(userName);
		}
		System.out.println();

	}

	public void run() {
		System.out.println("끝말잇기 프로그램을 실행합니다.");
		createAuser();
		
		String lastWord = startWord[idx];
		
		System.out.println("끝말잇기 프로그램을 시작합니다.");
		System.out.println("처음제시되는 단어는" + lastWord + "입니다.");
		
		//생성한 객체(인원수)만큼 반복을 하되 틀리면 종료
		int userNum = 0;
		while(true) {
			String startWord = gamePlayer[userNum].getWordFromYou();
			userNum++;
			
			//어떤 user가 들어오는지는 모르겠지만 마지막단어를 확인해서 틀리면 끝
			// if(gamePlayer[userNum].chkWord(lastWord)==false) 
			if(!gamePlayer[userNum].chkWord(lastWord))
			 {
				 System.out.println("틀렸습니다.");
				 System.out.println(gamePlayer[userNum].getPlayerName()+"님이 틀렸습니다.");
				 
				 break;
			 }
			
			//나머지를 생성해서 다음 사람에게 순서 넘기기
			userNum++;
			userNum = userNum % gamePlayer.length;
			lastWord = startWord; //마지막단어가 다음사람에게는 첫번째단어가 되도록 무한반복
			
		}
	}

}
