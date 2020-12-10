package ch06;

public class Loop {

	public static void main(String[] args) {
		//for 한번 쓰는건 1차원 -선
		//for 두번 쓰는건 2차원 - 면
		for(int j = 2; j < 10; j++) {
			
			for(int i = 1; i < 10; i++) {
				System.out.println(j+"*"+i+"="+j*i);
			}
			System.out.println(); //10번 나오면 줄바꿈
		}
	}

}
