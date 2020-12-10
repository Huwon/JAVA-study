package ch06;

public class DoWhile {

	public static void main(String[] args) {
		/*a(b)~z출력하는 예제-while : a로 시작하지만 출력은 b부터
		char c = 'a';  //int i = 0;과 같음. 글자인 char잡은 것 뿐
		               //초기화 char에 연산이 가능
		while(c <= 'z') { //char이 아닌 string을 쓰면 오류가 남.
			c = (char) (c + 1);   //c에 1을 더한것을 글자로 바꿔 c에 넣으시오. 형변환 
			System.out.println(c);
			
		}*/
		char c = 'a';
		do {
			System.out.println(c);
			c = (char) (c + 1);
		}while(c <= 'z');
		
		
		
		//a~z출력하는 예제-do~while

	}

}
