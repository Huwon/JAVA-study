package ch06;

public class ForTes {

	public static void main(String[] args) {
		//1~10
		int sum = 0;
		for(int i = 1; i <= 10; ++i) {
			//보통은 0부터 시작이지만 1~10을 더하는게 명제이기 때문
			sum += i;   //sum = sum + i;
		//System.out.println(sum);  //테스트용, 단계별 결과가 나옴. 
		
		}
		System.out.println(sum);   //최종결과
	}

}
