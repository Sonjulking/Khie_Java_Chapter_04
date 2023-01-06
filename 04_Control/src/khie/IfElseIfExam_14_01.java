package khie;

import java.util.Scanner;

public class IfElseIfExam_14_01 {

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
		// 3.총점을 구하자.
		int totalScore = engScore + korScore + mathScore + javaScore;

		// 4.평균을 구하자.
		// double averageScore = totalScore / 4.0; // 주의해야됌... 실수형으로 계산해야된다.
		double averageScore = (double) totalScore / (double) 4; // 주의해야됌... 실수형으로 계산해야된다.

		String grade;

		if (averageScore >= 90) {
			grade = "A학점";
		} else if (averageScore >= 80) {
			grade = "B학점";
		} else if (averageScore >= 70) {
			grade = "C학점";
		} else if (60 <= averageScore) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("국어점수 : " + korScore + " 점");
		System.out.println("영어점수 : " + engScore + " 점");
		System.out.println("수학점수 : " + mathScore + " 점");
		System.out.println("자바점수 : " + javaScore + " 점");

		System.out.println("총점 : " + totalScore + " 점");
		System.out.printf("평균 점수 : %.2f점\n", averageScore); // 2자리까지 잘라주기.
		System.out.println("학점 : " + grade);

		sc.close();
	}

}
