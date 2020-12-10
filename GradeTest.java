/*1. GradeTest.java
2. Scanner
3. int score;
  char grade;
4. 90이상이면 A(등급)
   80이상이면 B(등급)
   70이상이면 C(등급)
   나머지는 F(등급)
5.sysout("입력하신 학점의 등급은" + grade + "입니다"); */

package ch06;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int score;
		char grade;

		System.out.print("학생 점수를 입력하세요(0~100) : ");
		score = s.nextInt(); // 나누기를 통해서 점수 표기(80점이 아닌 88점이 나와도)

		switch (score / 10) {// 나누기 10을 해서 정수로 표현
		case 10: //
		case 9:
			grade = 'A';
			System.out.println(grade);
			break; //중괄호를 찾아가기 때문에 sysout을 중괄호 밖에서 한번만 써줘도 됨
		/*9와 10이 나와도 A등급이기에 복합적으로 처리하기 위해서는 
		  break없이 case사용하면 위의 조건을 모두 실행 */
		case 8:
			grade = 'B';
			break;
			
		case 7:
			grade = 'C';
			break;
			
		default:
			grade = 'F';
			break;
		} 
		System.out.println("학생 등급은" + grade + "입니다. ");

		s.close();

	}

}
