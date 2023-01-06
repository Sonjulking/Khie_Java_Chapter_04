package khie;

import java.util.Scanner;

/*
 *[문제2] 이름과 국어점수, 영어점수, 수학점수, 자바점수를 키보드로 입력을 받아서 성적을 처리해보세요. 각 과목의 점수와 
 *총점, 평균, 학점을 화면에 출력해 주세요. 
 */

public class IfElseIfExam_14 {

	public static void main(String[] args) {

		// 1.키보드 준비 작업
		Scanner sc = new Scanner(System.in);

		// 2-1. 키보드로 이름을 입력을 받자.

		System.out.print("이름을 입력해주세요. >>> ");
		String name = sc.next();
		// 2-2 키보드로 과목 점수들을 입력받자.
		System.out.print("국어점수를 입력해주세요. >>> ");
		int korScore = sc.nextInt();

		System.out.print("영어점수를 입력해주세요. >>> ");
		int engScore = sc.nextInt();

		System.out.print("수학점수를 입력해주세요. >>> ");
		int mathScore = sc.nextInt();

		System.out.print("자바점수를 입력해주세요. >>> ");
		int javaScore = sc.nextInt();

		// 3. 총점을 구하자. : 각 과목 점수를 더해주면된다.
		int totalScore = engScore + korScore + javaScore + mathScore;

		// 4. 평균을 구하자. 평균 = 총점 / 과목수
		int averageScore = totalScore / 4; // 실수 처리를 안했네요... ㅠㅠ

		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("국어점수 : " + korScore + " 점");
		System.out.println("영어점수 : " + engScore + " 점");
		System.out.println("수학점수 : " + mathScore + " 점");
		System.out.println("자바점수 : " + javaScore + " 점");

		System.out.println("총점 : " + totalScore + " 점");
		System.out.println("평균 점수 : " + averageScore + " 점");

		// 5.학점은 평균을 구하고 다중 if ~ else문으로 처리함.
		if (averageScore >= 90) {
			System.out.println("A학점");
		} else if (averageScore >= 80) {
			System.out.println("B학점");
		} else if (averageScore >= 70) {
			System.out.println("C학점");
		} else if (60 <= averageScore) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

		// 6.한꺼번에 성적정보를 출력을하자.
		sc.close();

	}

}
